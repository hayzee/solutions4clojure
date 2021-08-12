(ns solutions4clojure.q096-beauty-is-symmetry-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q096-beauty-is-symmetry :refer :all]))

(deftest answer-test
  (is (= (__ '(:a (:b nil nil) (:b nil nil))) true))
  (is (= (__ '(:a (:b nil nil) nil)) false))
  (is (= (__ '(:a (:b nil nil) (:c nil nil))) false))
  (is (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
              [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
        true))
  (is (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
              [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
        false))
  (is (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
              [2 [3 nil [4 [6 nil nil] nil]] nil]])
        false)))
