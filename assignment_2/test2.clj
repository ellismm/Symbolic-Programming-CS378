;;; test2.clj
;;; Modified by Xuming Zeng, 02 Dec 14; GSN 12 Sep 18
;;; Put your code in a new file called asg2.clj.
;;; You should not need to modify this file.

;;; Use myevalb rather than eval: eval is the Lisp interpreter.
;;;
;;; This file is designed to test the entire assignment in one run.
;;; You can also use the test cases individually from the keyboard
;;; during development and debugging.

; (load-file "asg2.clj")

(def cave '(rocks gold (monster)) )

(def caveb
  '(((green eggs and) ((ham))) rocks (monster (((gold (monster)))))) )

(def treea '((my eyes) (have seen (the light))) )

(def treeb '((my ears) (have heard (the music))) )

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

(def opposites
  '((+ -) (- +) (* /) (/ *) (sqrt expt) (expt sqrt) (log exp) (exp log) ) )

; (testcave) will test all cave functions
(defn testcave []
  (println "cave = " cave)
  (println "path = " (findpath 'gold cave))
  (println "follow = " (follow (findpath 'gold cave) cave))
  (println "caveb = " caveb)
  (println "pathb = " (findpath 'gold caveb))
  (println "follow = " (follow (findpath 'gold caveb) caveb))
  (println "treea = " treea)
  (println "treeb = " treeb)
  (println "corresp = " (corresp 'light treea treeb))
  )

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

; test myevalb
(defn testmyevalb []
  (let [ formula1 '(* 0.5 (* a (expt t 2)))
         bindings1 '((a 32.0) (t 4.0)) ]
         (println "Eval:      " formula1)
         (println "  bindings " bindings1)
         (println "  result = " (myevalb formula1 bindings1)) ))

; test solveit
(defn testsolveit []
  (println "Tower: "    (solveit formulas 'h0 '((h 0.0) (t 4.0))) )
  (println "Car: "      (solveit formulas 'a  '((v 88.0) (t 8.0))) )
  (println "Capacitor: "(solveit formulas 'c  '((v 3.0) (v0 6.0) (r 10000.0)
                                                   (t 5.0))) )
  (println "Ladder: "   (solveit formulas 'b  '((a 6.0) (c 10.0))) )
  )

(defn testall []
  (testcave)
  (testformulas formulas)
  (testmyevalb)
  (testsolveit)
  )
