(ns solutions4clojure.q046-flipping-out-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q046-flipping-out :refer :all]))

(deftest answer-test
  (is (= 3 ((__ nth) 2 [1 2 3 4 5])))
  (is (= true ((__ >) 7 8)))
  (is (= 4 ((__ quot) 2 8)))
  (is (= [1 2 3] ((__ take) [1 2 3 4 5] 3))))