(ns solutions4clojure.q070-word-sorting)

(def __
  (fn [s]
    (sort-by clojure.string/lower-case
      (clojure.string/split
        (apply str (remove #{\! \, \.} s))
        #" " ))))
