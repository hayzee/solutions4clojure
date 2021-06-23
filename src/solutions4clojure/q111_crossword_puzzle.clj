(ns solutions4clojure.q111-crossword-puzzle)

(def __
  (fn [word board]
    (let
      [
       compress       (fn [line]
                        (apply str (map first (partition-all 2 line))))
       compress-board (fn [board]
                        (map compress board))
       letters-match  (fn [[wc tc]]
                        (or (= wc tc) (= \_ tc)))
       words-match    (fn [w1 w2]
                        (and
                          (= (count w1)(count w2))
                          (every? letters-match (map vector w1 w2))))
       line-match     (fn [word line]
                        (some #(words-match word %) (clojure.string/split line #"\#")))
       board-match    (fn [word board]
                        (some true? (map #(line-match word %) board)))

       flip-board     (fn  [b]
                        (map #(apply str %) (apply map (cons vector b))))
       ]
      (boolean (or
                 (board-match word (compress-board board))
                 (board-match word (flip-board (compress-board board)))
                 )))))