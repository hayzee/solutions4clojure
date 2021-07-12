(ns solutions4clojure.q077-anagram-finder)

(def __
  (fn anags[s]
    (set (map #(set (second %)) (filter #(< 1 (count (second %))) (group-by sort s))))))
