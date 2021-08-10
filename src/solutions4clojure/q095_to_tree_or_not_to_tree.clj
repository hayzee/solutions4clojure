(ns solutions4clojure.q095-to-tree-or-not-to-tree)

;; Write a predicate which checks whether or not a given sequence represents a binary tree.
;; Each node in the tree must have a value, a left child, and a right child.

(def __
  (fn bintree? [[_ n2 n3 :as n]]
    (or
      (nil? n)
      (and
        (= 3 (count n))
        (and (seqable? n2) (bintree? n2))
        (and (seqable? n3) (bintree? n3))))))