(ns solutions4clojure.q088-symmetric-difference-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q088-symmetric-difference :refer :all]))

(deftest answer-test
  (is (= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}))
  (is (= (__ #{:a :b :c} #{}) #{:a :b :c}))
  (is (= (__ #{} #{4 5 6}) #{4 5 6}))
  (is (= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})))