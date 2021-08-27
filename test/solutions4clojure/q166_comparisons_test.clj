(ns solutions4clojure.q166-comparisons-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q166-comparisons :refer :all]))

(deftest answer-test
  (is (= :gt (__ < 5 1)))
  (is (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum")))
  (is (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))
  (is (= :gt (__ > 0 2))))