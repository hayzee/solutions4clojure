(ns solutions4clojure.q074-filter-perfect-squares-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q074-filter-perfect-squares :refer :all]))

(deftest answer-test
  (is (= (__ "4,5,6,7,8,9") "4,9"))
  (is (= (__ "15,16,25,36,37") "16,25,36")))