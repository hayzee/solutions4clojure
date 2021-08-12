(ns solutions4clojure.q107-simple-closures)

(def __
  (fn clos [n]
    (fn [x] (int (Math/pow x n)))))
