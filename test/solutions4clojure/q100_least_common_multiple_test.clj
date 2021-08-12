(ns solutions4clojure.q100-least-common-multiple-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q100-least-common-multiple :refer :all]))

(deftest answer-test
  (is (== (__ 2 3) 6))
  (is (== (__ 5 3 7) 105))
  (is (== (__ 1/3 2/5) 2))
  (is (== (__ 3/4 1/6) 3/2))
  (is (== (__ 7 5/7 2 3/5) 210)))
