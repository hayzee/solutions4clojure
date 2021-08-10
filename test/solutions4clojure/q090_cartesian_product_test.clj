(ns solutions4clojure.q090-cartesian-product-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q090-cartesian-product :refer :all]))

(deftest answer-test
  (is (= (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
        #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
          ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
          ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}))
  (is (= (__ #{1 2 3} #{4 5})
        #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))
  (is (= 300 (count (__ (into #{} (range 10))
                      (into #{} (range 30)))))))
