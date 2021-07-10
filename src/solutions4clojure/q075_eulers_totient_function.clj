(ns solutions4clojure.q075-eulers-totient-function)

(def __
  (fn eulers-totient [n]
    (count (map first (filter #(= (% 1) 1) (map #(vector % ((fn [a b] (if (= b 0) a (recur b (mod a b)))) n %)) (range 1 (inc n))))))))
