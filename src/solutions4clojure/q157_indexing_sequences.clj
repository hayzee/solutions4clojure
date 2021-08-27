(ns solutions4clojure.q157-indexing-sequences)

; Difficulty: Easy
; Topics: seqs

; Transform a sequence into a sequence of pairs containing the original elements along with their index.

(def __
  (fn [v]
    (map vector v (range))))