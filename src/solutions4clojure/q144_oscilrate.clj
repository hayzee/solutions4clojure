(ns solutions4clojure.q144-oscilrate)

(def __
  (fn oscilrate [n & sf]
    (let [looper (fn looper [n sf]
                   (lazy-seq (cons n (looper ((first sf) n) (rest sf)))))]
      (looper n (flatten (repeat sf))))))
