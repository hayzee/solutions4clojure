(ns solutions4clojure.q061-map-construction)

(def __
  (fn [& v]
    (into {} (apply map vector v))))
