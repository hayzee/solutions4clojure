(ns solutions4clojure.q128-recognize-playing-cards-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q128-recognize-playing-cards :refer :all]))

(deftest answer-test
  (is (= {:suit :diamond :rank 10} (__ "DQ")))
  (is (= {:suit :heart :rank 3} (__ "H5")))
  (is (= {:suit :club :rank 12} (__ "CA")))
  (is (= (range 13) (map (comp :rank __ str)
                      '[S2 S3 S4 S5 S6 S7
                        S8 S9 ST SJ SQ SK SA]))))