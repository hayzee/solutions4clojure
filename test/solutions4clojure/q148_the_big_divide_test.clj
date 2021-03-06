(ns solutions4clojure.q148-the-big-divide-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q148-the-big-divide :refer :all]))

(deftest answer-test
  (is (= 0 (__ 3 17 11)))
  (is (= 23 (__ 10 3 5)))
  (is (= 233168 (__ 1000 3 5)))
  (is (= "2333333316666668" (str (__ 100000000 3 5))))
  (is (= "110389610389889610389610"
        (str (__ (* 10000 10000 10000) 7 11))))
  (is (= "1277732511922987429116"
        (str (__ (* 10000 10000 10000) 757 809))))
  (is (= "4530161696788274281"
        (str (__ (* 10000 10000 1000) 1597 3571)))))
