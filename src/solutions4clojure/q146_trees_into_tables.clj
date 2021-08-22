(ns solutions4clojure.q146-trees-into-tables)

; Because Clojure's for macro allows you to "walk" over multiple sequences in a nested fashion, it is excellent for
; transforming all sorts of sequences. If you don't want a sequence as your final output (say you want a map), you are
; often still best-off using for, because you can produce a sequence and feed it into a map, for example. For this
; problem, your goal is to "flatten" a map of hashmaps. Each key in your output map should be the "path" (1) that you
; would have to take in the original map to get to a value, so for example {1 {2 3}} should result in {[1 2] 3}. You
; only need to flatten one level of maps: if one of the values is a map, just leave it alone. (1) That is, (get-in
; original [k1 k2]) should be the same as (get result [k1 k2])

(def __
  (fn [m]
    (let [paths (fn paths [m]
                  (if (map? m)
                    (for [x (keys m)
                          y (paths (m x))]
                      (cons x y))
                    (list (list))))]
      (into {} (mapv #(vector % (get-in m %)) (paths m))))))
