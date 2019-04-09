; asg4.clj                Mark M. Ellis       25 Mar 19

(load-file "asg3.clj")
(load-file "patm.clj")
; starter sets of patterns and test cases for pattern assignment
; copy this file to asg4.clj and modify that file for your assignment.

; algebra patterns for equation solving
(def algpats
  '(   ( (= ?x (+ ?y ?z))    (= (- ?x ?y) ?z) )  ; subtract ?y from both sides
       ( (= ?x (+ ?y ?z))    (= (- ?x ?z) ?y) )
       ( (= ?x (- ?y ?z))    (= (- ?y ?x) ?z) )
       ( (= ?x (- ?y ?z))    (= (+ ?x ?z) ?y) )
       ( (= ?x (- ?y))       (= (- ?x) ?y) )
       ( (= ?x (* ?y ?z))    (= (/ ?x ?y) ?z) )
       ( (= ?x (* ?y ?z))    (= (/ ?x ?z) ?y) )
       ( (= ?x (/ ?y ?z))    (= (/ ?y ?x) ?z) )
       ( (= ?x (/ ?y ?z))    (= (* ?x ?z) ?y) )
       ( (= ?x (expt ?y 2))  (= (sqrt ?x) ?y) )
       ( (= ?x (sqrt ?y))    (= (expt ?x 2) ?y) )
       ( (= ?x (exp ?y))     (= (log ?x) ?y) )
       ( (= ?x (log ?y))     (= (exp ?x) ?y) )
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
  ( (?function countstrings) (?combine +) (?baseanswer (if (string? tree) 1 0) ) )
  ( (?function copytree) (?combine cons) (?baseanswer (if (empty? tree) '() tree) ) )
  ( (?function mintree) (?combine min) (?baseanswer (if (number? tree) tree 999999) ) )
  ( (?function conses) (?combine add1) (?baseanswer (if (empty? tree) 1 0) ) )
  ))


(defn solver [algpats e v]
  (if (empty? algpats)
    nil
    (if (solve (transform (first algpats) e) v)
      (transform (first algpats) e)
      (solver (rest algpats) e v) ) ) )
         
(defn solve [e v]
  (if (= (lhs e) v)
    e
    (if (= (rhs e ) v)
      (cons (op e) (cons v (cons (lhs e) '() ) ) )
      (if (cons? (rhs e) )
        (solve (solver algpats e v) v)
        nil ) ) ) )
         

; starter set for optimization patterns
(def optpats
  '(  ( (+ ?x 0)   ?x)
      ( (+ 0 ?x)   ?x)
      ( (expt ?x 1) ?x)
      ; add more
      ( (+ ?x ?x) (* 2 ?x))
      ( (- ?x 0 ) ?x)
      ( (- 0 ?x) (- ?x))
      ( (- ?x ?x) 0)
      ( (- (- ?x)) ?x)
      ( (- (- ?x ?y)) (- ?y ?x))
      ( (- 2 1) 1)
      ( (- 3 1) 2)
      ( (- 4 1) 3)
      ( (* ?x 0) 0)
      ( (* ?x 1) ?x)
      ( (* 1 ?x) ?x)
      ( (* ?x ?x) (expt ?x 2))
      ( (* (/ 1 2) (* 2 ?x)) ?x)
      ( (* ?x 1) ?x)
      ( (/ 0 ?x) 0)
      ( (/ ?x ?x) 1)
			( (/ ?x 1) ?x)
			( (/ (* ?z ?x) (* ?y ?z)) (/ ?x ?y))
			( (/ (* ?x ?z) (* ?y ?z)) (/ ?x ?y))
			( (/ (* ?z ?x) (* ?z ?y)) (/ ?x ?y))
			( (/ (* ?x ?z) (* ?z ?y)) (/ ?x ?y))
      ( (expt ?x 0) 1)
      ( (expt 0 ?x) 0)
      ( (expt 1 ?x) 1)
      ( (expt ?x 1) ?x)
      ( (sqrt (expt ?x 2)) ?x)
      ( (exp 0) 1)
      ( (exp (log ?x)) ?x)
      ( (log 1) 0)
      ))

; derivative patterns
(def derivpats
  '(   ( (deriv ?x ?x)   1)
       ( (deriv (+ ?u ?v) ?x)  (+ (deriv ?u ?x) (deriv ?v ?x)))
       ; add more
       ( (deriv (- ?u ?v) ?x) (- (deriv ?u ?x) (deriv ?v ?v)))
       ( (deriv (- ?v) ?x) (- (deriv ?v ?x)))
       ( (deriv (* ?u ?v) ?x) (+ (* ?u (deriv ?v ?x)) (* ?v (deriv ?u ?x))))
       ( (deriv (/ ?u ?v) ?x) (/ (- (* ?v (deriv ?u ?x)) (* ?u (deriv ?v ?x))) (expt ?v 2)))
       ;( (deriv (expt ?u ?c) ?x) (* (* ?c (expt ?u (- ?c 1))) (deriv ?u ?x)))
			 ;( (deriv (expt ?u ?c) ?x) (* ?c (* (expt ?u (- ?c 1)) (deriv ?u ?x))))
			 ( (deriv (expt ?u ?c) ?x)  (* ?c (* (expt ?u (- ?c 1)) (deriv ?u ?x))))
			 ;( (deriv (sqrt ?u) ?x) (* 0.5 (/ (deriv ?u ?x) (sqrt ?u))))
       ;;( (deriv (sqrt ?u) ?x) (/ (* (/ 1 2) (deriv (?u ?x))) (sqrt ?u)))
			 ;( (deriv (sqrt ?u) ?x) (/ (+ (* 2 (* (expt ?x (-2 1)) 1)) 0) (* 2 (sqrt (+ (expt ?x 2) 2)))))
			 ( (deriv (sqrt ?u) ?x)  (/ (deriv ?u ?x) (* 2 (sqrt ?u))))
       ( (deriv (log ?u) ?x ) (/ (deriv ?u ?x) ?u))
       ( (deriv (exp ?u) ?x ) (* (exp ?u) (deriv ?u ?x)))
       ( (deriv (sin ?u) ?x) (* (cos ?u) (deriv ?u ?x)))
       ( (deriv (cos ?u) ?x) (* (- (sin ?u)) (deriv ?u ?x)))
       ( (deriv (tan ?u) ?x) (* (+ 1 (expt (tan ?u) 2)) (deriv ?u ?x)))

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
       ( (add1 ?x ?y) ("" ?x " , " ?y ")"))
       ( (+ ?x ?y) ("" "(" ?x " " + " " ?y ")"))
       ( (- ?x ?y) ("" "(" ?x " " - " " ?y ")"))
       ( (* ?x ?y) ("" "(" ?x " " * " " ?y ")"))
       ( (/ ?x ?y) ("" "(" ?x " " / " " ?y ")"))
       ( (- ?x) ("" - ?x))
       ( (incf ?x) (?x ++ ";" \return))
       ( (incf ?x) ("" ?x + +))
       ( (decf ?x) ("" ?x - -))
       ( (equal ?x ?y) ("" "(" ?x " " = = " " ?y ")"))
       ( (> ?x ?y) ("" "(" ?x " " > " " ?y ")" ))
			 ( (<= ?x ?y) ("" "(" ?x " " <= " " ?y ")" ))
			 ( (>= ?x ?y) ("" "(" ?x " " >= " " ?y ")" ))
			 ( (not ?x) ("" "("! " " ?x ")"))
			 ( (and ?x ?y) ("" "(" ?x " " && " " ?y ")"))
			 ( (or ?x ?y) ("" "(" ?x " " || " " ?y ")"))
			 (pi Math.PI)
			 ( (if ?test ?then ?else) ("" "if" " " "( " ?test " )" " " "{" \tab \return
				 ?then \tab \return "}" \return "else" " " "{" \tab ?else \tab "}"))
			 ( (return ?x) ("" "return" " " ?x ";"))
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

(defn findminmax [e v]
	(deriv (rhs (solve e v) ) v) )
