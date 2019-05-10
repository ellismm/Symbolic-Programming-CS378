; physgram.clj         Gordon S. Novak Jr.           ; 28 Apr 19

; 05 Apr 04; 14 Apr 04; 22 Nov 05; 03 Dec 18

; To run:
; (load-file "cs378/physics.clj")
; (load-files)
; (gramcom grammar)

; (phys '(what is the area of a circle with radius = 2))
; (phys '(what is the radius of a sphere with volume = 50))
; (phys '(what is the height of a fall with time = 4))
; (phys '(what is the power of a lift with mass = 50 and
;         height = 10 and time = 5))

; if the radius of a circle is then what is the circumference
; given the radius of circle is _ then what is the circumference
; does the circumference of circle with a radius of _ equal _; Yes or no it is answer
; caclulate the circumference of a circle with a given radius of _
; What is the relationship between _ and _
; Obtain the circumference of a circle with a radius of _
; How many _ is _ _

(defn s []) ; stub

(defn number []
  (if (number? atnword)
       atnword))

(def lexicon '(
   (propname (radius diameter circumference area
	      volume height velocity time
	      weight power height work speed mass
	      charge capacitance voltage density
              spring-constant stretch length width
              diagonal parameter force meters m meter
              kilometers km kilometer centimeters cm
              centimeter millimeters mm millimeter
              nanometers nanometer nm inches in inch
              feet foot ft))
   (unitz    (meter m meters inches inch in feet foot ft cm mm centimeters
              millimeters centimeter millimeter km kilometer kilometers square-feet
              square-foot sqft square square-meters square-meter sqm mph miles-per-hour
              mile-per-hour kmh kilometer-per-hour kilometers-per-hour m/h k/h ounces oz) )
   (a/an     (a an))
   (the/its  (the its))
   (wi/wh    (with where if when given))
   (whats    (what's What's whats Whats what What calculate Calculate obtain Obtain show Show find Find))
   (andd     (and))
   (given    (if If given Given))
   (right/wrong (does Does is Is))
   (doesequal (= of is equal equals))
   (objname  (circle sphere fall lift cone capacitator weight spring cylinder
             rectangle square units))
))  ; def lexicon

(defn objprops [])   ; to keep clojure happy

(def grammar '(
  (param     -> ((the/its)? (propname)) $2)
  (quantity  -> ((number)) $1)
  (object    -> ((a/an)? (objname) (wi/wh)? (objprops))
                   (cons 'object (cons $2 $4)))
  (object    -> ((a/an)? (objname) (doesequal)? (quantity) (wi/wh)? (objprops))
	      	   (cons 'object (cons $2 $6)))
  (object    -> ((objprops) of ? (a/an)? (objname)) (cons 'object (cons $4 $1)))
  (objprop   -> ((a/an)? (the/its)? (propname) (doesequal)? (quantity) (unitz)?) (list $3 $5))
  (objprops  -> ((objprop) (andd)? \, ? (objprops))  (cons $1 $4))
  (objprops  -> ((objprop))  (list $1))
  (s         -> ((whats)? is ? (param) of ? (object)) (list 'calculate $3 $5))
  (s         -> ((right/wrong) (param) of (object) (doesequal)? (quantity)) (list 'calculate $2 $4))
  (s	     -> ((right/wrong) (param) of (object)) (list 'calculate $2 $4)) 
  (s	     -> ((given)? (object) what ? is ? (param)) (list 'calculate $5 $2))
  (s         -> (How many (param) is (quantity) (propname)) (list 'calculate $3 (cons 'object (cons 'units (cons (list $6 $5) '() ) ) ) ) )
))  ; def grammar

(def equations '(
(circle
  (= pi 3.1415926535)
  (= diameter (* 2 radius))
  (= circumference (* pi diameter))
  (= circumference (* pi (* 2 radius)))
  (= area (* pi (expt radius 2)))
  (= area (* pi (expt (/ circumference (* 2 pi)) 2))) )

(sphere
  (= pi 3.1415926535)
  (= diameter (* 2 radius))
  (= circumference (* pi diameter))
  (= area (* 4 (* pi (expt radius 2))))
  (= volume (* (/ (* 4 pi) 3) (expt radius 3))) )

(fall
  (= gravity 9.80665)
  (= height   (* (/ gravity 2) (expt time 2)))
  (= velocity (* gravity time)) )

(lift
  (= gravity  9.80665)
  (= weight      (* gravity mass))
  (= work        (* weight height))
  (= speed       (/ height time))
  (= power       (* weight speed))
  (= power       (/ work time)) )

(cylinder
        (= pi 3.1415926535)
	(= diameter (* 2 radius))
	(= circumference (* pi diameter))
	(= area (* circumference length))
	(= volume (* (* pi (expt radius 2)) length)) )

(cone
  (= pi 3.141592635)
  (= diameter (* 2 radius))
  (= circumference (* pi diameter))
  (= side (sqrt (+ (expt radius 2) (expt height 2))))
  (= side-area (* pi (* radius side)))
  (= bottom-area (* pi (expt radius 2)))
  (= volume (* (/ pi 3) (* (expt radius 2) height)))
  (= total-area (+ side-area bottom-area)) )

(capacitator
  (= electric-field (/ voltage distance))
  (= force (* charge electric-field))
  (= dielectric-constant 1)
  (= capacitance (* (* epsilon0 dielectric-constant) (/ area distance)))
  (= charge (* capacitance voltage))
  (= work energy)
  (= energy (* 0.5 (* capacitane (expt voltage 2)))) )

(weight
  (= gravity 9.80665)
  (= weight (* gravity mass))
  (= density (/ mass volume)) )

(spring
  (= gravity 9.80665)
  (= weight (* gravity mass))
  (= force weight)
  (= force (* spring-constant stretch)) )

(square
  (= length side)
  (= diagonal  (* (sqrt 2) length))
  (= circumference (* 4 length))
  (= parameter (* 4 length))
  (= area (expt length 2)) )

(rectangle
  (= width length)
  (= width base)
  (= diagonal (sqrt (+ (expt width 2) (expt height 2))))
  (= circumference (+ (* width 2) (* 2 height)))
  (= parameter (+ (* width 2) (* 2 height)))
  (= area (* width height)) )

(units
  (= kilometer km)
  (= kilometers km)
  (= meter m)
  (= meters m)
  (= centimeter cm)
  (= centimeters cm)
  (= millimeter mm)
  (= millimeters mm)
  (= nanometers nm)
  (= nanometer nm)
  (= inch in)
  (= inches in)
  (= foot ft)
  (= feet ft)

  (= m (* 1000 km))
  (= cm (* 100 m))
  (= mm (* 10 cm))
  (= nm (* 1000000 mm))
  (= inches (* (/ 1 2.54) cm)) )
  (= ft (* 12 inches))

))  ; def equations


; find equations for topic
(defn findeqns [topic]
  (let [z (assocl topic equations)]
    (if (not (empty? z))
        (rest z)
        '())))

(def thelst '(is does))
; parse and answer physics questions
(defn phys [sentence]
  (def restrictions '())
  (def retrievals '())
  (initsent sentence)
  (let [qst (s)]
    (println qst)
    (if (and (member (first sentence) thelst) qst)
      (if (= (solveqns (findeqns (second (rhs qst)))
            (rest (rest (rhs qst)))
            (second qst) ) (last sentence))
        (println"YES")
        (println (str "No, the correct answer is " (solveqns (findeqns (second (rhs qst)))
        (rest (rest (rhs qst)))
        (second qst) ) ) ) )
      (println (solveqns (findeqns (second (rhs qst)))
        (rest (rest (rhs qst)))
        (second qst) ) ) ) ) ) 

; parse and answer physics questions
(defn physb [sentence]
  (def restrictions '())
  (def retrievals '())
  (initsent sentence)
  (let [qst (s)]
    (println qst) ))
