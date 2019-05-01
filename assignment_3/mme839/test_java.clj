(load-file "soln.clj")
(load-file "formulas.clj")

(defn solvecodepr [name equations knowns var]
  (let [strings (solvecode name equations knowns var)]
    (doseq [item strings] (println item)) ))

; test 4 cases for solving equation sets, converting to Java code
(defn testsolvecode []
  (do
    (solvecodepr 'battery eqnsbat (map first databat) 'terminal_voltage)
    (solvecodepr 'angmom eqnscirc (map first datacirc) 'angular_momentum)
    (solvecodepr 'lens eqnslens (map first datalens) 'magnification)
    (solvecodepr 'lift eqnslift (map first datalift) 'power) ))

(testsolvecode)