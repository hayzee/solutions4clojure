(ns solutions4clojure.q141-tricky-card-games)

(def __
  (fn card-sorter [trump]
    (fn [cards]
      (let [sort-fn (fn [card] (- (if (= (:suit card) (or trump (:suit (first cards))))
                                    (* 100 (:rank card))
                                    (:rank card))))]
        (first (sort-by sort-fn cards))))))