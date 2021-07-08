(ns solutions4clojure.q114-global-take-while)

(def __
  (fn gtw [n p [fs & rs]]
    (let [m (if (p fs) (dec n) n)]
      (when (pos? m)
        (lazy-seq (cons fs (gtw m p rs)))))))
