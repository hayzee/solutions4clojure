(ns solutions4clojure.q131-sum-some-subsets-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q131-sum-some-subsets :refer [answer]]))

(deftest answer-test
  (is (= true  (answer #{-1 1 99}
                 #{-2 2 888}
                 #{-3 3 7777})))
  (is (= false (answer #{1}
                 #{2}
                 #{3}
                 #{4})))
  (is (= true  (answer #{1})))
  (is (= false (answer #{1 -3 51 9}
                 #{0}
                 #{9 2 81 33})))
  (is (= true  (answer #{1 3 5}
                 #{9 11 4}
                 #{-3 12 3}
                 #{-3 4 -2 10})))
  (is (= false (answer #{-1 -2 -3 -4 -5 -6}
                 #{1 2 3 4 5 6 7 8 9})))
  (is (= true  (answer #{1 3 5 7}
                 #{2 4 6 8})))
  (is (= true  (answer #{-1 3 -5 7 -9 11 -13 15}
                 #{1 -3 5 -7 9 -11 13 -15}
                 #{1 -1 2 -2 4 -4 8 -8})))
  (is (= true  (answer #{-10 9 -8 7 -6 5 -4 3 -2 1}
                 #{10 -9 8 -7 6 -5 4 -3 2 -1})))
  )