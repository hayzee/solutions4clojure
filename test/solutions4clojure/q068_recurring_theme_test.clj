(ns solutions4clojure.q068-recurring-theme-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q068-recurring-theme :refer :all]))

(deftest answer-test
  (is (= __
        (loop [x 5
               result []]
          (if (> x 0)
            (recur (dec x) (conj result (+ 2 x)))
            result)))))