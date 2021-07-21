(ns solutions4clojure.q065-black-box-testing-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q065-black-box-testing :refer :all]))

(deftest answer-test
  (is (= :map (__ {:a 1, :b 2})))
  (is (= :list (__ (range (rand-int 20)))))
  (is (= :vector (__ [1 2 3 4 5 6])))
  (is (= :set (__ #{10 (rand-int 5)})))
  (is (= [:map :set :vector :list] (map __ [{} #{} [] ()]))))
