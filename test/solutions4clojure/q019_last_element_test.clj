(ns solutions4clojure.q019-last-element-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q019-last-element :refer :all]))

(deftest answer-test
  (is (= (answer [1 2 3 4 5]) 5))
  (is (= (answer '(5 4 3)) 3))
  (is (= (answer ["b" "c" "d"]) "d")))
