(ns solutions4clojure.q091-graph-connectivity-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q091-graph-connectivity :refer :all]))

(deftest answer-test
  (is (= true (__ #{[:a :a]})))
  (is (= true (__ #{[:a :b]})))
  (is (= false (__ #{[1 2] [2 3] [3 1]
                     [4 5] [5 6] [6 4]})))
  (is (= true (__ #{[1 2] [2 3] [3 1]
                    [4 5] [5 6] [6 4] [3 4]})))
  (is (= false (__ #{[:a :b] [:b :c] [:c :d]
                     [:x :y] [:d :a] [:b :e]})))
  (is (= true (__ #{[:a :b] [:b :c] [:c :d]
                    [:x :y] [:d :a] [:b :e] [:x :a]}))))
