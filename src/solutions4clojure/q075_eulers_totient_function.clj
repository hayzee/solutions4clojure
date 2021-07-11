(ns solutions4clojure.q075-eulers-totient-function)

(def __
  (fn [n]
    (count
      (filter
        #(= 1 %)
        (map #((fn gcd [n m]
                 (if (zero? m)
                   n
                   (recur m (mod n m)))) n %)
          (range 1 (inc n)))))))

; previous answers
;(def __
;  (fn [n]
;    (let [gcd
;          (fn [n m] (if (zero? m)
;                      n
;                      (recur m (mod n m))))]
;      (count (filter #(= 1 %) (map #(gcd n %) (range 1 (inc n))))))))
;
;(def __
;  (fn [n]
;      (count (filter #(= 1 %) (map #((fn gcd [n m] (if (zero? m)
;                                                 n
;                                                 (recur m (mod n m)))) n %) (range 1 (inc n)))))))
;
;(def __
;  (fn eulers-totient [n]
;    (count (map first (filter #(= (% 1) 1) (map #(vector % ((fn [a b] (if (= b 0) a (recur b (mod a b)))) n %)) (range 1 (inc n))))))))
