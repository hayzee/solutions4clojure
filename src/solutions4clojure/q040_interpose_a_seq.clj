(ns solutions4clojure.q040-interpose-a-seq)

(def __
  (fn [e s]
    (butlast (mapcat vector s (repeat e)))))
