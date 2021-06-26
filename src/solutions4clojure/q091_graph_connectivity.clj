(ns solutions4clojure.q091-graph-connectivity)

(def __
  (fn [s]
    (let [rec-conn (fn [[s1 s2]]
                     (vector (set (flatten (filter #(some s1 %) s2))) (filter #(not (some s1 %)) s2)))
          result (drop-while #(not (empty? (first %))) (iterate rec-conn  [(set (first s)) (rest s)]))]
      (empty? (second (first result))))))
