; navfns.clj          Gordon Novak          06 Apr 2019

; navigation functions


; representations:
; (x y)
; (r theta)          ; theta is is radians, counter-clockwise from x axis.
; (range bearing)    ; bearing is in degrees, clockwise from north (y axis)
; (dist direction)   ; direction such as SW
; (lat long)         ; N, E in floating degrees.  West is negative.
; (easting northing) ; Universal Transverse Mercator or UTM
; UTM is basically (x y) with distances in meters
; easting is 500000 + meters east of centerline of a 6-degree strip of longitude
; northing is meters north of the equator

; convert (r theta) to (x y)
; (rth2xy (list 10 (/ pi 6)))
(defn rth2xy [rth]
  (list (* (first rth) (Math/cos (second rth)))
	(* (first rth) (Math/sin (second rth)))))

; distance between two (x y) vectors
; (euclidist '(1 1) '(2 2))
(defn euclidist [v1 v2]
  (Math/sqrt (+ (expt (- (first v1) (first v2)) 2)
                (expt (- (second v1) (second v2)) 2))))

; bearing from one (x y) vector to another
; (xybearing '(1 1) '(5 4))
(defn xybearing [v1 v2]
  (let [ang (- (/ Math/PI 2)
               (Math/atan2 (- (second v2) (second v1))
                           (- (first v2) (first v1))))
        angb (if (< ang 0)
                 (+ ang (* 2 Math/PI))
                 ang)
        angc (if (> angb (* 2 Math/PI))
                 (- angb (* 2 Math/PI))
                 angb) ]
    (* angc (/ 180 Math/PI)) ))

; sum of two (x y) vectors
; (xysum '(1 2) '(3 4))
(defn xysum [v1 v2]
  (list (+ (first v1) (first v2)) (+ (second v1) (second v2))))

; (x y) to (r theta)
; (xy2rth '(4 3))
(defn xy2rth [xy]
  (list (Math/sqrt (+ (expt (first xy) 2) (expt (second xy) 2)))
	(Math/atan2 (second xy) (first xy))))

; (range bearing) to (r theta)
; (rb2rth '(100 225))
(defn rb2rth [rb]
  (let [angle (- 450 (second rb))]
    (list (first rb)
          (* (if (>= angle 360)
                 (- angle 360)
                 angle)
             (/ Math/PI 180))) ))

; (distance direction) to (range bearing)
; (dd2rb '(100 sw))
(defn dd2rb [dd]
  (list (first dd)
	(second (assocl (second dd)
		     '((n 0) (nne 22.5) (ne 45) (ene 67.5) (e 90)
		       (ese 112.5) (se 135) (sse 157.5) (s 180)
		       (ssw 202.5) (sw 225) (wsw 247.5) (w 270)
		       (wnw 292.5) (nw 315) (nnw 337.5)))) ) )

; make a program from results and define it
(defn make-program [name args code]
  (let [def (list 'defn name (vec args) code) ]
    (eval def)
    def))

; make a program by inference: assumes program name is a 1-arg predicate
;(defn do-program [name args]
;  (eval `(inf (,name ?result) (print (make-program ',name ',args ?result))) ) )

(def cityll
     '((austin (30 18) (97 47)) (amarillo (35 14) (101 50))
       (dallas (32 47) (96 48)) (fort-worth (32 45) (97 20))
       (houston (29 45) (95 25))  (new-braunfels (29 43) (98 9))
       (san-antonio (29 25) (98 30)) (waco (31 33) (97 10))
       (wichita-falls (33 55) (98 30)) (abilene (32 27) (99 45))
       (el-paso (31 45) (106 30)) (brownsville (25 54) (97 30))
       (lubbock (33 35) (101 53)) (beaumont (30 4) (94 6))
       (galveston (29 17) (94 48))
       (corpus-christi (27 47) (97 26)) ))

; Latitude/Longitude of a city by table lookup. Assumes West longitude.
; (city2ll 'austin)
(defn city2ll [city]
  (let [ ans (assocl city cityll) ]
    (if ans
	(list (+ (first (second ans))
                 (/ (second (second ans)) 60.0))
	      (- (+ (first (third ans))
                    (/ (second (third ans)) 60.0))))
        (list 0.0 0.0)) ))

; Austin      = E 616994.5  N 3352655.2   per http://www.cellspark.com/UTM.html
; Dallas      = E 706036.5  N 3629410.0
; San Antonio = E 548503.7  N 3254254.0       Zone 14R

; (ll2utm '(30.3 -97.78333))
(defn ll2utm [latlong] (toutm (first latlong) (second latlong)) )
;  (list (round (+ 616994 (* (- (second latlong) -97.78333) (- 616994 520619))))
;	(round (+ 3352655 (* (- (first latlong) 30.3) (- 3462870 3352655))))))

; find the UTM of a city
; (cityutm 'austin)      ; = (616994 3352655)
(defn cityutm [y] (ll2utm (city2ll y)))
