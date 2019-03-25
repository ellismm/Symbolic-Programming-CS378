; assignment 1 Mark M. Ellis (mme839) 23 Jan 19

(ns user
  (:use clojure.test)
  (:require [clojure.string :as str] ))

(def lstnum '(76 85 71 83 84 89 96 84 98 97 75 85 92 64 89 87 90 65 100) )

; add up the elements in a list using recursion 
(defn sum [lst]
  (if (empty? lst) 
    0 
    (+ (first lst) (sum (rest lst) ) ) ) )


; helper function for sumtr function
(defn sumtrb [lst x]
  (if (empty? lst)
    x
    (sumtrb (rest lst) (+ (first lst) x) ) ) ) 

; add up the elements of in a list using tail recursion
(defn sumtr [lst] (sumtrb lst 0) )

; adds up the elements in an list using reduce
(defn sumr [lst] (reduce + lst) )

; adds up the squares of elements in a list using recursion
(defn sumsq [lst]
  (if (empty? lst)
    0
    (+ (* (first lst) (first lst) ) (sumsq (rest lst) ) ) ) ) 


; helper function for the sumsqtr function
(defn sumsqtrb [lst x]
  (if (empty? lst)
    x
    (sumsqtrb (rest lst) (+ (* (first lst) (first lst) ) x) ) ) )

; adds up the squares of elements in a list using taile recursion
(defn sumsqtr [lst] (sumsqtrb lst 0) )


; adds up the squares of elements in a list using map and reduce
(defn sumsqmr [lst] (reduce + (map (fn [x] (* x x) ) lst) ) )


; returns the square of a function
(defn sqr [x] (* x x))

; calculates the number of elements in a list
(defn length [lst]
  (if (empty? lst)
    0
    (+ 1 (length (rest lst) ) ) ) )

; returns the mean of the given elements in list
(defn mean [lst] (/ (sum lst) (length lst) ) )

; return a list of the difference of the mean and each element in a list
(defn diff_mean [lst m]
  (if (empty? lst)
    lst
    (cons (- (first lst) m) (diff_mean (rest lst) m ) ) ) )

; caculates the standard devation of the numbers in lstnum
(defn stdev []
  (Math/sqrt (/ (sumsqmr (diff_mean lstnum (mean lstnum) ) ) (length lstnum) ) ) )


; determines if the item given is in the list given
(defn member [item lst]
  (if (empty? lst)
      nil
      (if (= item (first lst))
          lst
          (member item (rest lst)) ) ) )


; returns the union of 2 lists
(defn union [lsta lstb]
  (if (empty? lstb)
    lstb
    (if (empty? lsta)
      lstb
      (if (member (first lsta) lstb)
        (union (rest lsta) lstb)
        (cons (first lsta) (union (rest lsta) lstb) ) ) ) ) )


; returns the set-difference of 2 lists
(defn set-difference [lsta lstb]
  (if (empty? lstb)
    lsta
    (if (empty? lsta)
      () 
      (if (member (first lsta) lstb)
        (set-difference (rest lsta) lstb)
        (cons (first lsta) (set-difference (rest lsta) lstb) ) ) ) ) )


; helper functin for binomial
(defn binomialb [lst]
  (if (empty? (rest lst) )
    '(1)
    (cons (+ (first lst) (second lst) ) (binomialb (rest lst) ) ) ) )
  
; returns the binomial coefficients of the power n given
(defn binomial [n]
  (if (= n 0)
    '(1)
    (binomialb (cons 0 (binomial (- n 1) ) ) ) ) )

; test whether x is a cons
(defn cons? [x] (and (seq? x) (not (empty? x))))
(defn op [e] (first e))
(defn lhs [e] (second e))
(defn rhs [e] (first (rest (rest e))))

(defn expt [x n]
  (if (or (float? x) (double? x))
      (Math/pow x n)
      (if (= n 0)
          1
          (if (> n 0)
              (* x (expt x (- n 1)))
              (/ 1 (expt x (- n))) ) ) ) )

(defn assocl [key lst]
  (if (empty? lst)
      nil
      (if (= (first (first lst)) key)
          (first lst)
          (assocl key (rest lst)) ) ) )

; returns the max value in a given tree
(defn maxbt [tree]
  (if (cons? tree)
    (if (> (maxbt (first tree) ) (maxbt (rest tree) ) )
      (maxbt (first tree) )
      (maxbt (rest tree) ) )
    (if (number? tree)
      tree
      -999999 ) ) )

; returns the variables in a given expression 
(defn vars [expr]
  (if (cons? expr)
    (union (vars (lhs expr) ) (vars (rhs expr) ) )
    (if (number? expr)
      ()
      (cons expr '() ) ) ) )

; determins whether or not a given element exist in a given expression 
(defn occurs [item tree]
  (if (cons? tree)
    (if (= true (occurs item (lhs tree) ) )
      (occurs item (lhs tree) )
      (occurs item (rhs tree) ) )
    (= tree item) ) )

; Returns the evaluation of the given expression
(defn myeval [tree]
  (if (cons? tree)
    (if (= (first tree) '*)
      (* (myeval (lhs tree) ) (myeval (rhs tree) ) )
      (if (= (first tree) '+)
        (+ (myeval (lhs tree) ) (myeval (rhs tree) ) )
        (if (= (first tree) '-)
          (if (empty? (rhs tree) )
            (- (myeval (lhs tree) ) )
            (- (myeval (lhs tree) ) (myeval (rhs tree) ) ) )
          (if (= (first tree) '/)
            (/ (myeval (lhs tree) ) (myeval (rhs tree) ) )
            (if (= (first tree) 'expt)
              (expt (myeval (lhs tree) ) (myeval (rhs tree) ) ) ) ) ) ) )
    tree ) )

; Returns the evaluation of the given expression and allowing variables
(defn myevalb [tree bindings]
  (if (cons? tree)
    (if (= (first tree) '*)
      (* (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) )
      (if (= (first tree) '+)
        (+ (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) )
        (if (= (first tree) '-)
          (if (empty? (rhs tree) )
            (- (myevalb (lhs tree) ) )
            (- (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) ) )
          (if (= (first tree) '/)
            (/ (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) )
            (if (= (first tree) 'expt)
              (expt (myevalb (lhs tree) bindings) (myevalb (rhs tree) bindings) ) ) ) ) ) )
    (if (number? tree)
      tree
      (second (assocl tree bindings) ) ) ) )


; returns  string that is a line of Java Code given an expression tree
(defn tojavab [tree]
  (if (cons? tree)
    (if (= (first tree) '*)
      (str (tojavab (lhs tree) ) " " (op tree) " " (tojavab (rhs tree) ) )
      (if (= (first tree) '+)
        (str '\( (tojavab (lhs tree)) " " (op tree) " " (tojavab (rhs tree) ) '\) )
        (if (= (first tree) '-)
          (if (empty? (rhs tree) )
            (str '\( (- (tojavab (lhs tree) )'\) ) )
            (str '\( (tojavab (lhs tree) ) " " (op tree) " " (tojavab (rhs tree) '\) ) ) )
          (if (= (first tree) '/)
            (str (tojavab (lhs tree) ) " " (op tree) " " (tojavab (rhs tree) ) )
            (if (= (first tree) '=)
              (str (tojavab (lhs tree) ) " " (op tree) " " (tojavab (rhs tree) ) )
              (str "Math." (op tree) "(" (tojavab (lhs tree) ) ")" ) ) ) ) ) )
      tree) )

(defn tojava [tree]
  (str (tojavab tree) ";") )
