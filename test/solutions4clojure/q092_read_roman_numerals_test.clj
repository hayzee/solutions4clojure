(ns solutions4clojure.q092-read-roman-numerals-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q092-read-roman-numerals :refer :all]))

(deftest answer-test
  (is (= 14 (__ "XIV")))
  (is (= 827 (__ "DCCCXXVII")))
  (is (= 3999 (__ "MMMCMXCIX")))
  (is (= 48 (__ "XLVIII"))))
