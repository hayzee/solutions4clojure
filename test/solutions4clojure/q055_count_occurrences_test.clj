(ns solutions4clojure.q055-count-occurrences-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q055-count-occurrences :refer :all]))

(deftest answer-test
  (is (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
  (is (= (__ [:b :a :b :a :b]) {:a 2, :b 3}))
  (is (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})))