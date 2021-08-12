(ns solutions4clojure.q100-least-common-multiple)

(def __
  (fn [& n]
    (let [gcd (fn gcd [a b]
                (if (zero? b)
                  a
                  (gcd b (mod a b))))
          lcm (fn lcm [n1 n2]
                 (/ (* n1 n2)
                   (gcd n1 n2)))]
    (reduce lcm n))))
