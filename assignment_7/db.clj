;   db.clj            Tiny Database Program        27 Nov 18; 26 Apr 19
;   Gordon Novak

;   The following is probably the world's smallest Relational DBMS
;   (thanks to Lisp, which does most of the work).

(def restrictions '())
(def retrievals '())
(def postprocess nil)
(def tracedb nil)
(defn s [] )  ; stub

; find the n such that item is nth in list
(defn nthlistb [n item lst]
  (if (cons? lst)
      (if (= item (first lst))
          n
          (nthlistb (+ 1 n) item (rest lst))) ) )

(defn nthlist [item lst] (nthlistb 0 item lst))


; define a database
(defn defdb [name fields data]
  (def dbfields fields)
  (def dbdata data) )

;   Get the value of a field from the current tuple.
;   The argument is an unquoted field name.
(defn getdb [tuple prop] (nth tuple (nthlist prop dbfields)) )

;   Perform a database query.  Args are
;   the condition to be satisfied by the tuples that are desired,
;   and the action to be performed for each satisfied tuple.
(defn querydbb [lst condition action result]
  (if (empty? lst)
      (reverse result)
      (do (def dbtuple (first lst))
          (if (eval condition)
              (querydbb (rest lst) condition action
                        (cons (eval action) result))
              (querydbb (rest lst) condition action result) ) ) ) )

(defn querydb [condition action]
  (let [fnform  (list 'fn '[tuple] condition)
        fnformb (list 'fn '[tuple] action)]
    (map (eval fnformb) (filter (eval fnform) dbdata)) ))

; add a restriction to the restrictions list
(defn addrestrict [res] (def restrictions (cons res restrictions)))

; make a restriction call
(defn restrict [field value]
  (when tracedb
        (println "restrict" field value))
  (addrestrict (list '= (list 'getdb 'tuple (kwote field)) (kwote value)) ) )

; make a restriction call using specified op
(defn restrictb [op field value]
  (when tracedb
        (println "restrictb" op field value))
  (addrestrict (list op (list 'getdb 'tuple (kwote field)) (kwote value)) ) )

; add a retrieval request to the retrievals list
(defn addretrieval [ret] (def retrievals (cons ret retrievals)))

; make a restriction call
(defn retrieve [field]
  (when tracedb
        (println "retrieve" field))
  (addretrieval (list 'getdb 'tuple (kwote field)) ))

; define a final process whose argument is $$
(defn postpr [pattern]
  (def postprocess pattern) )

; ask a question of the database
(defn ask [sentence]
  (def restrictions '())
  (def retrievals '())
  (def postprocess nil)
  (initsent sentence)
  (s)
  (if (or (empty? restrictions) (empty? retrievals))
      (if (empty? restrictions)
            '(no restrictions so not doing it)
            '(no retrievals so not doing it))
      (let [ans (querydb (cons 'and restrictions) (cons 'list retrievals))]
        (if postprocess
            (eval (subst ans '$$ postprocess))
            ans )) ) )

; test a question of the database
(defn askb [sentence]
  (def restrictions '())
  (def retrievals '())
  (def postprocess nil)
  (initsent sentence)
  (s)
  (list (cons 'and restrictions) (cons 'list retrievals)) )


;  The following functions are examples to illustrate the
;  proper form of calls to the database functions.

(defn dbexample1 []              ; "WHO ORDERED WIDGETS IN APRIL" 
(querydb
	 '(and (= (getdb tuple 'part)
		      (quote widget))
	       (= (getdb tuple (quote date-month))
		      4))
	 '(list (getdb tuple (quote customer)))))

(defn dbexample2 []  ; "WHAT CUSTOMERS IN AUSTIN ORDERED WIDGETS FROM ACME" 
(querydb
	 '(and (= (getdb tuple (quote part))
		      (quote widget))
	       (= (getdb tuple (quote supplier))
		      (quote acme))
	       (= (getdb tuple (quote customer-city))
		      (quote austin)))
	 '(list (getdb tuple (quote customer)))))

(defn dbexample3 []          ; "what chinese restaurants are in mountain view" 
  (querydb
         '(and (equal (getdb tuple (quote foodtype))
                      (quote chinese))
               (equal (getdb tuple (quote city))
                      (quote mountain-view)))
         '(list (getdb tuple (quote restaurant)))))

; "what chinese restaurants in los altos are rated above 3.0" 
(defn dbexample4 []
  (querydb
         '(and (equal (getdb tuple (quote foodtype))
                      (quote chinese))
               (equal (getdb tuple (quote city))
                      (quote los-altos))
               (> (getdb tuple (quote rating)) 3.0))
         '(list (getdb tuple (quote restaurant))
		(getdb tuple (quote streetno)) (getdb tuple (quote street)))))
