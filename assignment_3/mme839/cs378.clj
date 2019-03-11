; cs378.clj                Gordon S. Novak Jr.       19 Nov 18

; (load-file "/u/novak/cs378/cs378.clj")
;                    tst.xyz.core
(ns user
  (:use clojure.test )
  (:require [clojure.string :as str] ))
;            [clojure.math.numeric-tower :as math]

(def lstnum '(85 90 85 96 86 83 86 88 84 82 66 71 98 76 75 98 88 85))

; test whether x is a cons
(defn consb? [x] (and (seq? x) (not (empty? x))))

(defmacro cons? [x]
  (if (seq? x)
      (list 'consb? x)
      (list 'and (list 'seq? x) (list 'not (list 'empty? x)))))

(defn varp [v]
  (and (symbol? v)
       (str/starts-with? (name v) "?") ) )

(defn assocl [key lst]
  (if (empty? lst)
      nil
      (if (= (first (first lst)) key)
          (first lst)
          (assocl key (rest lst)) ) ) )

(defn equal [x y]
  (if (cons? x)
      (and (cons? y)
           (equal (first x) (first y))
           (equal (rest x) (rest y)))
      (= x y) ))

(defn null? [x] (or (= x nil) (= x '()) ) )

(defn matchb [pat inp bindings]
  (if (and (seq? bindings) (not (empty? bindings)))
      (if (cons? pat)
          (and (cons? inp)
               (matchb (rest pat) 
                       (rest inp)
                       (matchb (first pat)
                               (first inp) bindings)))
          (if (varp pat)
              (if (not (empty? (assocl pat bindings)))
                  (and (equal inp
                        (second (assocl pat bindings)))
                       bindings)
                  (cons (list pat
                              (if (vector? inp)
                                  (apply list inp) ; convert vector to list
                                  inp))
                        bindings))
              (and (= pat inp) bindings)))) )

(defn match [pat inp]  (matchb pat inp '((t t))))

(defn subst [new old form]
  (if (cons? form)
      (cons (subst new old (first form))
            (subst new old (rest form)))
      (if (= form old)
          new
          form) ) )

(defn sublis [alist form]
  (if (cons? form)
      (cons (sublis alist (first form))
            (sublis alist (rest form)))
      (let [binding (assocl form alist)]
          (if binding
              (second binding)
              form) ) ) )

(defn copy-tree [form]
  (if (cons? form)
      (cons (copy-tree (first form))
            (copy-tree (rest form)))
      form) )

(defn transform [pattern-pair input]
  (let [bindings (match (first pattern-pair) input)]
    (if bindings
        (sublis bindings (second pattern-pair)) ) ))

(defn op [e] (first e))
(defn lhs [e] (second e))
(defn rhs [e] (first (rest (rest e))))

(defn append [x y]
  (if (empty? x)
      y
      (cons (first x)
            (append (rest x) y)) ) )

(defn member [item lst]
  (if (empty? lst)
      nil
      (if (= item (first lst))
          lst
          (member item (rest lst)) ) ) )

(defn intersection [x y]
  (if (empty? x)
      '()
      (if (member (first x) y)
          (cons (first x)
                (intersection (rest x) y))
          (intersection (rest x) y) ) ) )

(defn trrevb [lst answer]
  (if (empty? lst)
      answer
      (trrevb (rest lst)
              (cons (first lst) answer)) ) )

(defn trrev [lst] (trrevb lst '()))

(defn lengthb [lst answer]
  (if (empty? lst)         ; test for base case
      answer               ; answer for base case
      (lengthb (rest lst)  ; recursive call
               (+ answer 1)) ) )   ; update answer

(defn length [lst]
  (lengthb lst 0))         ; init extra variable

(defn square [x] (* x x))

(defn abs [x] (if (< x 0) (- x) x) )

(defn sqrt [x] (Math/sqrt x))
(defn exp [x] (Math/exp x))
(defn log [x] (Math/log x))
(defn sin [x] (Math/sin x))
(defn cos [x] (Math/cos x))
(defn tan [x] (Math/tan x))
(defn atan2 [y x] (Math/atan2 y x))


(defn expt [x n]
  (if (or (float? x) (double? x))
      (Math/pow x n)
      (if (= n 0)
          1
          (if (> n 0)
              (* x (expt x (- n 1)))
              (/ 1 (expt x (- n))) ) ) ) )

; test whether x is a cons
(defn cons? [x] (and (seq? x) (not (empty? x))))

; test whether the predicate pred is true of every item in lst
;   (every (fn [x] (> x 3)) '(4 5 6))  =  true
(defn every [pred lst]
  (if (empty? lst)
      true
      (and (pred (first lst))
           (every pred (rest lst))) ) )

; test if list x is a subset of list y
(defn subset? [x y] (every (fn [z] (member z y)) x))

; test if list se4t x equals list set y
(defn set= [x y] (and (subset? x y) (subset? y x)) )

(defn third [lst] (first (rest (rest lst))))

(defn kwote [x]
  (if (or (number? x)
          (and (cons? x)
               (= (first x) 'quote)))
      x
      (list 'quote x)))

; (mapcat fn lst) is like mapcan in Lisp.

