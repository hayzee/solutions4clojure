(ns solutions4clojure.q177-balancing-brackets-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q177-balancing-brackets :refer :all]))

(deftest answer-test
  (is (__ "This string has no brackets."))
  (is (__ "class Test {
      public static void main(String[] args) {
        System.out.println(\"Hello world.\");
      }
    }"))
  (is (not (__ "(start, end]")))
  (is (not (__ "())")))
  (is (not (__ "[ { ] } ")))
  (is (__ "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))"))
  (is (not (__ "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))")))
  (is (not (__ "["))))
