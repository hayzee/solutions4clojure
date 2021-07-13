(ns solutions4clojure.q067-prime-numbers)

(def __
  #(take % (filter (fn [p] (not-any? (fn [n] (zero? (mod p n))) (range 2 p))) (drop 2 (range)))))
