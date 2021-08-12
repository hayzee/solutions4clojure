(ns solutions4clojure.q100-least-common-multiple)

(defn gcd [a b]
       (if (zero? b)
         a
         (gcd b (mod a b))))

(defn lcm [n1 n2]
  (/ (* n1 n2)
    (gcd n1 n2)))

(def __ #(reduce lcm %&))
