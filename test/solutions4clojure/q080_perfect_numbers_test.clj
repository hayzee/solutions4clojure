(ns solutions4clojure.q080-perfect-numbers-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q080-perfect-numbers :refer :all]))

(deftest answer-test
  (is (= (__ 6) true))
  (is (= (__ 7) false))
  (is (= (__ 496) true))
  (is (= (__ 500) false))
  (is (= (__ 8128) true)))