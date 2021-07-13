(ns solutions4clojure.q019-last-element)

(def __ #(peek (vec %)))


; another possibility
;(def __
;  #(reduce (fn [_ e] e) %))
