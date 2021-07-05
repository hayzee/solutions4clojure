(ns solutions4clojure.q112-sequs-horribilis)

(def __
  (fn sh [ac [f & r]]
    (let [sum-under (fn [s] (apply + (flatten s)))]
      (if f
        (if (coll? f)
          (concat (list (sh ac f)) (sh (- ac (sum-under f)) r))
          (if (neg? (- ac f))
            (list)
            (concat (list f) (sh (- ac f) r))))
        (list)))))
