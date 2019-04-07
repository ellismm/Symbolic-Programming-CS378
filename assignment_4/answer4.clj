user=> (testall)
    (= s (* 0.5 (* a (expt t 2))))
        (= s (* 0.5 (* a (expt t 2))))
        (= a (/ (/ s 0.5) (expt t 2)))
        (= t (sqrt (/ (/ s 0.5) a)))
    (= s (+ s0 (* v t)))
        (= s (+ s0 (* v t)))
        (= s0 (- s (* v t)))
        (= v (/ (- s s0) t))
        (= t (/ (- s s0) v))
    (= a (/ f m))
        (= a (/ f m))
        (= f (* a m))
        (= m (/ f a))
    (= v (* a t))
        (= v (* a t))
        (= a (/ v t))
        (= t (/ v a))
    (= f (/ (* m v) t))
        (= f (/ (* m v) t))
        (= v (/ (* f t) m))
        (= m (/ (* f t) v))
        (= t (/ (* m v) f))
    (= f (/ (* m (expt v 2)) r))
        (= f (/ (* m (expt v 2)) r))
        (= v (sqrt (/ (* f r) m)))
        (= m (/ (* f r) (expt v 2)))
        (= r (/ (* m (expt v 2)) f))
    (= h (- h0 (* 4.94 (expt t 2))))
        (= h (- h0 (* 4.94 (expt t 2))))
        (= h0 (+ h (* 4.94 (expt t 2))))
        (= t (sqrt (/ (- h0 h) 4.94)))
    (= c (sqrt (+ (expt a 2) (expt b 2))))
        (= c (sqrt (+ (expt a 2) (expt b 2))))
        (= b (sqrt (- (expt c 2) (expt a 2))))
        (= a (sqrt (- (expt c 2) (expt b 2))))
    (= v (* v0 (- 1.0 (exp (/ (- t) (* r c))))))
        (= v (* v0 (- 1.0 (exp (/ (- t) (* r c))))))
        (= v0 (/ v (- 1.0 (exp (/ (- t) (* r c))))))
        (= c (/ (/ (- t) (log (- 1.0 (/ v v0)))) r))
        (= r (/ (/ (- t) (log (- 1.0 (/ v v0)))) c))
        (= t (- (* (log (- 1.0 (/ v v0))) (* r c))))
(+ 0 foo)
  simplified:  foo
(* fum 1)
  simplified:  fum
(- (- y))
  simplified:  y
(- (- x y))
  simplified:  (- y x)
(+ foo (* fum 0))
  simplified:  foo
(deriv x x)
  derivative:  1
  simplified:  1
(deriv 3 x)
  derivative:  0
  simplified:  0
(deriv z x)
  derivative:  0
  simplified:  0
(deriv (+ x 3) x)
  derivative:  (+ 1 0)
  simplified:  1
(deriv (* x 3) x)
  derivative:  (+ (* x 0) (* 3 1))
  simplified:  3
(deriv (* 5 x) x)
  derivative:  (+ (* 5 1) (* x 0))
  simplified:  5
(deriv (sin x) x)
  derivative:  (* (cos x) 1)
  simplified:  (cos x)
(deriv (sin (* 2 x)) x)
  derivative:  (* (cos (* 2 x)) (+ (* 2 1) (* x 0)))
  simplified:  (* (cos (* 2 x)) 2)
(deriv (+ (expt x 2) (+ (* 3 x) 6)) x)
  derivative:  (+ (* 2 (* (expt x (- 2 1)) 1)) (+ (+ (* 3 1) (* x 0)) 0))
  simplified:  (+ (* 2 x) 3)
(deriv2 (+ (expt x 2) (+ (* 3 x) 6)) x)
  derivative:  (+ (+ (* 2 (+ (* (expt x (- 2 1)) 0) (* 1 (* (- 2 1) (* (expt x (- (- 2 1) 1)) 1))))) (* (* (expt x (- 2 1)) 1) 0)) (+ (+ (+ (* 3 0) (* 1 0)) (+ (* x 0) (* 0 1))) 0))
  simplified:  2
(deriv (sqrt (+ (expt x 2) 2)) x)
  derivative:  (/ (+ (* 2 (* (expt x (- 2 1)) 1)) 0) (* 2 (sqrt (+ (expt x 2) 2))))
  simplified:  (/ x (sqrt (+ (expt x 2) 2)))
(deriv (log (expt (+ 1 x) 3)) x)
  derivative:  (/ (* 3 (* (expt (+ 1 x) (- 3 1)) (+ 0 1))) (expt (+ 1 x) 3))
  simplified:  (/ (* 3 (expt (+ 1 x) 2)) (expt (+ 1 x) 3))
Lisp:   (* fum 7)
Java:
(fum * 7)
Lisp:   (setq x y)
Java:
x = y;

Lisp:   (setq x (+ x 1))
Java:
x++;

Lisp:   (setq area (* pi (expt r 2)))
Java:
area = (Math.PI * Math.pow(r, 2));

Lisp:   (if (> x 7) (setq y x))
Java:
if ( (x > 7) )
   y = x;
   
Lisp:   (if (or (> x 7) (< y 3)) (setq y x))
Java:
if ( ((x > 7) || (y < 3)) )
   y = x;
   
Lisp:   (if (and (> x 7) (not (< y 3))) (setq y x))
Java:
if ( ((x > 7) && (! (y < 3))) )
   y = x;
   
Lisp:   (defn factorial [n] (if (<= n 1) 1 (* n (factorial (- n 1)))))
Java:
public static Object factorial (Object n)
{
   if ( (n <= 1) )
      return 1;
   else return (n * factorial((n - 1)));
   }


(defn addnums [tree] (if (cons? tree) (+ (addnums (first tree)) (addnums (rest tree))) (if (number? tree) tree 0)))

public static Object addnums (Object tree)
{
   if ( consp(tree) )
      return (addnums(first((Cons)tree)) + addnums(rest((Cons)tree)));
   else if ( numberp(tree) )
      return tree;
   else return 0;
   }


(defn countstrings [tree] (if (cons? tree) (+ (countstrings (first tree)) (countstrings (rest tree))) (if (string? tree) 1 0)))

public static Object countstrings (Object tree)
{
   if ( consp(tree) )
      return (countstrings(first((Cons)tree)) + countstrings(rest((Cons)tree)));
   else if ( stringp(tree) )
      return 1;
   else return 0;
   }


(defn copytree [tree] (if (cons? tree) (cons (copytree (first tree)) (copytree (rest tree))) tree))

public static Object copytree (Object tree)
{
   if ( consp(tree) )
      return cons(copytree(first((Cons)tree)), copytree(rest((Cons)tree)));
   else return tree;
   }


(defn mintree [tree] (if (cons? tree) (min (mintree (first tree)) (mintree (rest tree))) (if (number? tree) tree 999999)))

public static Object mintree (Object tree)
{
   if ( consp(tree) )
      return Math.min(mintree(first((Cons)tree)), mintree(rest((Cons)tree)));
   else if ( numberp(tree) )
      return tree;
   else return 999999;
   }


(defn conses [tree] (if (cons? tree) (add1 (conses (first tree)) (conses (rest tree))) 0))

public static Object conses (Object tree)
{
   if ( consp(tree) )
      return add1(conses(first((Cons)tree)), conses(rest((Cons)tree)));
   else return 0;
   }

Cannonball:
(= t (/ (* v (sin theta)) g))
