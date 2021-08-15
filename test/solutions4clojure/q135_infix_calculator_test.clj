(ns solutions4clojure.q135-infix-calculator-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q135-infix-calculator :refer :all]))

(deftest answer-test
  (is (= 7  (__ 2 + 5)))
  (is (= 42 (__ 38 + 48 - 2 / 2)))
  (is (= 8  (__ 10 / 2 - 1 * 2)))
  (is (= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))))