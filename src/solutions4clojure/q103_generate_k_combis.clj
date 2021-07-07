(ns solutions4clojure.q103-generate-k-combis)

(def __
  (fn fixed-combis [n s]
    (let [combis (fn combis [s]
                   (if (empty? s)
                     #{}
                     (conj
                       (set (for [e s
                                  r (combis (disj s e))]
                              r))
                       s)))]
      (set (filter #(= n (count %)) (combis s))))))
