; gramcom.clj           Gordon S. Novak Jr.                 29 Apr 19

; Grammar compiler for Clojure

(def dolvars '($1 $2 $3 $4 $5 $6 $7 $8 $9 $10 $11 $12 $13 $14 $15 $16))

; produce code for a rule item.  Item could be a word, (category), (nonterminal)
(defn itemcode [item]
  (if (cons? item)
      (if (or (cat? (first item))
              (= (first item) 'number))
          (list 'wordcat (kwote (first item)))
          item)
      (list 'and (list '= 'atnword (kwote item)) 'atnword)))


; produce code for a rule.  Result is code list.
(defn rulecode [lst sem n]
  (if (empty? lst)
      sem
      (let [dv (nth dolvars n)
            itemc (itemcode (first lst))
            qst (and (not (empty? (rest lst)))
                     (= (second lst) '?))
            restcode (rulecode (if qst (rest (rest lst)) (rest lst))
                               sem (+ 1 n))
            cd
             (cons (if (or (empty? (rest lst))   ; test end of grammar list
                           (and qst (empty? (rest (rest lst)))))
                       (if (and (cons? (first lst))
                                (nonterm? (first (first lst))))
                           (list 'do (list 'success) restcode)
                           (list 'do (list 'nextword) (list 'success) restcode))
                       (if (and (cons? (first lst))
                                (nonterm? (first (first lst))))
                           restcode
                           (list 'do
                                 (if qst
                                     (list 'if dv (list 'nextword))
                                     (list 'nextword))
                                 restcode)))
                   (if qst nil (list (list 'fail)))) ]
         (list 'let [dv itemc]
               (if qst
                   (first cd)
                   (cons 'if (cons dv cd)))) ) ) )

; compile one grammar rule to a function
; rule is (nonterm -> (list of items) semantics)
; returns function name
(defn rulecom [rule name]
  (let [code (list 'defn name '[] (list 'saveptr)
                   (rulecode (nth rule 2) (nth rule 3) 0))  ]
    (eval code)
    name ))

; compile a rule and print the result
(defn rulecompr [rule name]
  (let [code (list 'defn name '[] (list 'saveptr)
                   (rulecode (nth rule 2) (nth rule 3) 0))  ]
    (println code)
    name ))

; compile a subrule for a nonterminal.  Returns list of subrule name.
(defn gramcoms [rule]
  (let [name (gensym (first rule))]
    (rulecom rule name)
    (list name) ))

(defn rulesfor [lst nonterm]
  (mapcat (fn [x] (if (= (first x) nonterm) (list x) '()))
          lst))

; compile the first rule in a list (unless in prev) and all with same name
(defn gramcomb [lst prev]
  (if (not (empty? lst))
      (if (member (first (first lst)) prev)
          (gramcomb (rest lst) prev)
          (let [rules (rulesfor lst (first (first lst))) ]
            (if (empty? (rest rules))
                (rulecom (first lst) (first (first lst)))
                (let [subrs (map gramcoms rules)
                     code (list 'defn (first (first lst)) '[]
                                (cons 'or subrs))]
                  (eval code)))
            (gramcomb (rest lst) (cons (first (first lst)) prev)) ) ) ) )

(defn gramcom [lst]
  (map (fn [x] (eval (list 'defn (first x) '[] nil))) lst)
  (gramcomb lst '()))
