(ns solutions4clojure.q085-power-set-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q085-power-set :refer :all]))

(deftest answer-test
  (is (= (__ #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}))
  (is (= (__ #{}) #{#{}}))
  (is (= (__ #{1 2 3})
        #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}))
  (is (= (count (__ (into #{} (range 10)))) 1024)))