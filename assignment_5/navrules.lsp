; Navigation rules for Prolog of Paul Graham's On Lisp      ; 02 Nov 18
; Gordon S. Novak Jr., University of Texas at Austin

; 23 Mar 05; 10-21 Apr 05; 21 Apr 05

; Use /p/bin/xgcl and be sure to enter the following just after starting GCL:
; (setq si::*multiply-stacks* 50)  ; prevents stack overflow

; Note that Graham's later Prolog version requires quoting constants
; (load "/projects/cs394p/onlisp.lisp")
; (load "/projects/cs394p/onlispfix.lisp")
; (load "/projects/cs394p/navrules.lsp")

; You may get a stack overflow or segfault.
; If so, restart Lisp and try again.
; It may take several runs to do all of the problems.

; this will work if you start lisp in the directory where these files are.
; You can copy-paste this into lisp to make loading easier.
(defun loadall ()
  (load "onlisp.lisp")
  (load "onlispfix.lisp")
  (load "navrules.lsp")
  (load "nav.lsp")
  (load "utmtrans.lsp") )

(defun norules () (setq *rules* nil))   ; clear the rule set
(norules)

; define a shorter name for with-inference
(or (fboundp 'inf)
    (setf (symbol-function 'inf) (symbol-function 'with-inference)))

; the cartesian version of ?c is ?c if ?c is xy-data
(<- (cartesian ?c ?c) (xy-data ?c) (cut))

; the cartesian version of ?p is ?c if the polar version of ?p is ?q
; and ?c is the result of calling rth2xy on ?q
(<- (cartesian ?p ?c) (polar ?p ?q) (is ?c `(rth2xy ,?q)) (cut))
                         ; could be (is ?c (list 'rth2xy ?p))

; the polar version of ?p is ?p if ?p is rth-data
(<- (polar ?p ?p) (rth-data ?p) (cut))

; the function rb2rth converts range-bearing to polar
(<- (polar ?rb ?rth) (range-bearing ?rb ?q) (is ?rth `(rb2rth ,?q)) (cut))

(<- (range-bearing ?p ?p) (rb-data ?p) (cut))

; the function dd2rb converts dist-dir to range-bearing
(<- (range-bearing ?rb ?rth) (dist-dir ?rb ?q) (is ?rth `(dd2rb ,?q)) (cut))

(<- (dist-dir ?p ?p) (dd-data ?p) (cut))

; the function ll2utm converts lat-long to cartesian (UTM)
(<- (cartesian ?p ?c) (lat-long ?p ?q) (is ?c `(ll2utm ,?q)) (cut))

(<- (lat-long ?p ?p) (ll-data ?p) (cut))

; the function city2ll converts a city to lat-long
(<- (lat-long ?p ?q) (city ?p) (is ?q `(city2ll ,?p)) (cut))

; commented out: this causes a loop for data that is neither xy nor rth
; The backchaining needs a loop detector, but doesn't have one.
; (<- (polar ?p ?q) (cartesian ?p ?c) (is ?q `(xy2rth ,?c)) (cut))

(<- (distance ?p1 ?p2 ?d)               ; distance from ?p1 to ?p2 is ?d
    (cartesian ?p1 ?p1c)
    (cartesian ?p2 ?p2c)
    (is ?d `(euclidist ,?p1c ,?p2c)) (cut))

(<- (bearing ?p1 ?p2 ?b)                ; bearing from ?p1 to ?p2 is ?b
    (cartesian ?p1 ?p1c)
    (cartesian ?p2 ?p2c)
    (is ?b `(xybearing ,?p1c ,?p2c)) (cut))

(<- (cartesian ?pt2 ?pt2c)
    (movefrom ?pt1 ?q ?pt2)            ; moving from ?pt1 by ?q goes to ?pt2
    (cartesian ?pt1 ?pt1c)
    (cartesian ?q ?qc)
    (is ?pt2c `(xysum ,?pt1c ,?qc)) (cut))

(<- (range-bearing ?p1 ?p2 ?rb)
    (cartesian ?p1 ?p1c)
    (cartesian ?p2 ?p2c)
    (is ?rb `(list (euclidist ,?p1c ,?p2c) (xybearing ,?p1c ,?p2c))) (cut))

; define a few variable types for testing
(progn
  (<- (rth-data 'rthvar))
  (<- (rth-data 'rthvar2))
  (<- (rb-data 'rbvar))
  (<- (xy-data 'xyvar))
  (<- (xy-data 'xyvar2))
  (<- (dd-data 'ddvar))
  (<- (ll-data 'llvar))
  (<- (city 'cvar))
)


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
(defun rth2xy (rth)
  (list (* (car rth) (cos (cadr rth)))
	(* (car rth) (sin (cadr rth)))))

; distance between two (x y) vectors
; (euclidist '(1 1) '(2 2))
(defun euclidist (v1 v2)
  (sqrt (+ (expt (- (car v1) (car v2)) 2)
	   (expt (- (cadr v1) (cadr v2)) 2))))

; bearing from one (x y) vector to another
; (xybearing '(1 1) '(5 4))
(defun xybearing (v1 v2)
  (let ((ang (atan (- (cadr v2) (cadr v1)) (- (car v2) (car v1)))))
    (setq ang (- (/ pi 2) ang))
    (if (< ang 0) (setq ang (+ ang (* 2 pi))))
    (if (> ang (* 2 pi))
	(setq ang (- ang (* 2 pi))) )
    (* ang (/ 180 pi)) ))    

; sum of two (x y) vectors
; (xysum '(1 2) '(3 4))
(defun xysum (v1 v2)
  (list (+ (car v1) (car v2)) (+ (cadr v1) (cadr v2))))

; (x y) to (r theta)
; (xy2rth '(4 3))
(defun xy2rth (xy)
  (list (sqrt (+ (expt (car xy) 2) (expt (cadr xy) 2)))
	(atan (cadr xy) (car xy))))

; (range bearing) to (r theta)
; (rb2rth '(100 225))
(defun rb2rth (rb)
  (let ((angle (- 450 (cadr rb))))
    (if (>= angle 360) (setq angle (- angle 360)))
    (list (car rb) (* angle (/ pi 180))) ))

; (distance direction) to (range bearing)
; (dd2rb '(100 sw))
(defun dd2rb (dd)
  (list (car dd)
	(cadr (assoc (cadr dd)
		     '((n 0) (nne 22.5) (ne 45) (ene 67.5) (e 90)
		       (ese 112.5) (se 135) (sse 157.5) (s 180)
		       (ssw 202.5) (sw 225) (wsw 247.5) (w 270)
		       (wnw 292.5) (nw 315) (nnw 337.5)))) ) )

; make a program from results and define it
(defun make-program (name args code)
  (let (def)
    (setq def (list 'defun name args code))
    (eval def)
    def))

; make a program by inference: assumes program name is a 1-arg predicate
(defun do-program (name args)
  (eval `(inf (,name ?result) (print (make-program ',name ',args ?result))) ) )

; Latitude/Longitude of a city by table lookup. Assumes West longitude.
; (city2ll 'austin)
(defun city2ll (city)
  (let ( ans (table '((austin (30 18) (97 47)) (amarillo (35 14) (101 50))
		      (dallas (32 47) (96 48)) (fort-worth (32 45) (97 20))
		      (houston (29 45) (95 25))  (new-braunfels (29 43) (98 09))
		      (san-antonio (29 25) (98 30)) (waco (31 33) (97 10))
		      (wichita-falls (33 55) (98 30)) (abilene (32 27) (99 45))
		      (el-paso (31 45) (106 30)) (brownsville (25 54) (97 30))
		      (lubbock (33 35) (101 53)) (beaumont (30 04) (94 06))
		      (galveston (29 17) (94 48))
		      (corpus-christi (27 47) (97 26)) )))
    (if (setq ans (cdr (assoc city table)))
	(list (+ (caar ans) (/ (cadar ans) 60.0))
	      (- (+ (caadr ans) (/ (cadadr ans) 60.0))))
        (list 0.0 0.0)) ))

; Austin      = E 616994.5  N 3352655.2   per http://www.cellspark.com/UTM.html
; Dallas      = E 706036.5  N 3629410.0
; San Antonio = E 548503.7  N 3254254.0       Zone 14R

; (ll2utm '(30.3 -97.78333))
(defun ll2utm (latlong) (toutm (car latlong) (cadr latlong)) )
;  (list (round (+ 616994 (* (- (cadr latlong) -97.78333) (- 616994 520619))))
;	(round (+ 3352655 (* (- (car latlong) 30.3) (- 3462870 3352655))))))

; find the UTM of a city
; (cityutm 'austin)      ; = (616994 3352655)
(defun cityutm (y) (LL2UTM (CITY2LL Y)))
