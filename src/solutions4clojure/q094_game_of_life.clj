(ns solutions4clojure.q094-game-of-life)

(def __
  (fn generate-new [board]
    (let
      [get-at (fn [board [x y]]
                (-> board
                  (nth x)
                  (nth y)))
       board-size (fn [board]
                    [(dec (count board)) (dec (count (first board)))])
       neighbour-coords (fn [board [x y]]
                          (let [[sz-x sz-y] (board-size board)]
                            (->> (for [ix (range (dec x) (+ 2 x))
                                       iy (range (dec y) (+ 2 y))]
                                   [ix iy])
                              (remove #(or
                                         (neg? (first %))
                                         (neg? (second %))
                                         (> (first %) sz-x)
                                         (> (second %) sz-y)
                                         (= [x y] [(first %) (second %)]))))))
       get-neighbours (fn [board [x y]]
                        (map #(get-at board %) (neighbour-coords board [x y])))
       count-neighbours (fn [board [x y]]
                          (count (filter #(not= \space %) (get-neighbours board [x y]))))
       decide-fate  (fn [board [x y]]
                      (let [curval   (get-at board [x y])
                            is-alive (not= \space curval)
                            nbrs     (count-neighbours board [x y])]
                        (cond
                          (and is-alive (< nbrs 2)) \space
                          (and is-alive (<= 2 nbrs 3)) \#
                          (and is-alive (> nbrs 3)) \space
                          (and (not is-alive) (= nbrs 3)) \#
                          :else curval)))]
      (->>
        (let [[sz-x sz-y] (board-size board)]
          (for [x (range (inc sz-x))]
            (for [y (range (inc sz-y))]
              (decide-fate board [x y]))))
        (mapv #(apply str %))))))