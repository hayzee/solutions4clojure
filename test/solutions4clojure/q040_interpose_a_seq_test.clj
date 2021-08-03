(ns solutions4clojure.q040-interpose-a-seq-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q040-interpose-a-seq :refer :all]))

(deftest answer-test
  (is (= (__ 0 [1 2 3]) [1 0 2 0 3]))
  (is (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three"))
  (is (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])))