(ns solutions4clojure.q195-parentheses-again-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q195-parentheses-again :refer :all]))

(deftest answer-test
  (is (= [#{""} #{"()"} #{"()()" "(())"}] (map (fn [n] (__ n)) [0 1 2])))
  (is (= #{"((()))" "()()()" "()(())" "(())()" "(()())"} (__ 3)))
  (is (= 16796 (count (__ 10))))
  (is (= (nth (sort (filter #(.contains ^String % "(()()()())") (__ 9))) 6) "(((()()()())(())))"))
  (is (= (nth (sort (__ 12)) 5000) "(((((()()()()()))))(()))")))
