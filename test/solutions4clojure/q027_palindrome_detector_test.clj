(ns solutions4clojure.q027-palindrome-detector-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q027-palindrome-detector :refer :all]))

(deftest answer-test
  (is (false? (answer '(1 2 3 4 5))))
  (is (false? (answer '(1 2 3 4 5))))
  (is (true?  (answer "racecar")))
  (is (true?  (answer [:foo :bar :foo])))
  (is (true?  (answer '(1 1 3 3 1 1))))
  (is (false? (answer '(:a :b :c)))))
