(ns solutions4clojure.q056-find-distinct-items-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q056-find-distinct-items :refer :all]))

(deftest answer-test
  (is (= (__ [1 2 1 3 1 2 4]) [1 2 3 4]))
  (is (= (__ [:a :a :b :b :c :c]) [:a :b :c]))
  (is (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
  (is (= (__ (range 50)) (range 50))))
