(ns solutions4clojure.q112-sequs-horribilis-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q112-sequs-horribilis :refer :all]))

(deftest answer-test
  (is (=  (__ 10 [1 2 [3 [4 5] 6] 7])
        '(1 2 (3 (4)))))
  (is (=  (__ 30 [1 2 [3 [4 [5 [6 [7 8]] 9]] 10] 11])
        '(1 2 (3 (4 (5 (6 (7))))))))
  (is (=  (__ 9 (range))
        '(0 1 2 3)))
  (is (=  (__ 1 [[[[[1]]]]])
        '(((((1)))))))
  (is (=  (__ 0 [1 2 [3 [4 5] 6] 7])
        '()))
  (is (=  (__ 0 [0 0 [0 [0]]])
        '(0 0 (0 (0)))))
  (is (=  (__ 1 [-10 [1 [2 3 [4 5 [6 7 [8]]]]]])
        '(-10 (1 (2 3 (4)))))))
