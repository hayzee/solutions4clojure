(ns solutions4clojure.q118-reimplement-map-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q118-reimplement-map :refer :all]))

(deftest answer-test
  (is (= [3 4 5 6 7]
        (__ inc [2 3 4 5 6])))
  (is (= (repeat 10 nil)
        (__ (fn [_] nil) (range 10))))
  (is (= [1000000 1000001]
        (->> (__ inc (range))
          (drop (dec 1000000))
          (take 2)))))