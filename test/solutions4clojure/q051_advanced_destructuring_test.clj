(ns solutions4clojure.q051-advanced-destructuring-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q051-advanced-destructuring :refer :all]))

(deftest answer-test
  (is (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))))