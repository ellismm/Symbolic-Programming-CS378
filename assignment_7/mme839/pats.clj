; pats.clj                Gordon S. Novak Jr.       31 Oct 18

; starter sets of patterns and test cases for pattern assignment
; copy this file to asg4.clj and modify that file for your assignment.

; algebra patterns for equation solving
(def algpats
  '(   ( (= ?x (+ ?y ?z))    (= (- ?x ?y) ?z) )  ; subtract ?y from both sides
       ( (= ?x (+ ?y ?z))    (= (- ?x ?z) ?y) )
       ( (= ?x (- ?y ?z))    (= (- ?y ?x) ?z) )
       ( (= ?x (expt ?y 2))  (= (sqrt ?x) ?y) )
      ; add more
))

; you don't need to change this
; Code substitutions to be done in 'binaryfn' below
; ((?function ...) (?combine ...) (?baseanswer ...))
(def binaryfn
     '(defn ?function [tree]
        (if (cons? tree)
            (?combine (?function (first tree))
                      (?function (rest tree)))
            ?baseanswer)) )

; starter set for function substitutions
(def substitutions '(
  ( (?function addnums) (?combine +) (?baseanswer (if (number? tree) tree 0)))
; add to the following
  ( (?function countstrings) )
  ( (?function copytree) )
  ( (?function mintree) )
  ( (?function conses) )
  ))

; starter set for optimization patterns
(def optpats
  '(  ( (+ ?x 0)   ?x)
      ( (+ 0 ?x)   ?x)
      ( (expt ?x 1) ?x)
      ; add more
      ))

; derivative patterns
(def derivpats
  '(   ( (deriv ?x ?x)   1)
       ( (deriv (+ ?u ?v) ?x)  (+ (deriv ?u ?x) (deriv ?v ?x)))
       ; add more

       ( (deriv2 ?u ?x)  (deriv (deriv ?u ?x) ?x) ) ; second derivative
       ( (deriv ?y ?x)   0)   ; this must be last!  Do not move.
       ))

; Java restructuring patterns.  You do not need to change these.
(def javarestructpats '(
  ( (return (if ?test ?then)) (if ?test (return ?then)) )
  ( (return (if ?test ?then ?else))
      (if ?test (return ?then) (return ?else)) )
  ( (defn ?fun ?args ?code)
      (zdefun ?fun (arglist ?args) (progn (return ?code))) )
  ( (setq ?x (+ ?x 1)) (incf ?x) )
  ))

; patterns for code translation to Java
(def javapats
  '(   ( (if ?test ?then) (if " ( " ?test " )" \tab \return ?then))
       ( (< ?x ?y)  ("(" ?x " " < " " ?y ")"))
       ( (min ?x ?y) (Math.min "(" ?x , " " ?y ")"))
       ( (cons ?x ?y) ("" cons "(" ?x , " " ?y ")"))
       ( (expt ?x ?n) (Math.pow "(" ?x  ", " ?n ")"))
       ( (cons? ?x) (consp "(" ?x ")"))
       ( (string? ?x) (stringp "(" ?x ")"))
       ( (zdefun ?fun ?args ?code)
          (public " " static " " Object " " ?fun
              " " ?args \return ?code \return) )
       ( (arglist (?x))   ("(" Object " " ?x ")"))
       ( (progn ?x) ("{" \tab \return ?x \return "}") )
       ( (setq ?x ?y) (?x " " = " " ?y ";" \return) )
       ( (first ?x) ("" first "(" "(" Cons ")" ?x ")") )
       ; add more

       ( (?fun ?x)   ("" ?fun "(" ?x ")"))  ; must be last
       ))

(def opposites
  '((+ -) (- +) (* /) (/ *) (sqrt expt) (expt sqrt) (log exp) (exp log) ) )

; simplify an algebraic formula
(defn simplify [form] (transformfp optpats form))

; derivative of a formula with respect to a variable, d / d var (form)
(defn deriv [form var]
  (simplify (transformfp derivpats (list 'deriv form var))))

; transform Lisp code to Java
(defn tojavab [code]
  (codeprint (transformfp javapats (transformfp javarestructpats code)) 0)
  (println) )
