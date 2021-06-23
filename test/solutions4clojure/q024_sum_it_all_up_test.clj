(ns solutions4clojure.q024-sum-it-all-up-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q024-sum-it-all-up :refer :all]))

(deftest answer-test
  (is (= (__ [1 2 3]) 6))
  (is (= (__ (list 0 -2 5 5)) 8))
  (is (= (__ #{4 2 1}) 7))
  (is (= (__ '(0 0 -1)) -1)))
