(ns solutions4clojure.q083-a-half-truth-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q083-a-half-truth :refer :all]))

(deftest answer-test
  (is (= false (__ false false)))
  (is (= true (__ true false)))
  (is (= false (__ true)))
  (is (= true (__ false true false)))
  (is (= false (__ true true true)))
  (is (= true (__ true true true false))))