(ns solutions4clojure.q102-into-camel-case-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q102-into-camel-case :refer :all]))

(deftest answer-test
  (is (= (__ "something") "something"))
  (is  (= (__ "multi-word-key") "multiWordKey"))
  (is (= (__ "leaveMeAlone") "leaveMeAlone")))
