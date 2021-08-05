(ns solutions4clojure.q039-interleave-two-seqs-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q039-interleave-two-seqs :refer :all]))

(deftest answer-test
  (is (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
  (is  (= (__ [1 2] [3 4 5 6]) '(1 3 2 4)))
  (is  (= (__ [1 2 3 4] [5]) [1 5]))
  (is  (= (__ [30 20] [25 15]) [30 25 20 15])))