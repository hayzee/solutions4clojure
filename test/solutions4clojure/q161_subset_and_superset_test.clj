(ns solutions4clojure.q161-subset-and-superset-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q161-subset-and-superset :refer :all]))

(deftest answer-test
  (is (clojure.set/superset? __ #{2}))
  (is (clojure.set/subset? #{1} __))
  (is (clojure.set/superset? __ #{1 2}))
  (is (clojure.set/subset? #{1 2} __)))