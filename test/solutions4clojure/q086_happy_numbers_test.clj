(ns solutions4clojure.q086-happy-numbers-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q086-happy-numbers :refer :all]))

(deftest answer-test
  (is (= (__ 7) true))
  (is (= (__ 986543210) true))
  (is (= (__ 986543210) true))
  (is (= (__ 3) false)))