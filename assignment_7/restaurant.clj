; load files for restaurant example                  29 Nov 18

; (load-file "cs378/restaurant.clj")
; (load-files)
; (gramcom grammar)
; (ask '(where can i get american food in palo-alto))
; (ask '(where can i get ice-cream in berkeley))

(defn load-files []
(load-file "cs378.clj")
(load-file "atn.clj")
(load-file "gramcom.clj")
(load-file "restgram.clj")
(load-file "restlex.clj")  ; the big lexicon, remove for testing
(load-file "db.clj")
(load-file "restdb.clj")
)
