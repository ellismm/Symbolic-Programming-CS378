; atn.clj                Gordon S. Novak Jr.       29 Apr 19

; cf. W.A. Woods, "Transition Network Grammars for Natural
;     Language Analysis", Communications of the ACM, Oct. 1970.

(def lexicon '())
(def grammar '())

(def atnsent     nil)   ;  remainder of input sentence
(def atnnext     nil)   ;  next position in input sentence
(def atnword     nil)   ;  current word being examined
(def atnsavesent nil)   ;  stack of saved positions in sentence for backup

;   The following manipulate scanner position in the sentence.

;   set atnword for current position
(defn setword []
  (def atnword (first atnsent))
  (def atnnext (rest atnsent))  )

; multi-word words not yet implemented
;  (let (multi)
;    (setq atnword (first atnsent))
;    (setq atnnext (rest atnsent))
;    (if (and (symbolp atnword)
;	     (setq multi (some #'(lambda (x)
;				   (if (equalfront (car x) (rest atnsent)) x))
;			       (get atnword 'multiwords))))
;	(progn (setq atnword (cadr multi))
;	       (setq atnnext (nthcdr (1+ (length (car multi))) atnsent)))) ))

; initialize for a new sentence
(defn initsent [sent]
  (def atnsent sent)
  (def atnsavesent '())
  (setword))

;   move to next word
(defn nextword    [] (def atnsent atnnext) (setword) true)

;   save the current position: push onto atnsavesent
(defn saveptr [] (def atnsavesent (cons atnsent atnsavesent)))   ; push

;   pop the stack on success
(defn success []
  (def atnsavesent (rest atnsavesent)) )

;   restore position on failure, return nil
(defn fail    []
  (def atnsent (first atnsavesent))
  (def atnsavesent (rest atnsavesent))
  (setword)
  nil)

; test if front part of lst is equal to front
(defn equalfront [front lst]
  (or (empty? front)
      (and (= (first front) (first lst))
	   (equalfront (rest front) (rest lst)))))

; find a word as either member or first of cons in list
(defn findwd [word lst]
  (if (cons? lst)
      (if (cons? (first lst))
          (if (= word (first (first lst)))
              (first lst)
              (findwd word (rest lst)))
          (if (= word (first lst))
              (first lst)
              (findwd word (rest lst))) ) ) )

; test whether current word is in a given category
; (wordcat 'month)  where atnword = oct
(defn wordcat [category]
  (if (= category 'number)
      (and (number? atnword) atnword)
      (let [catlst (assocl category lexicon)
            wd     (findwd atnword (second catlst))]
        (if (cons? wd)
            (if (empty? (rest wd))
                (first wd)
                (second wd))
            wd) )))

; test whether a word is in a given category in the lexicon
; (wordcat 'month)  where atnword = oct
(defn testlex [word category]
  (let [catlst (assocl category lexicon)
        wd     (findwd word (second catlst))]
    (if (cons? wd)
        (if (empty? (rest wd))
            (first wd)
            (second wd))
        wd) ))

; test whether something is a word category
(defn cat? [category] (assocl category lexicon))

; test whether something is a word category
(defn nonterm? [word] (assocl word grammar))

; (defn multi-return-fn []  [:1 :2 :3])
; (let [[x y z] (multi-return-fn)]  (println x) (println y) (println z))

