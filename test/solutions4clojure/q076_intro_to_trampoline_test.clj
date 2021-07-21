(ns solutions4clojure.q076-intro-to-trampoline-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q076-intro-to-trampoline :refer :all]))

(deftest answer-test
  (is (= __
        (letfn
          [(foo [x y] #(bar (conj x y) y))
           (bar [x y] (if (> (last x) 10)
                        x
                        #(foo x (+ 2 y))))]
          (trampoline foo [] 1)))))