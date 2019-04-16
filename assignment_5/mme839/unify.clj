; unify.clj              16 Oct 18; 29 Mar 19; 01 Apr 19; 03 Apr 19; 05 Apr 19

;(load-file "nav.clj")

(defn occursl [var lst])   ; stub

(def backchtr nil)   ; flag to trace backch

(defn occursz [var term]
  (if (cons? term)
      (occursl var (rest term))
      (= var term)))

(defn occursl [var lst]
  (if (empty? lst)
      nil
      (or (occursz var (first lst))
          (occursl var (rest lst)))) )

; unify variable and term
(defn varunify [term var subs]
  (and var subs (symbol? var)
       (not (occursz var term))
       (cons (list var term) (subst term var subs))))

(defn unifyb [u v subs])  ; signature

; unify lists of arguments
(defn unifyc [args1 args2 subs]
  (if (empty? args1)             ; if args1 is empty
      (if (empty? args2)
          subs)   ; if args2 is empty return subs, else fail
      (and args2 subs
	   (let [newsubs (unifyb (first args1) (first args2) subs)]
             (if newsubs
                 (unifyc (sublis newsubs (rest args1))
                         (sublis newsubs (rest args2))
                         newsubs))) ) ) )

; unify terms if possible.  Result is a substitution list, or NIL if failure.
(defn unifyb [u v subs]         ; unification works if:
  (and subs
       (or (and (= u v) subs)         ; identical vars
           (varunify v u subs)        ; u is a var
           (varunify u v subs)        ; v is a var
           (and (cons? u) (cons? v)   ; both functions
                (= (first u) (first v))  ;    with same function name
                (unifyc (rest u) (rest v) subs)) ) ) )   ; and args unify

; Unify literals u and v, assumed initially to have no variables in common.
; Result is a substitution alist ending in ((T T)), suitable for sublis,
; or NIL if unification fails.
(defn unify [u v] (unifyb u v '((t t))))

(defn unify-test [u v]
  (let [subs (unify u v)]
    (if subs
	(if (= (sublis subs u) (sublis subs v))
	    subs
	    (list 'error u v subs)))))

; (unify-test '(p x) '(p (a)))
; (unify-test '(p (a)) '(p x))
; (unify-test '(p x (g x) (g (b))) '(p (f y) z y))
; (unify-test '(p (g x) (h w) w) '(p y (h y) (g (a))))
; (unify-test '(p x (h (a)) (f x)) '(p (g y) y z))
; (unify-test '(p (f x) (g (f (a))) x) '(p y (g y) (b))) ; = nil
; (unify-test '(p x) '(p (a) (b)))                       ; = nil
; (unify-test '(p x (f x)) '(p (f y) y))                 ; = nil

; find all vars in a clause
(defn clausevars [clause]
  (if (empty? clause)
      nil
      (union (vars (first clause))
             (clausevars (rest clause)))) )

; separate a clause based on a goal predicate so that the two have
; no variables in common.  Returns a new clause, or the original.
(defn sepclause [clause goal]
  (let [commonvars (clausevars clause)]
    (if commonvars
        (sublis (map (fn [x] (list x (gensym))) commonvars)
                clause)
        clause) ))

; combine substitutions
(defn combinesubs [newsubs subs]
  (if (empty? newsubs)
      subs
      (if (= (first newsubs) '(t t))
          subs
          (if (empty? (assocl (first (first newsubs)) subs))
              (combinesubs (rest newsubs)
                           (cons (first newsubs)
                                 (sublis (list (first newsubs)) subs)))
              (combinesubs (rest newsubs) subs) ) ) ) )

(defn backch [goal rules] )   ; stub
; try to backchain on the conjunction of goals given rules and substitutions
(defn backchand [goals rules subs]
  (if (empty? goals)
      (or subs '((t t)))
      (let [newsubs (backch (first goals) rules)]
        (if newsubs
            (backchand (sublis newsubs (rest goals))
                       rules
                       (combinesubs newsubs subs)) ) ) ) )

(def backchn 0)

(defn indent [n]
  (when (> n 0)
    (print "  ")
    (indent (- n 1)) ) )

; backch should return only subs for vars in the goal.
(defn backch [goal rules]
  (when backchtr
    (indent backchn)
    (println backchn "backch " goal))
  (def backchn (+ backchn 1))
  (let [res 
         (some (fn [rule]
                   (if (= (first goal) (first (first rule)))
                       (let [newrule (sepclause rule goal)]
                            (let [subs (unify goal (first newrule))]
                                 (and subs
                                      (backchand (sublis subs (rest newrule))
                                                 rules subs) ) ) ) ) )
               rules)]
      (when backchtr
        (indent backchn)
        (println backchn "      = " res))
      (def backchn (- backchn 1))
      res))

; backchain, return goal with substitutions.
; (backchtop '(grandparent r (harmonia)) harmo)
(defn backchtop [goal rules]
  (let [subs (backch goal rules)]
    (and subs (sublis subs goal)) ) )

(defn backchfr [goal facts rules] (backchtop goal (append facts rules)))

(defn newsublis [alist form]
  (let [binding (assocl form alist)]
    (if binding
        (second binding)
        (if (cons? form)
            (cons (newsublis alist (first form))
                  (newsublis alist (rest form)))
            form) ) ) )

(defn fnfor [name args goal facts rules]
  (let [sol (backchtop goal (append facts rules))]
    (if sol
        (let [rev (reverse (rest sol))
              subs (map (fn [x] (list (list x) x)) args)
              fn  (list 'defn name (vec args) (newsublis subs (first rev))) ]
          (eval fn)
          fn) )))

(def harmo '(((father (zeus) (ares)))
             ((mother (hera) (ares)))
             ((father (ares) (harmonia)))
             ((parent x y) (mother x y))
             ((parent x y) (father x y))
             ((grandparent u v) (parent u z)(parent z v)) ) )

; (backch '(father x (harmonia)) harmo)
; (backch '(parent x (harmonia)) harmo)
; (backch '(grandparent w (harmonia)) harmo)

; navigation function rules

(def navr '(((cartesian z z) (xy-data z))
            ((cartesian p (rth2xy q)) (polar p q))
            ((polar q q) (rth-data q))
            ((polar rb (rb2rth q)) (range-bearing rb q))
            ((range-bearing p p) (rb-data p))
            ((range-bearing rb (dd2rb q)) (dist-dir rb q))
            ((dist-dir p p) (dd-data p))
            ((cartesian p (ll2utm q)) (lat-long p q))
            ((lat-long p p) (ll-data p))
            ((lat-long p (city2ll p)) (city p))
            ((distance p1 p2 (euclidist p1c p2c))   ; distance from p1 to p2
             (cartesian p1 p1c)
             (cartesian p2 p2c))
            ((bearing p1 p2 (xybearing p1c p2c))    ; bearing from p1 to p2
             (cartesian p1 p1c)
             (cartesian p2 p2c))
            ((cartesian pt2 (xysum pt1c qc))
             (movefrom pt1 q pt2)            ; moving from pt1 by q goes to pt2
             (cartesian pt1 pt1c)
             (cartesian q qc))
            ((range-bearing p1 p2 (list (euclidist p1c p2c)
                                        (xybearing p1c p2c)))
             (cartesian p1 p1c)
             (cartesian p2 p2c))
            ))

; define navigation var types for testing

(def nav1 '( ((xy-data (a)))
             ((rth-data (b)))
             ))

; (fnfor 'test1 '(a b) '(distance (a) (b) z) nav1 navr)
; (test1  '(10 10) (list 30 (/ Math/PI 6)))  =  16.74469341998643
