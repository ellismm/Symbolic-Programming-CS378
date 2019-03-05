; cs378.clj                Mark M. Ellis (mme839)       26 Feb 19

; (load-file "/u/novak/cs378/cs378.clj")
;                    tst.xyz.core
(load-file "asg2.clj")

(ns user
  (:use clojure.test )
  (:require [clojure.string :as str] ))
;            [clojure.math.numeric-tower :as math]

; solve for each variable of the first equation of the equtions list
; try to get a value for that variable
; if if there is a value for the variable add it to the values list
; recursively call the the function with new values set
; remove the equation from the eqns list)
(defn solveqns2 [eqns values v]
  (if (assocl v values)
    (assocl v values)
    (doseq [eqn eqns]
      (doseq [x eqn]
        (if (and (= (assocl x values) nil) (myevalb (rhs (solve eqn x) ) values) )
          (solveqns eqns (cons (cons x (cons (myevalb (rhs (solve eqn x) ) values) '() ) ) values) v ) ) ) ) ) )

(def addtovalues [eqn values] 
  (doseq [x eqn]
    (if (and (= (assocl x values) nil) (myevalb (rhs (solve eqn x)) values) )
      (cons (cons x (cons (myevalbe (rhs (solve eqn x) ) values ) '() ) ) values ) ) ) )
(defn solveqns [eqns values v]
  (doseq [eqn eqns]
    (doseq [x eqn]
      (if (and (= (assocl x values) nil) (myevalb (rhs (solve eqn x) ) values) )
        (solveqns eqns (cons (cons x (cons (myevalb (rhs (solve eqn x) ) values) '() ) ) values) v ) ) ) )
  values )

