(ns solutions4clojure.q037-let-it-be-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q037-let-it-be :refer [answer1 answer2 answer3]]))

(comment

(defmacro mydeftest [name] `(deftest ~name (is (= 1 0) "arse test fails")))

(mydeftest arse-test)

(deftest answer-test
  (is (and answer1 answer2 answer3)))


(run-tests)


  )
