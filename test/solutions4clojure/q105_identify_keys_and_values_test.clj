(ns solutions4clojure.q105-identify-keys-and-values-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q105-identify-keys-and-values :refer :all]))

(deftest answer-test
  (is (= {} (__ [])))
  (is (= {:a [1]} (__ [:a 1])))
  (is (= {:a [1], :b [2]} (__ [:a 1, :b 2])))
  (is (= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4]))))
