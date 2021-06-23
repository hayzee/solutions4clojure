(ns solutions4clojure.q027-palindrome-detector-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q027-palindrome-detector :refer :all]))

(deftest answer-test
  (is (false? (__ '(1 2 3 4 5))))
  (is (false? (__ '(1 2 3 4 5))))
  (is (true?  (__ "racecar")))
  (is (true?  (__ [:foo :bar :foo])))
  (is (true?  (__ '(1 1 3 3 1 1))))
  (is (false? (__ '(:a :b :c)))))
