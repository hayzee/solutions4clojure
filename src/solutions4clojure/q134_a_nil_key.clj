(ns solutions4clojure.q134-a-nil-key)

(def __
  (fn [k m]
    (and (contains? m k) (nil? (k m)))))