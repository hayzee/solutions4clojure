(ns solutions4clojure.q022-count-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q022-count-a-sequence :refer :all]))

(deftest answer-test
  (is (= (answer '(1 2 3 3 1)) 5))
  (is (= (answer "Hello World") 11))
  (is (= (answer [[1 2] [3 4] [5 6]]) 3))
  (is (= (answer '(13)) 1))
  (is (= (answer '(:a :b :c)) 3)))
