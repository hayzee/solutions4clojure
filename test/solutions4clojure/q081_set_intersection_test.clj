(ns solutions4clojure.q081-set-intersection-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q081-set-intersection :refer :all]))

(deftest answer-test
  (is (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3}))
  (is (= (__ #{0 1 2} #{3 4 5}) #{}))
  (is (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})))
