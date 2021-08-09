(ns solutions4clojure.q066-greatest-common-divisor-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q066-greatest-common-divisor :refer :all]))

(deftest answer-test
  (is (= (__ 2 4) 2))
  (is (= (__ 10 5) 5))
  (is (= (__ 5 7) 1))
  (is  (= (__ 1023 858) 33)))