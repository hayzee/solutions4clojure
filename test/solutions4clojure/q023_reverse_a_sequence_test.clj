(ns solutions4clojure.q023-reverse-a-sequence-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q023-reverse-a-sequence :refer [answer]]))

(deftest answer-test
  (is (= (answer [1 2 3 4 5]) [5 4 3 2 1]))
  (is (= (answer (sorted-set 5 7 2 7)) '(7 5 2)))
  (is (= (answer [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])))
