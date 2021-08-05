(ns solutions4clojure.q038_max_value-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q038_max_value :refer :all]))

(deftest answer-test
  (is (= (__ 1 8 3 4) 8))
  (is (= (__ 30 20) 30))
  (is (= (__ 45 67 11) 67)))
