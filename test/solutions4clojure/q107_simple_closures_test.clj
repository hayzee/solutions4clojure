(ns solutions4clojure.q107-simple-closures-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q107-simple-closures :refer :all]))

(deftest answer-test
  (is
    (=
      256
      ((__ 2) 16)
      ((__ 8) 2)))
  (is (= [1 8 27 64] (map (__ 3) [1 2 3 4])))
  (is (= [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4]))))