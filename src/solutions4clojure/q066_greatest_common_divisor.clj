(ns solutions4clojure.q066-greatest-common-divisor)

(def __
  (fn gcd [a b]
    (if (zero? b)
      a
      (gcd b (mod a b)))))
