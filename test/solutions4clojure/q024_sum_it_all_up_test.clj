(ns solutions4clojure.q024-sum-it-all-up-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q024-sum-it-all-up :refer :all]))

(deftest answer-test
  (is (= (answer [1 2 3]) 6))
  (is (= (answer (list 0 -2 5 5)) 8))
  (is (= (answer #{4 2 1}) 7))
  (is (= (answer '(0 0 -1)) -1)))
