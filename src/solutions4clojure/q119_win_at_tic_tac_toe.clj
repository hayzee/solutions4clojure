(ns solutions4clojure.q119-win-at-tic-tac-toe)

(def __
  (fn get-winning-moves [player board]
    (let [find-empty-positions (fn [board] (map second (filter #(= (first %) :e) (map #(vector (get-in board %) %) (for [x (range 3) y (range 3)] [x y])))))
          is-winning-position (fn is-winning-position ([board player]
                                                       (let [[p1 p2 p3 p4 p5 p6 p7 p8 p9] (flatten board)]
                                                         (or
                                                           (= p1 p2 p3 player)
                                                           (= p4 p5 p6 player)
                                                           (= p7 p8 p9 player)
                                                           (= p1 p4 p7 player)
                                                           (= p2 p5 p8 player)
                                                           (= p3 p6 p9 player)
                                                           (= p1 p5 p9 player)
                                                           (= p3 p5 p7 player))))
                                ([board]
                                 (or (is-winning-position board :o)
                                   (is-winning-position board :x))))]
      (set (filter  #(is-winning-position (assoc-in board % player)) (find-empty-positions board)))))  )
