(ns solutions4clojure.q093-partially-flatten-seq-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q093-partially-flatten-seq :refer [__]]))

(deftest answer-test
  (is (= (__ [["Do"] ["Nothing"]])
        [["Do"] ["Nothing"]]))
  (is (= (__ [[[[:a :b]]] [[:c :d]] [:e :f]])
        [[:a :b] [:c :d] [:e :f]]))
  (is (= (__ '((1 2)((3 4)((((5 6)))))))
        '((1 2)(3 4)(5 6)))))
