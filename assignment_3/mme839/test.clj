(load-file "soln.clj")
(load-file "formulas.clj")

; Test cases for Q1

(def ans_solveqns_a 1080)
(def ans_solveqns_b 2400)
(def ans_solveqns_c 300)
(def ans_solveqns_d 56000)

; Test cases for Q2
(def ans_solveqnsc_a '((= terminal_voltage (- voltage loss_voltage)) (= loss_power (* internal_resistance (expt current 2))) (= loss_voltage (* internal_resistance current))))

(def ans_solveqnsc_b '((= angular_momentum (* omega moment_of_inertia)) (= omega (/ velocity radius))
(= moment_of_inertia (* mass (expt radius 2))) (= kinetic_energy (* (/ mass 2) (expt velocity 2))) (= force (* mass acceleration)) (= acceleration (/ (expt velocity 2) radius))))

(def ans_solveqnsc_c '((= magnification (- (/ image_distance subject_distance))) (= image_distance (/ 1 (- (/ 1 focal_length) (/ 1 subject_distance)))) (= radius (* focal_length 2))))

(def ans_solveqnsc_d '((= power (* force speed))
(= speed (/ height time)) (= work (* force height))
(= force weight) (= mass (/ weight gravity)) (= gravity 9.80665)))

(def ans_solveqnsc_fil_a '((= terminal_voltage (- voltage loss_voltage)) (= loss_voltage (* internal_resistance current))))

(def ans_solveqnsc_fil_b '((= angular_momentum (* omega moment_of_inertia)) (= omega (/ velocity radius)) (= moment_of_inertia (* mass (expt radius 2)))))

(def ans_solveqnsc_fil_c '((= magnification (- (/ image_distance subject_distance))) (= image_distance (/ 1 (- (/ 1 focal_length) (/ 1 subject_distance))))))

(def ans_solveqnsc_fil_d '((= power (* force speed)) (= speed (/ height time)) (= force weight)))

(defn testsolveqnscbat [] 
	(let [eqns (solveqnsc '() eqnsbat (map first databat) 'terminal_voltage) ]
		eqns ))

(defn testsolveqnscirc []
  (let [eqns (solveqnsc '() eqnscirc (map first datacirc) 'angular_momentum) ]
  	eqns ))

(defn testsolveqnsclens []
  (let [eqns (solveqnsc '() eqnslens (map first datalens) 'magnification) ]
  	eqns ))

(defn testsolveqnsclift []
  (let [eqns (solveqnsc '() eqnslift (map first datalift) 'power) ]
  	eqns ))


(defn testfiltercodebat []
  (let [eqns (solveqnsc '() eqnsbat (map first databat) 'terminal_voltage) ]
		(let [fileqns (filtercode eqns '(terminal_voltage)) ]
			fileqns )))

(defn testfiltercodecirc []
  (let [eqns (solveqnsc '() eqnscirc (map first datacirc) 'angular_momentum) ]
	   (let [fileqns (filtercode eqns '(angular_momentum)) ]
			fileqns )))

(defn testfiltercodelens []
  (let [eqns (solveqnsc '() eqnslens (map first datalens) 'magnification) ]
	   (let [fileqns (filtercode eqns '(magnification)) ]
		 fileqns )))

(defn testfiltercodelift []
  (let [eqns (solveqnsc '() eqnslift (map first datalift) 'power) ]
	   (let [fileqns (filtercode eqns '(power)) ]
		 fileqns )))


(defn test_fn [student correct]
	(try 
		(let [ans (eval student)]
		(if (= ans correct)
			1
			0))
		(catch Exception e
			0))
	)

; Evaluating Q1 solveqns
(print "Test Case 1 for (Q1 solveqns) score:") (println (test_fn '(Math/round (* (solveqns eqnsbat databat 'terminal_voltage) 100)) ans_solveqns_a))
(print "Test Case 2 for (Q1 solveqns) score:") (println (test_fn '(Math/round (* (solveqns eqnscirc datacirc 'angular_momentum) 100)) ans_solveqns_b))
(print "Test Case 3 for (Q1 solveqns) score:") (println (test_fn '(Math/round (* (solveqns eqnslens datalens 'magnification) 100)) ans_solveqns_c))
(print "Test Case 4 for (Q1 solveqns) score:") (println (test_fn '(Math/round (* (solveqns eqnslift datalift 'power) 100)) ans_solveqns_d))

; Evaluating Q2 (a) solveqnsc
(print "Test Case 1 for (Q2(a) solveqnsc) score:") (println (test_fn '(testsolveqnscbat) ans_solveqnsc_a))
(print "Test Case 2 for (Q2(a) solveqnsc) score:") (println (test_fn '(testsolveqnscirc) ans_solveqnsc_b))
(print "Test Case 3 for (Q2(a) solveqnsc) score:") (println (test_fn '(testsolveqnsclens) ans_solveqnsc_c))
(print "Test Case 4 for (Q2(a) solveqnsc) score:") (println (test_fn '(testsolveqnsclift) ans_solveqnsc_d))

; Evaluating Q2 (b) filtercode
(print "Test Case 1 for (Q2(b) filtercode) score:") (println (test_fn '(testfiltercodebat) ans_solveqnsc_fil_a))
(print "Test Case 2 for (Q2(b) filtercode) score:") (println (test_fn '(testfiltercodecirc) ans_solveqnsc_fil_b))
(print "Test Case 3 for (Q2(b) filtercode) score:") (println (test_fn '(testfiltercodelens) ans_solveqnsc_fil_c))
(print "Test Case 4 for (Q2(b) filtercode) score:") (println (test_fn '(testfiltercodelift) ans_solveqnsc_fil_d))