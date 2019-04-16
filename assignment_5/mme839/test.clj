(load-file "soln.clj")
; Test cases for program test4
(def city_a 'austin)
(def city_b 'dallas)
(def city_c 'houston)
(def city_d 'waco)

(def ans_test4_ab '29072627195112)
(def ans_test4_ac '35564294189639)
(def ans_test4_bc '55333808931481)
(def ans_test4_cd '45346781246786)

; Test Cases for Test5
(def r1 '(10 60))
(def r2 '(5 80))
(def d1 '(12 ne))
(def d2 '(5 sw))

(def ans_test5_11 '348967071)
(def ans_test5_12 '1488598612)
(def ans_test5_21 '840843355)
(def ans_test5_22 '953716951)

; Test Cases for test6
(def arg1 '(7000 w))
(def arg2 '(5000 e))

(def ans_test6_ab_1 '1913832261)
(def ans_test6_ab_2 '1689199373)
(def ans_test6_ac_1 '26023906970)
(def ans_test6_ac_2 '26056234848)

; Test Cases for test7
(def arg1a '(80000 20))
(def arg2a '(100000 nw))
(def arg1b '(5000 10))
(def arg2b '(200000 ne))

(def ans_test7_ab '(18615612138475 4533138141))
(def ans_test7_ac '(36944593244401 23629515818))
(def ans_test7_bc '(75584058960024 23035726986))
(def ans_test7_cd '(27050432315851 7888669962))

; Test Cases for test8
(def ans_test8_ab '(29072627195112 1783491130))
(def ans_test8_ac '(35564294189639 26043026319))
(def ans_test8_bc '(55333808931481 23262664493))
(def ans_test8_cd '(45346781246786 24404247040))

(defn round [x]
	(Math/round (* x 100000000)))

(defn test_fn [student correct]
	(try 
		(let [ans (eval student)]
		(if (= ans correct)
			1
			0))
		(catch Exception e
			0))
	)

; Evaluating program test4
(print "Test Case 1 for program test4, score:") (println (test_fn '(round (test4 city_a city_b)) ans_test4_ab))
(print "Test Case 2 for program test4, score:") (println (test_fn '(round (test4 city_a city_c)) ans_test4_ac))
(print "Test Case 3 for program test4, score:") (println (test_fn '(round (test4 city_b city_c)) ans_test4_bc))
(print "Test Case 4 for program test4, score:") (println (test_fn '(round (test4 city_d city_c)) ans_test4_cd))

; Evaluating program test5
(print "Test Case 1 for program test5, score:") (println (test_fn '(round (test5 r1 d1)) ans_test5_11))
(print "Test Case 2 for program test5, score:") (println (test_fn '(round (test5 r1 d2)) ans_test5_12))
(print "Test Case 3 for program test5, score:") (println (test_fn '(round (test5 r2 d1)) ans_test5_21))
(print "Test Case 4 for program test5, score:") (println (test_fn '(round (test5 r2 d2)) ans_test5_22))

; Evaluating program test6
(print "Test Case 1 for program test6, score:") (println (test_fn '(round (test6 city_a arg1 city_b)) ans_test6_ab_1))
(print "Test Case 2 for program test6, score:") (println (test_fn '(round (test6 city_a arg2 city_b)) ans_test6_ab_2))
(print "Test Case 3 for program test6, score:") (println (test_fn '(round (test6 city_a arg1 city_c)) ans_test6_ac_1))
(print "Test Case 4 for program test6, score:") (println (test_fn '(round (test6 city_a arg2 city_c)) ans_test6_ac_2))
; Evaluating program test7
(print "Test Case 1 for program test7, score:") (println (test_fn '(map round (test7 city_a arg1a arg2a city_b)) ans_test7_ab))
(print "Test Case 2 for program test7, score:") (println (test_fn '(map round (test7 city_a arg1a arg2a city_c)) ans_test7_ac))
(print "Test Case 3 for program test7, score:") (println (test_fn '(map round (test7 city_b arg1b arg2b city_c)) ans_test7_bc))
(print "Test Case 4 for program test7, score:") (println (test_fn '(map round (test7 city_c arg1b arg2b city_d)) ans_test7_cd))

; Evaluating program test8
(print "Test Case 1 for program test8, score:") (println (test_fn '(map round (test8 city_a city_b)) ans_test8_ab))
(print "Test Case 2 for program test8, score:") (println (test_fn '(map round (test8 city_a city_c)) ans_test8_ac))
(print "Test Case 3 for program test8, score:") (println (test_fn '(map round (test8 city_b city_c)) ans_test8_bc))
(print "Test Case 4 for program test8, score:") (println (test_fn '(map round (test8 city_d city_c)) ans_test8_cd))