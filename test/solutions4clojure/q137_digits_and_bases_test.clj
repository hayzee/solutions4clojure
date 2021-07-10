(ns solutions4clojure.q137-digits-and-bases-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q137-digits-and-bases :refer :all]))

(deftest answer-test
  (is (= [1 2 3 4 5 0 1] (__ 1234501 10)))
  (is (= [0] (__ 0 11)))
  (is (= [0] (__ 0 11)))
  (is (= [1 0] (let [n (rand-int 100000)](__ n n))))
  (is (= [16 18 5 24 15 1] (__ Integer/MAX_VALUE 42))))
