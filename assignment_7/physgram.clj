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

(defn s []) ; stub

(defn number []
  (if (number? atnword)
       atnword))

(def lexicon
 '((propname (radius diameter circumference area
	      volume height velocity time
	      weight power height work speed mass
				charge capacitance voltage density
				spring-constant stretch length width
				diagonal parameter force))
   (a/an     (a an))
   (the/its  (the its))
   (wi/wh    (with where))
	 (whats	   (what's whats what calculate))
   (andd    (and))
   (doesequal (= of is equal equals))
   (objname  (circle sphere fall lift cone capacitator weight spring cylinder
							rectangle square))
))  ; def lexicon

(defn objprops [])   ; to keep clojure happy

(def grammar '(
  (param     -> ((the/its)? (propname)) $2)
  (quantity  -> ((number)) $1)
  (object    -> ((a/an)? (objname) (wi/wh)? (objprops))
                   (cons 'object (cons $2 $4)))
  (objprop   -> ((a/an)? (the/its)? (propname) (doesequal)? (quantity)) (list $3 $5))
  (objprops  -> ((objprop) (andd)? \, ? (objprops))  (cons $1 $4))
  (objprops  -> ((objprop))  (list $1))
  (s         -> (what is (param) of ? (object)) (list 'calculate $3 $5))
  (s         -> ((whats)? (param) of ? (object)) (list 'calculate $2 $4))
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
	(= diameter (* 2 radius))
	(= circumferenc (* pi diameter))
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
))  ; def equations


; find equations for topic
(defn findeqns [topic]
  (let [z (assocl topic equations)]
    (if (not (empty? z))
        (rest z)
        '())))

; parse and answer physics questions
(defn phys [sentence]
  (def restrictions '())
  (def retrievals '())
  (initsent sentence)
  (let [qst (s)]
    (println qst)
    (solveqns (findeqns (second (rhs qst)))
              (rest (rest (rhs qst)))
              (second qst) ) ) )

; parse and answer physics questions
(defn physb [sentence]
  (def restrictions '())
  (def retrievals '())
  (initsent sentence)
  (let [qst (s)]
    (println qst) ))
