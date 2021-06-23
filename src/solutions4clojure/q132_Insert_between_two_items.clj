(ns solutions4clojure.q132-Insert-between-two-items)

(def __ (fn [p k s]
              (let [r (map (fn [[x y]] (if (p x y) [x k y] [x y])) (partition 2 1 s))]
                (if (seq r)
                  (flatten (cons (first r) (map rest (rest r))))
                  s))))