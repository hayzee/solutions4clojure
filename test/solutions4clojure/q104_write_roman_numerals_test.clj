(ns solutions4clojure.q104-write-roman-numerals-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q104-write-roman-numerals :refer :all]))

(deftest answer-test
  (is (= "I" (__ 1)))
  (is (= "XXX" (__ 30)))
  (is (= "IV" (__ 4)))
  (is (= "CXL" (__ 140)))
  (is (= "DCCCXXVII" (__ 827)))
  (is (= "MMMCMXCIX" (__ 3999)))
  (is (= "XLVIII" (__ 48))))
