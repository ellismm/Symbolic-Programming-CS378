; asg2.clj           Mark M. Ellis (mme839)            06 Feb 19

(load-file "asg1.clj")
(load-file "cs378.clj")
;                    tst.xyz.core
(ns user
  (:use clojure.test )
  (:require [clojure.string :as str] ))
;            [clojure.math.numeric-tower :as math]


; returns a path to a desired item
(defn findpath [item cave]
  (if (cons? cave)
    (if (empty? cave)
      false
      (if (cons? (first cave) )
        (if (findpath item (first cave) )
          (cons 'first (findpath item (first cave) ) )
          (if (findpath item (rest cave) )
            (cons 'rest (findpath item (rest cave) ) )
              false ) )
        (if (= (first cave) item)
          '(first)
          (if (findpath item (rest cave) )
            (cons 'rest (findpath item (rest cave) ) )
            false) ) ) )
    (if (= cave item)
      '()
      false) ) )


; returns the item at the end of a given path
(defn follow [path cave]
  (if (= (first path) 'first)
    (if (cons? (first cave) )
      (follow (rest path) (first cave) )
      (first cave) )
    (follow (rest path) (rest cave) ) ) )


; finds  the item corresponding to item in tree1, in tree2
(defn corresp [item tree1 tree2]
  (if (findpath item tree1)
    (follow (findpath item tree1) tree2)
    false ) )


; solve a give equation for desired variable
(defn solve [e v]
  (if (= (lhs e) v)
    e
    (if (= (rhs e) v)
      (cons '= (cons (rhs e) (cons (lhs e) '() ) ) )
      (if (cons? (rhs e) )
        (if (= (op (rhs e) ) '-)
          (if (empty? (rest (rest (rhs e) )) )
            (solve (list '= (list '- (lhs e) ) (lhs (rhs e) ) ) v)
            (or (solve (list '= (list '+ (lhs e) (rhs (rhs e) ) ) (lhs (rhs e) ) ) v)
                (solve (list '= (list '- (lhs (rhs e) ) (lhs e) ) (rhs (rhs e) ) ) v ) ) )
          (if (= (op (rhs e) ) '+)
            (or (solve (list '= (list '- (lhs e) (rhs (rhs e) ) ) (lhs (rhs e) ) ) v) 
                (solve (list '= (list '- (lhs e) (lhs (rhs e) ) ) (rhs (rhs e) ) ) v ) )
            (if (= (op (rhs e) ) '*)
              (or (solve (list '= (list '/ (lhs e) (rhs (rhs e) ) ) (lhs (rhs e) ) ) v)
                  (solve (list '= (list '/ (lhs e) (lhs (rhs e) ) ) (rhs (rhs e) ) ) v) )
              (if (= (op (rhs e) ) '/)
                (or (solve (list '= (list '* (lhs e) (rhs (rhs e) ) ) (lhs (rhs e) ) ) v)
                  (solve (list '= (list '/ (lhs (rhs e) ) (lhs e) ) (rhs (rhs e) ) ) v) )
                (if (= (op (rhs e) ) 'expt)
                  (solve (list '= (list 'sqrt (lhs e) ) (lhs (rhs e) ) ) v)
                  (if (= (op (rhs e) ) 'sqrt)
                    (solve (list '= (list 'expt (lhs e) '2) (lhs (rhs e) ) ) v)
                    (if (= (op (rhs e) ) 'exp)
                      (solve (list '= (list 'log (lhs e)) (lhs (rhs e) ) ) v)
                      (if (= (op (rhs e) ) 'log)
                        (solve (list '= (list 'exp (lhs e)) (lhs (rhs e) ) ) v)
                        nil ) ) ) ) ) ) ) ) ) ) ) )


; Returns the evaluation of the given expression and allowing variables
(defn myevalb [tree bindings]
  (if (cons? tree)
    (if (= (first tree) '*)
      (* (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) )
      (if (= (first tree) '+)
        (+ (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) )
        (if (= (first tree) '-)
          (if (empty? (rest (rest tree) ) )
            (- (myevalb (lhs tree) bindings) )
            (- (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) ) )
          (if (= (first tree) '/)
            (/ (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) )
            (if (= (first tree) 'expt)
              (expt (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) )
              (if (= (first tree) 'sqrt)
                (Math/sqrt (myevalb (lhs tree) bindings) )
                (if (= (first tree) 'log)
                  (Math/log (myevalb (lhs tree) bindings) )
                  (if (= (first tree) 'exp)
                    (Math/exp (myevalb (lhs tree) bindings) ) ) ) ) ) ) ) ) )
    (if (number? tree)
      tree
      (second (assocl tree bindings) ) ) ) )

; another form of the vars function for bindings instead of sequences
(defn vars2 [bindings]
  (if (cons? bindings)
    (if (empty? bindings)
      bindings
      (cons (first (first bindings) ) (vars2 (rest bindings) ) ) ) ) )

; returns the evaluation of a desired variable
(defn solveit [equations v bindings]
  (if (empty? (set-difference (cons v (vars2 bindings) ) (vars (first equations) ) ) )
    (myevalb (rhs (solve (first equations) v) ) bindings)
    (solveit (rest equations) v bindings) ) )

