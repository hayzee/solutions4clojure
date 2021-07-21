(ns solutions4clojure.q070-word-sorting-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q070-word-sorting :refer :all]))

(deftest answer-test
  (is (= (__  "Have a nice day.")
        ["a" "day" "Have" "nice"]))
  (is (= (__  "Clojure is a fun language!")
        ["a" "Clojure" "fun" "is" "language"]))
  (is (= (__  "Fools fall for foolish follies.")
        ["fall" "follies" "foolish" "Fools" "for"])))