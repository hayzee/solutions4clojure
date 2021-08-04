(ns solutions4clojure.q061-map-construction-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q061-map-construction :refer :all]))

(deftest answer-test
  (is (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))
  (is (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
  (is (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))
