(ns solutions4clojure.q135-infix-calculator)

(def __
  (fn infix [& expr]
    (let [[f s t & r] expr]
      (if s
        (apply infix (cons (eval (list s f t)) r))
        f))))