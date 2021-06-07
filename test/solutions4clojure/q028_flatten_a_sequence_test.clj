(ns solutions4clojure.q028-flatten-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q028-flatten-a-sequence :refer :all]))

(deftest answer-test
  (is (= (answer '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (is (= (answer ["a" ["b"] "c"]) '("a" "b" "c")))
  (is (= (answer '((((:a))))) '(:a))))