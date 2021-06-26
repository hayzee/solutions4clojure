(ns solutions4clojure.q106-number-maze-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q106-number-maze :refer :all]))

(deftest answer-test
  (is (= 1 (__ 1 1)))
  (is (= 3 (__ 3 12)))
  (is (= 3 (__ 12 3)))
  (is (= 3 (__ 5 9)))
  (is (= 9 (__ 9 2)))
  (is (= 5 (__ 9 12))))
