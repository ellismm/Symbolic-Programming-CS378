; gram.clj          Gordon S. Novak Jr.          16 Nov 18

; (load-file "atn.clj") for ATN functions, db.clj for database, gramcom.clj

; Note: lexicon parts-of-speech must be disjoint from grammar nonterminals.

; First we define a lexicon and grammar for this application.

(def lexicon
 '((part     (pliers tire (tires tire) blimp (blimps blimp)
	      widget (widgets widget)))
   (supplier (sears acme goodyear))
   (customer (ut hp mcc))
   (city     (austin dallas el-paso))
   (month    ((january 1) (jan 1) (february 2) (feb 2) (march 3) (mar 3)
	      (april 4) (apr 4) (may 5) (june 6) (jun 6) (july 7) (jul 7)
	      (august 8) (aug 8) (september 9) (sept 9) (sep 9)
	      (october 10) (oct 10) (november 11) (nov 11) (december 12)
	      (dec 12)))   ))

; Define grammar after defining lexicon.

(def grammar '(
  (cust -> (customer)        (retrieve 'customer))
  (cust -> (customers)       (retrieve 'customer))
  (loc  -> (in (city))       (restrict 'customer-city $2))
  (date -> (in (month))      (restrictb '= 'date-month $2))
  (date -> (before (month))  (restrictb '< 'date-month $2))
  (date -> (after (month))   (restrictb '> 'date-month $2))
  (parts -> ((part))         (restrict 'part $1))
  (supp -> (from (supplier)) (restrict 'supplier $2))
  (s -> (what (cust) (loc)? ordered (parts)? (supp)? (date)?)
        nil)
  (s -> (who (loc)? ordered (parts)? (supp)? (date)?)
        (retrieve 'customer))
  ))

; (gramcom grammar)     ; compile the grammar
; (ask '(who ordered tires from sears))


;  The following makes a tiny database for testing.
(def dbfields '(order-number date-day date-month date-year part
                                supplier customer customer-city))

(def dbdata
       '((101  1  4 2018 widget acme     apple austin)
	 (102  1  1 2018 pliers sears    ut    austin)
	 (103  5  3 2018 tire   sears    hp    dallas)
	 (104 19  4 2018 tire   sears    ut    el-paso)
	 (105 25  4 2018 tire   goodyear apple austin)
	 (106 22  2 2018 blimp  goodyear ut    dallas)
	 (107 25 12 2017 tire   goodyear ut    austin)
	 (108 11 11 2017 pliers acme     hp    austin)
	 (109  7  4 2018 widget acme     ut    dallas)
	 (110  9  4 2018 widget sears    apple austin)))
