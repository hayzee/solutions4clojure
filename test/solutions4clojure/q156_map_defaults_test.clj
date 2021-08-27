(ns solutions4clojure.q156-map-defaults-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q156-map-defaults :refer :all]))

(deftest answer-test
  (is (= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0}))
  (is (= (__ "x" [1 2 3]) {1 "x" 2 "x" 3 "x"}))
  (is (= (__ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})))