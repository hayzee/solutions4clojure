(ns solutions4clojure.q145-for-the-win-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q145-for-the-win :refer :all]))

(deftest answer-test
  (is (= __ (for [x (range 40)
                  :when (= 1 (rem x 4))]
              x)))
  (is (= __ (for [x (iterate #(+ 4 %) 0)
                  :let [z (inc x)]
                  :while (< z 40)]
              z)))
  (is (= __ (for [[x y] (partition 2 (range 20))]
              (+ x y)))))