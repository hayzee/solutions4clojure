(ns solutions4clojure.q070-word-sorting)

(def __
  (fn [s]
    (sort-by clojure.string/lower-case (map #(apply str (filter (fn [c] (Character/isLetter ^char c)) %)) (clojure.string/split s #" ")))))
