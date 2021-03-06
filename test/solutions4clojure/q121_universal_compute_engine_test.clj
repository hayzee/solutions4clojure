(ns solutions4clojure.q121-universal-compute-engine-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q121-universal-compute-engine :refer :all]))

(deftest answer-test
  (is (= 2 ((__ '(/ a b))
            '{b 8 a 16})))
  (is (= 8 ((__ '(+ a b 2))
            '{a 2 b 4})))
  (is (= [6 0 -4]
        (map (__ '(* (+ 2 a)
                    (- 10 b)))
          '[{a 1 b 8}
            {b 5 a -2}
            {a 2 b 11}])))
  (is (= 1 ((__ '(/ (+ x 2)
                   (* 3 (+ y 1))))
            '{x 4 y 1}))))
