; test4.clj                      28 Sep 18

; Test cases for Assignment 4

(load-file "asg4.clj")

; formulas for equation solving
(def formulas
  '((= s (* 0.5 (* a (expt t 2))))
    (= s (+ s0 (* v t)))
    (= a (/ f m))
    (= v (* a t))
    (= f (/ (* m v) t))
    (= f (/ (* m (expt v 2)) r))
    (= h (- h0 (* 4.94 (expt t 2))))
    (= c (sqrt (+ (expt a 2) (expt b 2))))
    (= v (* v0 (- 1.0 (exp (/ (- t) (* r c))))))
    ))

; optimization test cases
(def opttests '(
  (+ 0 foo)
  (* fum 1)
  (- (- y))
  (- (- x y))
  (+ foo (* fum 0))
  ))

; derivative test cases
(def derivtests '(
  (deriv x x)
  (deriv 3 x)
  (deriv z x)
  (deriv (+ x 3) x)
  (deriv (* x 3) x)
  (deriv (* 5 x) x)
  (deriv (sin x) x)
  (deriv (sin (* 2 x)) x)
  (deriv (+ (expt x 2) (+ (* 3 x) 6)) x)
  (deriv2 (+ (expt x 2) (+ (* 3 x) 6)) x)
  (deriv (sqrt (+ (expt x 2) 2)) x)
  (deriv (log (expt (+ 1 x) 3)) x)
  ))

; test cases for translation to Java
(def javatests '(
  (* fum 7)
  (setq x y)
  (setq x (+ x 1))
  (setq area (* pi (expt r 2)))
  (if (> x 7) (setq y x))
  (if (or (> x 7) (< y 3)) (setq y x))
  (if (and (> x 7) (not (< y 3))) (setq y x))
  (defn factorial [n] (if (<= n 1) 1 (* n (factorial (- n 1)))))
  ))

; a cannonball is fired at velocity v and angle theta: y = f(t)
(def cannonball '(= y (- (* (* v (sin theta)) t)
                         (* (/ g 2) (expt t 2)))) )

(defn testsubst []
  (doseq [subs substitutions]
    (println)
    (println (sublis subs binaryfn)) ) )

; test one call to solve
;  (testsolve '(= f (* m a)) 'm)
(defn testsolve [formula var]
  (println "       " (solve formula var)) )

; test solving one formula for all vars
;  (testformula '(= f (* m a)))
(defn testformula [formula]
  (do
    (println "   " formula)
    (doseq [v (vars formula)]
           (testsolve formula v)) ))

; (println "formulas = ")
; test all formulas for all vars
;   (testformulas formulas)
(defn testformulas [formulas]
  (doseq [formula formulas] (testformula formula) ) )

(defn testopt []
  (doseq [form opttests]
    (println form)
    (println "  simplified: " (simplify form)) ) )

(defn testderiv []
  (doseq [form derivtests]
    (println form)
    (let [der (transformfp derivpats form)]
      (println "  derivative: " der)
      (println "  simplified: " (simplify der)) ) ) )

(defn testjava []
  (doseq [form javatests]
    (println "Lisp:  " form)
    (println "Java:")
    (tojavab form) ) )

; test substitutions and then convert to Java
(defn testsubstj []
  (doseq [subs substitutions]
    (let [res (sublis subs binaryfn)]
      (println)
      (println res)
      (println)
      (tojavab res) ) ) )

; test finding min/max of a function
(defn testminmax []
  (println "Cannonball:")
  (findminmax cannonball 't))

(defn testall []
  (testformulas formulas)
  (testopt)
  (testderiv)
  (testjava)
  (testsubstj)
  (testminmax)
  )
