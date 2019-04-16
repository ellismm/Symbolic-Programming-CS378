;     nav.clj           G. Novak               ; 06 Apr 19

; Examples and stubs for Navigation by Deductive Synthesis

; Edit this code to fill in the stubs for nav4 through nav8.

; execute the following first:
; (load-file "cs378/navload.clj")
(load-file "cs378.clj")
(load-file "asg1.clj")
(load-file "asg2.clj")
(load-file "utmtrans.clj")
(load-file "navfns.clj")
(load-file "unify.clj")

(def pi Math/PI)

; some simple examples to test basic conversions
(def navbasics
  '(((xy-data (xyvar)))
    ((rth-data (rthvar)))
    ((rth-data (rthvar2)))
    ((ll-data (llvar))) ) )

; what is the cartesian version of xyvar?  (xyvar itself)
; (backchfr '(cartesian (xyvar) c) navbasics navr)

; what is the cartesian version of rthvar?
; (backchfr '(cartesian (rthvar) c) navbasics navr)

; what is the distance between two rthvars?
; (backchfr '(distance (rthvar) (rthvar2) d) navbasics navr)

; what is the distance between an rthvar and lat-long?
; (backchfr '(distance (rthvar) (llvar) d) navbasics navr)

; 1. find the distance z from an xy point a to a rth point b
; (fnfor 'test1 '(a b) '(distance (a) (b) z) nav1 navr)
; (test1  '(10 10) (list 30 (/ Math/PI 6)))     ; =  16.74469341998643
(def nav1 '( ((xy-data (a)))
             ((rth-data (b)))
             ))

; 2: move from point c by amount d to arrive at f.
; what is the distance from e to f?
(def nav2 '( ((xy-data (c)))                  ; c is an x-y point
             ((rth-data (d)))                 ; d is a r-theta distance
             ((xy-data (e)))                  ; e is a point
             ((movefrom (c) (d) (f))) ) )     ; move from c by d to arrive at f
; (fnfor 'test2 '(c d e) '(distance (e) (f) z) nav2 navr)
; (test2 '(4 3) (list 5 (/ Math/PI 6)) '(6 8))      ; =  3.417527165116794

; 3: move from point g by amount h to arrive at k.
; move from point k by amount i to arrive at l.
; what is the distance from l to j?
(def nav3 '(
  ((xy-data (g)))
  ((rth-data (h)))
  ((rb-data (i)))
  ((xy-data (j)))
  ((movefrom (g) (h) (k)))  ; move from point g by amount h to arrive at k.
  ((movefrom (k) (i) (l)))  ; move from point k by amount i to arrive at l.
))
(fnfor 'test3 '(g h i j) '(distance (l) (j) d) nav3 navr)  ; distance l to j
; (test3 '(4 3) (list 5 (/ Math/PI 6)) '(5 30) '(6 8))    ; = 5.165219445900749

; 4: distance between cities m and n
(def nav4 '(
;  add clauses for inputs (m) and (n)
	 ((city (m)))
	 ((city (n)))
   ))
(fnfor 'test4 '(m n) '(distance (m) (n) d) nav4 navr)  ; distance m to n
; (test4 'austin 'dallas)    ; = 290726.27195112396

; 5: distance between a range-bearing point p and a distance-direction point q.
(def nav5 '(
;  add clauses for inputs (p) and (q)
	((rb-data (p)))
	((dd-data (q)))
))
(fnfor 'test5 '(p q) '(distance (p) (q) d) nav5 navr)  ; distance m to n
; (test5 '(10 60) '(12 ne))   ;  = 3.4896707137814036 (checked)

; 6: A trip starts at a city r and travels a specified distance-direction s,
; arriving at the point t.
; Find the bearing from the resulting position t to another city, u.
(def nav6 '(
;  add clauses for inputs r s u and point t
	((city (r)))
	((dd-data (s)))
	((movefrom (r) (s) (t)))
	((city (u)))
))
(fnfor 'test6 '(r s u) '(bearing (t) (u) b) nav6 navr)  ; bearing from t to u
; (test6 'austin '(70000 w) 'san-antonio)   ; = 179.1213003823762

; 7: A helicopter starts at Austin and flies 80000 meters
; at bearing 20 to pick up a clue; then it flies 100000 meters nw
; and picks up a treasure. Find the range and bearing to take
; the treasure to Dallas
; v = starting city
; w = range and bearing for first leg to point z
; x = distance-direction for second leg to point zz
; y = destination city
(def nav7 '(
	((city (v)))
	((rb-data (w)))
	((movefrom (v) (w) (z)))
	((dd-data (x)))
	((movefrom (z) (x) (zz)))
	((city (y)))
;  add clauses for inputs v w x y and program
))
(fnfor 'test7 '(v w x y) '(range-bearing (zz) (y) b) nav7 navr)
; (test7 'austin '(80000 20) '(100000 nw) 'dallas)
;   = (186156.121384753 45.331381413000365)

; 8: range and bearing from one city to another city
(def nav8 '(
;  add clauses for inputs v y and program
	((city (v)))
	((city (y)))
))
(fnfor 'test8 '(v y) '(range-bearing (v) (y) b) nav8 navr)
; range/bearing from city v to city y

; (test8 'austin 'waco)   ; = (150576.87131283034 22.254882151769802)
; (test8 'austin 'dallas) ; = (290726.27195112396 17.834911296485686)
