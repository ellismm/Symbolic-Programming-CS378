; cs378.clj                Mark M. Ellis (mme839)       26 Feb 19

; (load-file "/u/novak/cs378/cs378.clj")
;                    tst.xyz.core
(load-file "asg2.clj")

(ns user
  (:use clojure.test )
  (:require [clojure.string :as str] ))
;            [clojure.math.numeric-tower :as math]

(defn solveqns2 [eqns values v]
  (if (assocl v values)
    (assocl v values)
    (doseq [eqn eqns]
      (doseq [x eqn]
        (if (and (= (assocl x values) nil) (myevalb (rhs (solve eqn x) ) values) )
          (solveqns2 eqns (cons (cons x (cons (myevalb (rhs (solve eqn x) ) values) '() ) ) values) v) ) ) ) ) )

; Helper function for solveqns to determin if there are any more known variables
(defn addtovalues [eqn values vs] 
  (if (empty? vs)
    values
    (if (and (= (assocl (first vs) values) nil) (myevalb (rhs (solve eqn (first vs) ) ) values) )
      (cons (cons (first vs) (cons (myevalb (rhs (solve eqn (first vs) ) ) values) '() ) ) values)
      (addtovalues eqn values (rest vs) ) ) ) )

; return the value of a variable given a set of equations and a set of already know varibles
(defn solveqns [eqns values v]
  (if (assocl v values)
    (second (assocl v values) )
    (if (empty? eqns)
      nil
      (solveqns (rest eqns) (addtovalues (first eqns) values (vars (first eqns) ) ) v) ) ) )


; helper function for solveqnsc to determine if there are any more known variables
(defn addtoknowns [eqn knowns vs]
  (if (empty? vs)
    knowns
    (if (and (= (member (first vs) knowns) nil) (= (set-difference (vars (rhs (solve eqn (first vs) ) ) ) knowns) '() ) )
      (cons (first vs) knowns)
      (addtoknowns eqn knowns (rest vs) ) ) ) )

; determines the unknow variable and returns the solved equation for that variable
(defn vtosolvfor [eqn knowns vs]
  (if (= (member (first vs) knowns ) nil)
    (solve eqn (first vs) )
    (vtosolvfor eqn knowns (rest vs) ) ) )

; determines all the equations used to come up evaluate the variable v
(defn solveqnsc [codelist eqns knowns v]
  (if (member v knowns)
    codelist
    (if (empty? eqns)
      nil
      (if (= (addtoknowns (first eqns) knowns (vars (first eqns) ) ) knowns)
        (solveqnsc codelist (rest eqns) knowns v)
        (solveqnsc (cons (vtosolvfor (first eqns) knowns (vars (first eqns) ) ) codelist) (rest eqns) (addtoknowns (first eqns) knowns (vars (first eqns) ) ) v) ) ) ) )


; determines unecessary equations from the solveqnsc method
(defn filtercode [codelist needed]
  (if (empty? codelist)
    '()
    (if (member (lhs (first codelist) ) needed)
      (cons (first codelist) (filtercode (rest codelist) (union (vars (rhs (first codelist) ) ) needed ) ) )
      (filtercode (rest codelist) needed) ) ) )


; concatenates given inputs for a java function into string
(defn arglist [inputs]
 (if (empty? inputs)
  (str '\) )
  (if (empty? (rest inputs) )
    (str "double " (first inputs) (arglist (rest inputs) ) )
    (str "double " (first inputs) ", " (arglist (rest inputs) ) ) ) ) )

; a helper function for solvecode
(defn solvecodeb [nam eqns inputs v]
  (if (empty? eqns)
    (cons (str "  return " v ";") (cons (str "}\n" ) ()) )
    (cons (str "  double " (tojava (first eqns) ) ) (solvecodeb nam (rest eqns) (cons (lhs (first eqns) ) inputs) v) ) ) )

; creates a java function to solve a desired equiation
(defn solvecode [nam eqns inputs v]
  (cons (str "public static double " nam "(" (arglist inputs) " {" ) (solvecodeb nam (trrev (filtercode (solveqnsc '() eqns inputs v)(cons v () ) ) ) inputs v) ) )
