(ns solutions4clojure.q022-count-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q022-count-a-sequence :refer :all]))

(deftest answer-test
  (is (= (__ '(1 2 3 3 1)) 5))
  (is (= (__ "Hello World") 11))
  (is (= (__ [[1 2] [3 4] [5 6]]) 3))
  (is (= (__ '(13)) 1))
  (is (= (__ '(:a :b :c)) 3)))
