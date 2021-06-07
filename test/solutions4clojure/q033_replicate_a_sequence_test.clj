(ns solutions4clojure.q033-replicate-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q033-replicate-a-sequence :refer :all]))

(deftest answer-test
  (is (= (answer [1 2 3] 2) '(1 1 2 2 3 3)))
  (is (= (answer [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
  (is (= (answer [4 5 6] 1) '(4 5 6)))
  (is (= (answer [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (answer [44 33] 2) [44 44 33 33])))