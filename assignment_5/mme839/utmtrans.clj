; utmtrans.clj    UTM converter   Gordon S. Novak Jr.    03 Apr 19

; 02 Nov 2018

; adapted from:
; http://home.hiwaay.net/~taylorc/toolbox/geography/geoutm.html
; "Programmers: The JavaScript source code in this document may be
;      copied and reused without restriction."
; Copyright 1997-1998 by Charles L. Taylor

(def sm-a 6378137.0)

(def sm-b 6356752.314)

(def sm-eccsquared 0.00669437999013)

(def utmscalefactor 0.9996)

(defn degtorad [deg] (* (/ deg 180.0) Math/PI))

(defn radtodeg [rad] (* (/ rad Math/PI) 180.0))

(defn arclengthofmeridian [phi]
  (let [
    n (/ (- sm-a sm-b) (+ sm-a sm-b))
    alpha
          (* 0.5
             (* (+ sm-a sm-b)
                (+ (+ 1.0 (* 0.25 (expt n 2))) (* 0.015625 (expt n 4)))))
    beta
          (* -1.5
             (+ (+ n (* -0.375 (expt n 3))) (* 0.0625 (expt n 5))))
    gamma (* 0.9375 (+ (expt n 2) (* -0.5 (expt n 4))))
    delta
          (* -0.7291666666666666 (+ (expt n 3) (* -0.5625 (expt n 5))))
    epsilon (* 0.615234375 (expt n 4))
    result
          (* alpha
             (+ (+ (+ (+ phi (* beta (Math/sin (* 2.0 phi))))
                      (* gamma (Math/sin (* 4.0 phi))))
                   (* delta (Math/sin (* 6.0 phi))))
                (* epsilon (Math/sin (* 8.0 phi)))))
    ]
    result))


(defn utmcentralmeridian [zone] (degtorad (+ -183.0 (* 6.0 zone))))

(defn footpointlatitude [y]
  (let [
    n (/ (- sm-a sm-b) (+ sm-a sm-b))
    alpha
          (* 0.5
             (* (+ sm-a sm-b)
                (+ (+ 1.0 (* 0.25 (expt n 2))) (* 0.015625 (expt n 4)))))
    yy (/ y alpha)
    beta
          (* 1.5
             (+ (+ n (* -0.5625 (expt n 3)))
                (* 0.3502604166666667 (expt n 5))))
    gamma
          (* 1.3125 (+ (expt n 2) (* -1.3095238095238096 (expt n 4))))
    delta
          (* 1.5729166666666666
             (+ (expt n 3) (* -2.0711920529801328 (expt n 5))))
    epsilon (* 2.142578125 (expt n 4))
    result
          (+ (+ (+ (+ yy (* beta (Math/sin (* 2.0 yy))))
                   (* gamma (Math/sin (* 4.0 yy))))
                (* delta (Math/sin (* 6.0 yy))))
             (* epsilon (Math/sin (* 8.0 yy))))
    ]
    result))


(defn maplatlontoxy [phi lambda lambda0]
  (let [
    ep2 (/ (- (expt sm-a 2) (expt sm-b 2)) (expt sm-b 2))
    nu2 (* ep2 (expt (Math/cos phi) 2))
    n (/ (expt sm-a 2) (* sm-b (Math/sqrt (+ 1 nu2))))
    tphi (Math/tan phi)
    t2 (* tphi tphi)
    l (- lambda lambda0)
    l3coef (+ 1.0 (- nu2 t2))
    l4coef (+ (+ 5.0 (- (* 9.0 nu2) t2)) (* 4.0 (* nu2 nu2)))
    l5coef
          (- (+ (+ 5.0 (- (* t2 t2) (* 18.0 t2))) (* 14.0 nu2))
             (* 58.0 (* t2 nu2)))
    l6coef
          (- (+ (+ 61.0 (- (* t2 t2) (* 58.0 t2))) (* 270.0 nu2))
             (* 330.0 (* t2 nu2)))
    l7coef
          (- (+ 61.0 (* 179.0 (- (* t2 t2) (* 2.6759776536312849 t2))))
             (* (* t2 t2) t2))
    l8coef
          (- (+ 1385.0
                (* 543.0 (- (* t2 t2) (* 5.7292817679558019 t2))))
             (* (* t2 t2) t2))
    xy0
          (+ (+ (+ (* (* n (Math/cos phi)) l)
                   (* 0.16666666666666667
                      (* (* (* n (expt (Math/cos phi) 3)) l3coef)
                         (expt l 3))))
                (* 0.008333333333333334
                   (* (* (* n (expt (Math/cos phi) 5)) l5coef) (expt l 5))))
             (* 1.984126984126984e-4
                (* (* (* n (expt (Math/cos phi) 7)) l7coef) (expt l 7))))
    xy1
          (+ (+ (+ (+ (arclengthofmeridian phi)
                      (* 0.5
                         (* (* (* tphi n) (expt (Math/cos phi) 2))
                            (expt l 2))))
                   (* 0.041666666666666667
                      (* (* (* (* tphi n) (expt (Math/cos phi) 4)) l4coef)
                         (expt l 4))))
                (* 0.001388888888888889
                   (* (* (* (* tphi n) (expt (Math/cos phi) 6)) l6coef)
                      (expt l 6))))
             (* 2.48015873015873e-5
                (* (* (* (* tphi n) (expt (Math/cos phi) 8)) l8coef)
                   (expt l 8))))
    ]
    (list xy0 xy1) ))


(defn mapxytolatlon [x y lambda0]
  (let [
    phif (footpointlatitude y)
    ep2 (/ (- (expt sm-a 2) (expt sm-b 2)) (expt sm-b 2))
    cf (Math/cos phif)
    nuf2 (* ep2 (expt cf 2))
    nf (/ (expt sm-a 2) (* sm-b (Math/sqrt (+ 1.0 nuf2))))
    nfpow nf
    tf (Math/tan phif)
    tf2 (* tf tf)
    tf4 (* tf2 tf2)
    x1frac (/ 1.0 (* nfpow cf))
    nfpow (* nfpow nf)
    x2frac (/ tf (* 2.0 nfpow))
    nfpow (* nfpow nf)
    x3frac (/ 1.0 (* 6.0 (* nfpow cf)))
    nfpow (* nfpow nf)
    x4frac (/ tf (* 24.0 nfpow))
    nfpow (* nfpow nf)
    x5frac (/ 1.0 (* 120.0 (* nfpow cf)))
    nfpow (* nfpow nf)
    x6frac (/ tf (* 720.0 nfpow))
    nfpow (* nfpow nf)
    x7frac (/ 1.0 (* 5040.0 (* nfpow cf)))
    nfpow (* nfpow nf)
    x8frac (/ tf (* 40320.0 nfpow))
    x2poly (- -1.0 nuf2)
    x3poly (- -1.0 (+ (* 2.0 tf2) nuf2))
    x4poly
          (- (- (- (+ (+ 5.0 (* 3.0 tf2)) (* 6.0 nuf2))
                   (* 6.0 (* tf2 nuf2)))
                (* 3.0 (* nuf2 nuf2)))
             (* 9.0 (* tf2 (* nuf2 nuf2))))
    x5poly
          (+ (+ (+ (+ 5.0 (* 28.0 tf2)) (* 24.0 tf4)) (* 6.0 nuf2))
             (* 8.0 (* tf2 nuf2)))
    x6poly
          (+ -61.0
             (* 162.0
                (- (* tf2 nuf2)
                   (* 0.5555555555555556
                      (+ (+ tf2 (* 0.5 tf4))
                         (* 1.1888888888888889 nuf2))))))
    x7poly
          (- -61.0
             (* 662.0
                (+ (+ tf2 (* 1.9939577039274926 tf4))
                   (* 1.0876132930513596 (* tf4 tf2)))))
    x8poly
          (+ (+ (+ 1385.0 (* 3633.0 tf2)) (* 4095.0 tf4))
             (* 1575.0 (* tf4 tf2)))
    philambda0
          (+ (+ (+ (+ phif (* (* x2frac x2poly) (* x x)))
                   (* (* x4frac x4poly) (expt x 4)))
                (* (* x6frac x6poly) (expt x 6)))
             (* (* x8frac x8poly) (expt x 8)))
    philambda1
          (+ (+ (+ (+ lambda0 (* x1frac x))
                   (* (* x3frac x3poly) (expt x 3)))
                (* (* x5frac x5poly) (expt x 5)))
             (* (* x7frac x7poly) (expt x 7)))
    ]
    (list philambda0 philambda1) ))


(defn latlontoutmxy [lat lon zone]
  (let [
    xy (maplatlontoxy lat lon (utmcentralmeridian zone))
    xy0 (+ 500000.0 (* (first xy) utmscalefactor))
    xy1 (* (second xy) utmscalefactor)
    ]
    (list xy0 
          (if (< xy1 0.0)
              (+ xy1 1.0e7)
              xy1) ) ))


(defn utmxytolatlon [x y zone southhemi]
  (let [
    cmeridian (utmcentralmeridian zone)
    xx (/ (- x 500000.0)
          utmscalefactor)
    yy (/ (if southhemi
              (- y 1.0e7)
              y)
          utmscalefactor)
    ]
    (mapxytolatlon xx yy cmeridian)))


(defn toutm [lat lon]
  (let [zone (+ 1 (int (Math/floor (+ 30.0 (* 1/6 lon))))) ]
    (if (and (>= lon -180.0)
             (<= lon 180.0)
             (>= lat -90.0)
             (<= lat 90.0))
        (latlontoutmxy (degtorad lat) (degtorad lon) zone) ) ))


(defn togeographic [x y zone southhemi]
  (if (and (> zone ) (<= zone 60))
      (let [ latlon (utmxytolatlon x y zone southhemi) ]
        (list (radtodeg (first latlon)) (radtodeg (second latlon)) ) ) ) )

