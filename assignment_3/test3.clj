; test3.clj          CS 378               25 Sep 18

(load-file "formulas.clj")
(load-file "asg3.clj")


; test 4 cases for solving equation sets
(defn testsolveqns []
  (do
    (println "Battery: " (solveqns eqnsbat databat 'terminal_voltage))
    (println "Ang Mom: " (solveqns eqnscirc datacirc 'angular_momentum))
    (println "Lens:    " (solveqns eqnslens datalens 'magnification))
    (println "Power:   " (solveqns eqnslift datalift 'power)) ))

;(defn solvecodepr [name equations knowns var]
;  (let [strings (solvecode name equations knowns var)]
;    (doseq [item strings] (println item)) ))
;
;; test 4 cases for solving equation sets, converting to Java code
;(defn testsolvecode []
;  (do
;    (solvecodepr 'battery eqnsbat (map first databat) 'terminal_voltage)
;    (solvecodepr 'angmom eqnscirc (map first datacirc) 'angular_momentum)
;    (solvecodepr 'lens eqnslens (map first datalens) 'magnification)
;    (solvecodepr 'lift eqnslift (map first datalift) 'power) ))
;
;; a test case for arglist:
;; (arglist '(a b c))   =   " double a, double b, double c"
;
; individual tests for equation set solving, producing code list backwards
(defn testsolveqnscbat []
  (solveqnsc '() eqnsbat (map first databat) 'terminal_voltage) )

(defn testsolveqnsccirc []
  (solveqnsc '() eqnscirc (map first datacirc) 'angular_momentum) )

(defn testsolveqnsclens []
  (solveqnsc '() eqnslens (map first datalens) 'magnification) )

(defn testsolveqnsclift []
  (solveqnsc '() eqnslift (map first datalift) 'power) )
;
;
;; individual tests for equation set solving followed by filtering
;(defn testfiltercodebat []
;  (let [eqns (solveqnsc '() eqnsbat (map first databat) 'terminal_voltage) ]
;     (do (println) (println "Battery:")
;       (doseq [item eqns] (println item))
;       (println "Filtered:")
;       (let [fileqns (filtercode eqns '(terminal_voltage)) ]
;         (doseq [item fileqns] (println item)) ))))
;
;(defn testfiltercodecirc []
;  (let [eqns (solveqnsc '() eqnscirc (map first datacirc) 'angular_momentum) ]
;     (do (println) (println "Ang Mom:")
;       (doseq [item eqns] (println item))
;       (println "Filtered:")
;       (let [fileqns (filtercode eqns '(angular_momentum)) ]
;         (doseq [item fileqns] (println item)) ))))
;
;(defn testfiltercodelens []
;  (let [eqns (solveqnsc '() eqnslens (map first datalens) 'magnification) ]
;     (do (println) (println "Lens:")
;       (doseq [item eqns] (println item))
;       (println "Filtered:")
;       (let [fileqns (filtercode eqns '(magnification)) ]
;         (doseq [item fileqns] (println item)) ))))
;
;(defn testfiltercodelift []
;  (let [eqns (solveqnsc '() eqnslift (map first datalift) 'power) ]
;     (do (println) (println "Power:")
;       (doseq [item eqns] (println item))
;       (println "Filtered:")
;       (let [fileqns (filtercode eqns '(power)) ]
;         (doseq [item fileqns] (println item)) ))))
;
(defn testall []
  (do
   ; (testsolveqnscbat)
   ; (testsolveqnsccirc)
   ; (testsolveqnsclens)
   ; (testsolveqnsclift)
    (testsolveqns)
    (testfiltercodebat)
;    (testfiltercodecirc)
;    (testfiltercodelens)
;    (testfiltercodelift)
;    (println)
;    (testsolvecode) ))
  ))
;
