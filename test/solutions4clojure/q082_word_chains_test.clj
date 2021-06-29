(ns solutions4clojure.q082-word-chains-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q082-word-chains :refer :all]))

(deftest answer-test
  (is (= true (__ #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})))
  (is (= false (__ #{"cot" "hot" "bat" "fat"})))
  (is (= false (__ #{"to" "top" "stop" "tops" "toss"})))
  (is (= true (__ #{"spout" "do" "pot" "pout" "spot" "dot"})))
  (is (= true (__ #{"share" "hares" "shares" "hare" "are"})))
  (is (= false (__ #{"share" "hares" "hare" "are"}))))
