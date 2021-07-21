(ns solutions4clojure.q089-graph-tour-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q089-graph-tour :refer :all]))

(deftest answer-test
  (is (= true (__ [[:a :b]])))
  (is (= false (__ [[:a :a] [:b :b]])))
  (is (= false (__ [[:a :b] [:a :b] [:a :c] [:c :a]
                    [:a :d] [:b :d] [:c :d]])))
  (is (= true (__ [[1 2] [2 3] [3 4] [4 1]])))
  (is (= true (__ [[:a :b] [:a :c] [:c :b] [:a :e]
                   [:b :e] [:a :d] [:b :d] [:c :e]
                   [:d :e] [:c :f] [:d :f]])))
  (is (= true (__ [[:a :b] [:a :c] [:c :b] [:a :e]
                   [:b :e] [:a :d] [:b :d] [:c :e]
                   [:d :e] [:c :f] [:d :f]]))))
