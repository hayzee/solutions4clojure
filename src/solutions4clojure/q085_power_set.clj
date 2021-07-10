(ns solutions4clojure.q085-power-set)

(def __
  (fn [s]
    (set (map set (loop [[f & r] (seq s) p '(())]
                    (if f (recur r (concat p (map (partial cons f) p)))
                          p))))))