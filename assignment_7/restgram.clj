; restgram.clj     Gordon S. Novak Jr.          ; 26 Apr 19

; Natural Language Access to Restaurant Database

; (ask '(show me a good italian restaurant in palo alto))
; (ask '(where can i get ice cream in berkeley))
; (ask '(show me chinese restaurants rated above 2.5 in los altos))

; Note: lexicon parts-of-speech must be disjoint from grammar nonterminals.

; The lexicon restlex.lsp defines: restaurant kindfood city county area street

(def lexicon
 '((a/an     (a an some))
   (i/you    (i you one))
   (get      (get find obtain))
   (quality  ((good 2.5) ))
   (restword (restaurant (restaurants restaurant)))
   (kindfood (american bakery chinese ice-cream))
   (city     (palo-alto berkeley))
   (county   (santa-clara))
   (area     (bay-area))
   (street   (el-camino-real))
   ))

; Define grammar after defining lexicon.
; upper-case and lower-case are the same to Lisp.

(def grammar

'((command  ->  (show me) true)
  (command  ->  (tell me) true)
  (command  ->  (what is) true)
  (qual     ->  ((quality))      (restrictb '>= 'rating $1))
  (qualb    ->  (rated above (number))   (restrictb '>= 'rating $3))
  (resttype ->  ((kindfood))     (restrict 'foodtype $1))
  (loc      ->  (in (city))      (restrict 'city $2))
  (loc      ->  (in (county))    (restrict 'county $2))
  (s -> ((command) (a/an)? (qual)? (resttype)? (restword) (qualb)? (loc)?)
        (retrieve 'restaurant) )
; (retrieve 'streetno) (retrieve 'street) (retrieve 'rating)
  (s -> (where can (i/you) (get) (qual)? (resttype)? food ? (loc)?)
        (retrieve 'restaurant))
  (s -> (how many (qual)? (resttype)? food ? (restword) (loc)?)
    (do (retrieve 'restaurant) (postpr '(length (quote $$)))) )
; (retrieve 'streetno) (retrieve 'street) (retrieve 'rating)
))

