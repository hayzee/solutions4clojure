(ns solutions4clojure.q067-prime-numbers-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q067-prime-numbers :refer :all]))

(deftest answer-test
  (is (= (__ 2) [2 3]))
  (is (= (__ 5) [2 3 5 7 11]))
  (is (= (last (__ 100)) 541)))