(ns solutions4clojure.q041-drop-every-nth-item)

(def __
  (fn [s n]
    (apply concat (partition-all (dec n) n s))))
