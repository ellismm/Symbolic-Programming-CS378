; formulas.clj         11 Sep 2018

; (load-file "cs378/formulas.clj")

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

; (solveqns eqnsbat databat 'terminal_voltage)
(def eqnsbat '((= loss_voltage (* internal_resistance current))
               (= loss_power (* internal_resistance (expt current 2)))
               (= terminal_voltage (- voltage loss_voltage))
               (= power (* terminal_voltage current))
               (= work (* charge terminal_voltage)) ) )

(def databat '((current 0.3)(internal_resistance 4.0)(voltage 12.0)) )

; (solveqns eqnscirc datacirc 'angular_momentum)
(def eqnscirc '((= acceleration (/ (expt velocity 2) radius))
                (= force        (* mass acceleration))
                (= kinetic_energy   (* (/ mass 2) (expt velocity 2)))
                (= moment_of_inertia (* mass (expt radius 2)))
                (= omega (/ velocity radius))
                (= angular_momentum (* omega moment_of_inertia)) ))

(def datacirc '((radius 4.0)(mass 2.0)(velocity 3.0)) )

; (solveqns eqnslens datalens 'magnification)
(def eqnslens '((= focal_length (/ radius 2))
                (= (/ 1 focal_length)
                   (+ (/ 1 image_distance) (/ 1 subject_distance)))
                (= magnification (- (/ image_distance subject_distance)))
                (= image_height (* magnification subject_height)) ))

(def datalens '((subject_distance 6.0)(focal_length 9.0)) )

; (solveqns eqnslift datalift 'power)
(def eqnslift '((= gravity     9.80665 )
                (= weight      (* gravity mass))
                (= force       weight)
                (= work        (* force height))
                (= speed       (/ height time))
                (= power       (* force speed))
                (= power       (/ work time)) ) )

(def datalift '((weight 700.0)(height 8.0)(time 10.0)) )
