(ns solutions4clojure.q116-prime-sandwich)

(def __
  (fn [n]
    (let [prime? (fn [n] (and (pos? n) (not (some #(= 0 (mod n %)) (range 2 n)))))]
      (if (and (> n 2) (prime? n))
        (let [np (some #(when (prime? %) %) (iterate inc (inc n)))
              pp (some #(when (prime? %) %) (range (dec n) 0 -1))]
          (if (= n (/ (+ np pp) 2))
            true
            false))
        false))))

; previous solution
;(def __
;  (fn balanced-prime?[n]
;    (let [prime? (fn [n]
;                   (and (> n 1) (empty? (filter #(= 0 (mod n %)) (range 2 n)))))
;          next-prime (fn[n]
;                       (let [inc-n (inc n)]
;                         (if (prime? inc-n)
;                           inc-n
;                           (recur inc-n))))
;          prev-prime (fn[n]
;                       (if (pos? n)
;                         (let [dec-n (dec n)]
;                           (if (prime? dec-n)
;                             dec-n
;                             (recur dec-n)))
;                         n))]
;      (if (prime? n)
;        (let [np (next-prime n)
;              pp (prev-prime n)]
;          (if (= n (/ (+ np pp) 2))
;            true
;            false))
;        false))))
