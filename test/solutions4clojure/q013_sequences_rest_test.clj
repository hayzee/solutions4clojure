(ns solutions4clojure.q013-sequences-rest-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q013-sequences-rest :refer :all]))

(deftest check_answer
  (is (= __ (rest [10 20 30 40]))))