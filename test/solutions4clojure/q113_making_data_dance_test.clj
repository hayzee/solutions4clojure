(ns solutions4clojure.q113-making-data-dance-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q113-making-data-dance :refer :all]))

(def __ answer)

(deftest answer-test
  (is (= "1, 2, 3" (str (__ 2 1 3))))
  (is (= '(2 1 3) (seq (__ 2 1 3))))
  (is (= '(2 1 3) (seq (__ 2 1 3 3 1 2))))
  (is (= '(1) (seq (apply __ (repeat 5 1)))))
  (is (= "1, 1, 1, 1, 1" (str (apply __ (repeat 5 1)))) )
  (is (and (= nil (seq (__)))
    (=  "" (str (__))))))
