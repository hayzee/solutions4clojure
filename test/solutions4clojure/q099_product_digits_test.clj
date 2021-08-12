(ns solutions4clojure.q099-product-digits-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q099-product-digits :refer :all]))

(deftest answer-test
  (is (= (__ 1 1) [1]))
  (is (= (__ 99 9) [8 9 1]))
  (is (= (__ 999 99) [9 8 9 0 1])))