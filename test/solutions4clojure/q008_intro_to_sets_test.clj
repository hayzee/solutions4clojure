(ns solutions4clojure.q008-intro-to-sets-test
  (:require [clojure.test :refer :all]
            [clojure.set :refer [union]]
            [solutions4clojure.q008-intro-to-sets :refer :all]))

(deftest answer-test
  (is (= __ (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= __ (union #{:a :b :c} #{:b :c :d}))))