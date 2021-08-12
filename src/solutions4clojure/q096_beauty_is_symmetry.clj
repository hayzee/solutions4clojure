(ns solutions4clojure.q096-beauty-is-symmetry)

;; Let us define a binary tree as "symmetric" if the left half of the tree is the
;; mirror image of the right half of the tree.
;; Write a predicate to determine whether or not a given binary tree is symmetric.
;; (see "To Tree, or not to Tree" for a reminder on the tree representation we're using).

(def __
  (fn [t]
    (let
      [bintree? (fn bintree? [[_ n2 n3 :as n]]
                  (or
                    (nil? n)
                    (and
                      (= 3 (count n))
                      (and (seqable? n2) (bintree? n2))
                      (and (seqable? n3) (bintree? n3)))))
       mirrortree (fn mirrortree [[r n2 n3]]
                    (when r
                      [r (mirrortree n3) (mirrortree n2)]))
       mirrortree? (fn [t] (= t (mirrortree t)))]
      (and (bintree? t) (mirrortree? t)))))
