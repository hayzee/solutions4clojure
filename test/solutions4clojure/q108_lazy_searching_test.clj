(ns solutions4clojure.q108-lazy-searching-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q108-lazy-searching :refer :all]))

(deftest answer-test
  (is (= 3 (__ [3 4 5])))
  (is (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
  (is (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
  (is (= 64 (__ (map #(* % % %) (range)) ;; perfect cubes
              (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
              (iterate inc 20))))) ;; at least as large as 20
