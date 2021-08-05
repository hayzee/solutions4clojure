(ns solutions4clojure.q041-drop-every-nth-item-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q041-drop-every-nth-item :refer :all]))

(deftest answer-test
  (is (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
  (is (= (__ [:a :b :c :d :e :f] 2) [:a :c :e]))
  (is (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])))
