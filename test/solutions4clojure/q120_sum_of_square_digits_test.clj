(ns solutions4clojure.q120-sum-of-square-digits-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q120-sum-of-square-digits :refer :all]))

(deftest answer-test
  (is (= 8 (__ (range 10))))
  (is (= 19 (__ (range 30))))
  (is (= 50 (__ (range 100))))
  (is (= 50 (__ (range 1000)))))