; Test cases for Q2
(def solve_a '(= s (* 0.5 (* a (expt t 2)))))
(def solve_b '(= v (* v0 (- 1.0 (exp (/ (- t) (* r c)))))))

(def ans_solve_a1 '(= a (/ (/ s 0.5) (expt t 2))))
(def ans_solve_a2 '(= t (sqrt (/ (/ s 0.5) a))))

(def ans_solve_b1 '(= t (- (* (log (- 1.0 (/ v v0))) (* r c)))))
(def ans_solve_b2 '(= c (/ (/ (- t) (log (- 1.0 (/ v v0)))) r)))

; Test cases for Q3
(def opt_a '(+ 0 foo))
(def ans_opt_a 'foo)
(def opt_b '(- (- x y)))
(def ans_opt_b '(- y x))
(def opt_c '(- (- y)))
(def ans_opt_c 'y)
(def opt_d '(+ foo (* fum 0)))
(def ans_opt_d 'foo)

; Test Cases for Q4
(def deriv_a '(deriv (* x 3) x))
(def ans_deriv_a1 '(+ (* x 0) (* 3 1)))
(def ans_deriv_a2 '3)

(def deriv_b '(deriv (sin (* 2 x)) x))
(def ans_deriv_b1 '(* (cos (* 2 x)) (+ (* 2 1) (* x 0))))
(def ans_deriv_b2 '(* (cos (* 2 x)) 2))

(def deriv_c '(deriv (sqrt (+ (expt x 2) 2)) x))
(def ans_deriv_c1 '(/ (+ (* 2 (* (expt x (- 2 1)) 1)) 0) (* 2 (sqrt (+ (expt x 2) 2)))))
(def ans_deriv_c2 '(/ x (sqrt (+ (expt x 2) 2))))

(def deriv_d '(deriv2 (+ (expt x 2) (+ (* 3 x) 6)) x))
(def ans_deriv_d1 '(+ (+ (* 2 (+ (* (expt x (- 2 1)) 0) (* 1 (* (- 2 1) (* (expt x (- (- 2 1) 1)) 1))))) (* (* (expt x (- 2 1)) 1) 0)) (+ (+ (+ (* 3 0) (* 1 0)) (+ (* x 0) (* 0 1))) 0)))
(def ans_deriv_d2 '2)

; Test Cases for Q5
(def java_a '(* fum 7))
(def java_b '(setq area (* pi (expt r 2))))
(def java_c '(if (and (> x 7) (not (< y 3))) (setq y x)))
(def java_d '(defn factorial [n] (if (<= n 1) 1 (* n (factorial (- n 1))))))

(def ans_java_a "(fum * 7)")
(def ans_java_b "area = (Math.PI * Math.pow(r, 2));")
(def ans_java_c "if ( ((x > 7) && (! (y < 3))) )
   y = x;")
(def ans_java_d "public static Object factorial (Object n)
{
   if ( (n <= 1) )
      return 1;
   else return (n * factorial((n - 1)));
   }")

; Test Cases for Q6
(def substj_a '( (?function countstrings) (?combine +)
       (?baseanswer (if (string? tree) 1 0)) ))
(def substj_b '( (?function copytree) (?combine cons) (?baseanswer tree) ))
(def substj_c '( (?function mintree)  (?combine min)
       (?baseanswer (if (number? tree) tree 999999))))
(def substj_d '( (?function conses) (?combine add1) (?baseanswer 0) ))

(def ans_substj_a "public static Object countstrings (Object tree)
{
   if ( consp(tree) )
      return (countstrings(first((Cons)tree)) + countstrings(rest((Cons)tree)));
   else if ( stringp(tree) )
      return 1;
   else return 0;
   }")
(def ans_substj_b "public static Object copytree (Object tree)
{
   if ( consp(tree) )
      return cons(copytree(first((Cons)tree)), copytree(rest((Cons)tree)));
   else return tree;
   }")
(def ans_substj_c "public static Object mintree (Object tree)
{
   if ( consp(tree) )
      return Math.min(mintree(first((Cons)tree)), mintree(rest((Cons)tree)));
   else if ( numberp(tree) )
      return tree;
   else return 999999;
   }")
(def ans_substj_d "public static Object conses (Object tree)
{
   if ( consp(tree) )
      return add1(conses(first((Cons)tree)), conses(rest((Cons)tree)));
   else return 0;
   }")

; Test Cases for Q7
(def minmax_a '(= y (- (* (* v (sin theta)) t) (* (/ g 2) (expt t 2)))))
(def ans_minmax_a '(= t (/ (* v (sin theta)) g)))

(defn check [corr alt]
	(if(cons? corr)
		(let [elem (first corr)]
		(and (some #(= elem %) alt) (check (rest corr) alt)))
		true))

(defn compare_lists [a b]
	(if(= 0 a)
		0)
	(if (and (check a b) (check b a))
		1
		0))

(defn test_fn [student correct]
	(try 
		(let [ans (eval student)]
		(if (= ans correct)
			1
			0))
		(catch Exception e
			0))
	)

(defn get_output [student]
	(try 
		(let [ans (eval student)]
			ans)
		(catch Exception e
			0))
	)

(println "=========================")
; Evaluating Q2 solve
(println "Test Case 1 for (Q2 solve): ") (println ans_solve_a1) (println (solve solve_a 'a)) (print "Result:") (println (test_fn '(solve solve_a 'a) ans_solve_a1))
(println "Test Case 2 for (Q2 solve): ") (println ans_solve_a2) (println (solve solve_a 't)) (print "Result:") (println (test_fn '(solve solve_a 't) ans_solve_a2))
(println "Test Case 3 for (Q2 solve): ") (println ans_solve_b1) (println (solve solve_b 't)) (print "Result:") (println (test_fn '(solve solve_b 't) ans_solve_b1))
(println "Test Case 4 for (Q2 solve): ") (println ans_solve_b2) (println (solve solve_b 'c)) (print "Result:") (println (test_fn '(solve solve_b 'c) ans_solve_b2))

(println "=========================")
;Evaluating Q3 optpats
(println "Test Case 1 for (Q3 optpats): ") (println ans_opt_a) (println (simplify opt_a)) (print "Result:") (println (test_fn '(simplify opt_a)  ans_opt_a))
(println "Test Case 2 for (Q3 optpats): ") (println ans_opt_b) (println (simplify opt_b)) (print "Result:") (println (test_fn '(simplify opt_b)  ans_opt_b))
(println "Test Case 3 for (Q3 optpats): ") (println ans_opt_c) (println (simplify opt_c)) (print "Result:") (println (test_fn '(simplify opt_c)  ans_opt_c))
(println "Test Case 4 for (Q3 optpats): ") (println ans_opt_d) (println (simplify opt_d)) (print "Result:") (println (test_fn '(simplify opt_d)  ans_opt_d))

(println "=========================")
;Evaluating Q4 derivative
(println "Test Case 1 for (Q4 derivative): ") (println ans_deriv_a1) (println (transformfp derivpats deriv_a)) (print "Result:") (println (test_fn '(transformfp derivpats deriv_a) ans_deriv_a1))
(println "Test Case 2 for (Q4 derivative): ") (println ans_deriv_b1) (println (transformfp derivpats deriv_b)) (print "Result:") (println (test_fn '(transformfp derivpats deriv_b) ans_deriv_b1))
(println "Test Case 3 for (Q4 derivative): ") (println ans_deriv_c1) (println (transformfp derivpats deriv_c)) (print "Result:") (println (test_fn '(transformfp derivpats deriv_c) ans_deriv_c1))
(println "Test Case 4 for (Q4 derivative): ") (println ans_deriv_d1) (println (transformfp derivpats deriv_d)) (print "Result:") (println (test_fn '(transformfp derivpats deriv_d) ans_deriv_d1))
(println "Test Case 5 for (Q4 simplified derivative): ") (println ans_deriv_a2) (println (simplify (transformfp derivpats deriv_a))) (print "Result:") (println (test_fn '(simplify (transformfp derivpats deriv_a)) ans_deriv_a2))
(println "Test Case 6 for (Q4 simplified derivative): ") (println ans_deriv_b2) (println (simplify (transformfp derivpats deriv_b))) (print "Result:") (println (test_fn '(simplify (transformfp derivpats deriv_b)) ans_deriv_b2))
(println "Test Case 7 for (Q4 simplified derivative): ") (println ans_deriv_c2) (println (simplify (transformfp derivpats deriv_c))) (print "Result:") (println (test_fn '(simplify (transformfp derivpats deriv_c)) ans_deriv_c2))
(println "Test Case 8 for (Q4 simplified derivative): ") (println ans_deriv_d2) (println (simplify (transformfp derivpats deriv_d))) (print "Result:") (println (test_fn '(simplify (transformfp derivpats deriv_d)) ans_deriv_d2))

(println "=========================")
; Evaluating Q5 tojavab
(println "Test Case 1 for (Q5 tojavab) score: ") (println ans_java_a) (println (tojavab java_a))
(println "Test Case 2 for (Q5 tojavab) score: ") (println ans_java_b) (println (tojavab java_b))
(println "Test Case 3 for (Q5 tojavab) score: ") (println ans_java_c) (println (tojavab java_c))
(println "Test Case 4 for (Q5 tojavab) score: ") (println ans_java_d) (println (tojavab java_d))

(println "=========================")
; Evaluating Q6 substitutions to java
(println "Test Case 1 for (Q6 substj) score: ") (println ans_substj_a) (println (tojavab (sublis substj_a binaryfn)))
(println "Test Case 2 for (Q6 substj) score: ") (println ans_substj_b) (println (tojavab (sublis substj_b binaryfn)))
(println "Test Case 3 for (Q6 substj) score: ") (println ans_substj_c) (println (tojavab (sublis substj_c binaryfn)))
(println "Test Case 4 for (Q6 substj) score: ") (println ans_substj_d) (println (tojavab (sublis substj_d binaryfn)))

(println "=========================")
; Evaluating Q7 findminmax
(println "Test Case 1 for (Q7 findminmax) score: ") (println ans_minmax_a) (println (findminmax minmax_a 't)) (print "Result:") (println (test_fn '(findminmax minmax_a 't) ans_minmax_a))
