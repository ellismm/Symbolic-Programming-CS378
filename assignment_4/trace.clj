; trace.clj               05 Oct 18

; These functions were extracted from Github Clojure trace project:

;;  Sept 18, 2011: Luc Préfontaine
;;
;;  * moved it to new contrib modular struct
;;
;;  * made it 1.2/1.3 compliant
;;
;;  * supported doc strings
;;
;;  * added a trace-form macro, from Jonathan Fischer
;; 
;;  December 3, 2008:
;; 
;;  * replaced *trace-out* with tracer
;; 
;;  * made trace a function instead of a macro
;;  (suggestion from Stuart Halloway)
;; 
;;  * added trace-fn-call
;; 
;;  June 9, 2008: first version
;;;
;;(ns ^{:author "Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg, Michał Marczyk, Don Jackson"
;;      :doc "This file defines simple tracing macros to help you see what your code is doing."}
;;     clojure.tools.trace
;;  (:use [clojure.pprint]))

(def ^{:doc "Current stack depth of traced function calls." :private true :dynamic true}
      *trace-depth* 0)

(defn ^{:private true} trace-indent
  "Returns an indentation string based on *trace-depth*"
  []
  (apply str (take *trace-depth* (repeat "| "))))

(defn ^{:private true} tracer
  "This function is called by trace. Prints to standard output, but
may be rebound to do anything you like. 'name' is optional."
  [name value]
  (println (str "TRACE" (when name (str " " name)) ": " value)))

(defn trace
  "Sends name (optional) and value to the tracer function, then
returns value. May be wrapped around any expression without
affecting the result."
  ([value] (trace nil value))
  ([name value]
     (tracer name (pr-str value))
     value))

(defn ^{:skip-wiki true} trace-fn-call
  "Traces a single call to a function f with args. 'name' is the
symbol name of the function."
  [name f args]
  (let [id (gensym "t")]
    (tracer id (str (trace-indent) (pr-str (cons name args))))
    (let [value (binding [*trace-depth* (inc *trace-depth*)]
                  (apply f args))]
      (tracer id (str (trace-indent) "=> " (pr-str value)))
      value)))

(defmacro deftrace
  "Use in place of defn; traces each call/return of this fn, including
   arguments. Nested calls to deftrace'd functions will print a
   tree-like structure.
   The first argument of the form definition can be a doc string"
  [name & definition]
  (let [doc-string (if (string? (first definition)) (first definition) "")
        fn-form  (if (string? (first definition)) (rest definition) definition)]
    `(do
       (declare ~name)
       (let [f# (fn ~@fn-form)]
         (defn ~name ~doc-string [& args#]
           (trace-fn-call '~name f# args#))))))

