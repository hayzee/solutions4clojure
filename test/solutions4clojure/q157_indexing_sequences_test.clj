(ns solutions4clojure.q157-indexing-sequences-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q157-indexing-sequences :refer :all]))

(deftest answer-test
  (is (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
  (is (= (__ [0 1 3]) '((0 0) (1 1) (3 2))))
  (is (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])))