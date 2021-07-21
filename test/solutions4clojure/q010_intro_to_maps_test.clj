(ns solutions4clojure.q010-intro-to-maps-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q010-intro-to-maps :refer :all]))

(deftest answer-test
  (is (= __ ((hash-map :a 10, :b 20, :c 30) :b)))
  (is (= __ (:b {:a 10, :b 20, :c 30}))))