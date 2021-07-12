(ns solutions4clojure.q074-filter-perfect-squares)

(def __
  (fn [s]
    (->>
      (map #(Integer/parseInt %) (clojure.string/split s #","))
      (filter #(== (Math/sqrt %) (int (Math/sqrt %))))
      (map str)
      (clojure.string/join "," ))))
