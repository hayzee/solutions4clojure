(ns solutions4clojure.q132-Insert-between-two-items-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q132-Insert-between-two-items :refer [answer]]))

(deftest answer-test
  (is (= '(1 :less 6 :less 7 4 3) (answer < :less [1 6 7 4 3])))
  (is (= '(2) (answer > :more [2])))
  (is (= [0 1 :x 2 :x 3 :x 4]  (answer #(and (pos? %) (< % %2)) :x (range 5))))
  (is (empty? (answer > :more ())))
  (is (= [0 1 :same 1 2 3 :same 5 8 13 :same 21]
        (take 12 (->> [0 1]
                   (iterate (fn [[a b]] [b (+ a b)]))
                   (map first) ; fibonacci numbers
                   (answer (fn [a b] ; both even or both odd
                         (= (mod a 2) (mod b 2)))
                     :same)))))
  )
