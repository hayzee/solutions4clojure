(ns solutions4clojure.q153-pairwise-disjoint-sets)

; Given a set of sets, create a function which returns true if no two of those sets have any elements in common1 and
; false otherwise. Some of the test cases are a bit tricky, so pay a little more attention to them.

; Such sets are usually called pairwise disjoint or mutually disjoint.

(def __
  (fn pwsdisj [sos]
    (let [els (reduce concat sos)]
      (= (count (distinct els)) (count els)))))