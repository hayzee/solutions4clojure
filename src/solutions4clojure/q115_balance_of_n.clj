(ns solutions4clojure.q115-balance-of-n)

(def __
  (fn balanced?[n]
    (let [str-n    (str n)
          no-chars (/ (count str-n) 2)]
      (= (reduce + (map #(Character/digit ^char % 10) (take no-chars str-n)))
        (reduce + (map #(Character/digit ^char % 10) (take no-chars (clojure.string/reverse str-n))))))))
