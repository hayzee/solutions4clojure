(ns solutions4clojure.q122-read-a-binary-number-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q122-read-a-binary-number :refer :all]))

(deftest answer-test
  (is (= 0     (__ "0")))
  (is (= 7     (__ "111")))
  (is (= 8     (__ "1000")))
  (is (= 9     (__ "1001")))
  (is (= 255   (__ "11111111")))
  (is (= 1365  (__ "10101010101")))
  (is (= 1365  (__ "10101010101"))))