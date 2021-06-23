(ns solutions4clojure.q131-sum-some-subsets)

(def __
  (fn [& sets]
    (let
      [subseqs (fn subseqs [s]
                 (if (empty? s)
                   '(())
                   (concat (subseqs (rest s)) (map (partial cons (first s)) (subseqs (rest s))))))
       subsets (fn [s]
                 (filter (complement empty?) (set (map set (subseqs (set s))))))
       set-sumof-subsets
       (fn [s]
         (set (map #(apply + %) (subsets s))))
       ]
      (->>
        (map set-sumof-subsets sets)
        (apply clojure.set/intersection)
        ((complement empty?))))))