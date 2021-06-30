(ns solutions4clojure.q084-transitive-closure)

(def __
  (fn [binrels]
    (let [tranclos (fn tranclos [[f s t] binrels]
                     (if-let [tgt (first (second (split-with #(not= t (first %)) binrels)))]
                       (cons [f s t] (tranclos (vec (cons f tgt)) binrels))
                       (list [f s t])))]
      (->>
        (map #(vec (cons (first %) % )) binrels)
        (map #(tranclos % binrels))
        (map set)
        (reduce clojure.set/union)
        (map (fn [[f _ t]] [f t]))
        set))))