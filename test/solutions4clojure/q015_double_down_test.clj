(ns solutions4clojure.q015-double-down-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q015-double-down :refer :all]))

(deftest answer-test
  (is (= (__ 2) 4))
  (is (= (__ 3) 6))
  (is (= (__ 11) 22))
  (is (= (__ 7) 14)))


