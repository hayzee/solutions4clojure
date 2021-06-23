(ns solutions4clojure.q030-compress-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q030-compress-a-sequence :refer :all]))

(deftest answer-test
  (is (= (apply str (__ "Leeeeeerrroyyy")) "Leroy"))
  (is (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (is (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))