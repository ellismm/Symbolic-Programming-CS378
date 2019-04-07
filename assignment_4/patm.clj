; patm.clj                Gordon S. Novak Jr.       12 Oct 18

; (load-file "/u/novak/cs378/patm.clj")

(def tracetransform false)    ; redefine to true to turn on traces

; test for unary operation
(defn unary? [e] (and (cons? e) (null? (rest (rest e))) ) )

; print tabs
(defn printtabs [tabs]
  (if (> tabs 0)
      (do (print "   ") (printtabs (- tabs 1)) ) ) )

; signature
(defn codeprint [item tabs] )

; print a list of items
(defn codeprintlist [lst tabs]
  (if (cons? lst)
      (if (= (first lst) \tab)
          (codeprintlist (rest lst) (+ tabs 1))
          (if (= (first lst) 'zuntab)
              (codeprintlist (rest lst) (- tabs 1))
              (if (= (first lst) \return)
                  (do (println)
                      (printtabs tabs)
                      (codeprintlist (rest lst) tabs) )
                  (do (codeprint (first lst) tabs)
                      (codeprintlist (rest lst) tabs)) ) ) ) ) )

; print a code item.  tabs is number of tabs of current indent
(defn codeprint [item tabs]
  (if (null? item)
      (print "null")
      (if (cons? item)
          (codeprintlist item tabs)
          (if (= item \return)
              (println)
              (print item)) ) ) )

; Transform a single item.  (if no change, returns original.
(defn transformrb [pats input]
  (if (null? pats)
      input
      (if (null? input)
          input
          (let [bindings (match (first (first pats)) input)]
            (if bindings
                (let [result (sublis bindings (second (first pats)))]
                  (when tracetransform
                    (println "Input:   " input)
                    (println "Pattern: " (first pats))
                    (println "Result:  " result) )
                  result)
                (transformrb (rest pats) input)) ) ) ) )

(defn transformlst [allpats input]) ; signature

; Transform a single item.  (if no change, returns original.
(defn transformr [allpats input]
;    println("transformr:  " input)
    (if (cons? input)
        (let [listt (transformlst allpats input)]
    ;       println("   lst =  " listt)
          (transformrb allpats (transformlst allpats listt)))
        (transformrb allpats input) ) )

; Transform a list of arguments.  (if no change, returns original.
(defn transformlst [allpats input]
  (if (null? input)
      input
      (let [restt (transformlst allpats (rest input))
            thist (transformr allpats (first input))]
        (if (and (identical? thist (first input))
                 (identical? restt (rest input)) )
            input
            (cons thist restt) ) ) ) )

; Transform a single item repeatedly, until fixpoint (no change).
(defn transformfp [allpats input]
;    println("transformfp: " input)
  (let [trans (transformr allpats input)]
    (if (= trans input)
        input
;    println("    result = " trans)
        (transformfp allpats trans) ) ) )      ; potential loop!
