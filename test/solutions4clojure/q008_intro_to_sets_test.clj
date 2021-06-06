(ns solutions4clojure.q008-intro-to-sets-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q008-intro-to-sets :refer :all]))

(deftest answer-test
  (is (= answer (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= answer (clojure.set/union #{:a :b :c} #{:b :c :d}))))