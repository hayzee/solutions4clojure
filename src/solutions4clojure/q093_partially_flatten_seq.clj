(ns solutions4clojure.q093-partially-flatten-seq)

(def __
  (fn flatulate [s]
    (when (seq s)
      (let [[f & r] s]
        (if (and
              (coll? f)
              (some coll? f))
          (lazy-cat (flatulate f) (flatulate r))
          (cons f (flatulate r)))))))