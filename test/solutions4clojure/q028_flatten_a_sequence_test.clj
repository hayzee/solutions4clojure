(ns solutions4clojure.q028-flatten-a-sequence-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q028-flatten-a-sequence :refer :all]))

(deftest answer-test
  (is (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (is (= (__ ["a" ["b"] "c"]) '("a" "b" "c")))
  (is (= (__ '((((:a))))) '(:a))))