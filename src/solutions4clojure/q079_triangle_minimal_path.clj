(ns solutions4clojure.q079-triangle-minimal-path)

(def __
  (fn [t]
    (let [elems (fn [t p] (map #(get-in t %) p))
          score (fn [t p] (reduce + (elems t p)))
          moves (fn [[x y]] [ [(inc x) y] [(inc x) (inc y)] ])
          routes (fn [r] (mapv #(conj r %) (moves (last r))))
          lvl (fn [l] (mapcat routes l))
          paths (fn [h] (last (take h (iterate lvl [[[0 0]]]))))]
      (apply min (map #(score (vec t) %) (paths (count t)))))))


;; working

;(defn moves
;  "Given a position [x y] - generate the next 2 legal positions [ [x1 y1] [x2 y2] ]"
;  [[x y]]
;  [ [(inc x) y] [(inc x) (inc y)] ])
;
;;; test
;(moves [0 0])    ; [[1 0] [1 1]]
;(moves [1 0])    ; [[2 0] [2 1]]
;(moves [1 1])    ; [[2 1] [2 2]]
;
;(defn routes
;  "Given a route [[x1 y1] ... [xn yn]], generate the next 2 routes by appending the next moves"
;  [route]
;  (mapv #(conj route %) (moves (last route))))
;
;;; test
;(routes [[0 0]])       ;; [[[0 0] [1 0]] [[0 0] [1 1]]]    ; The root route (geddit?).
;(routes [[0 0] [1 1]]) ;; [[[0 0] [1 1] [2 1]] [[0 0] [1 1] [2 2]]]
;
;(defn level
;  [lvl]
;  (mapcat routes lvl))
;
;(level [[[0 0]]])
;(level (level [[[0 0]]]))
;(level (level (level [[[0 0]]])))
;
;(defn all-paths
;  ; Given a triangle height, generate a list of all possible paths through the triangle
;  [height]
;  (last (take height (iterate level [[[0 0]]]))))
;
;(all-paths 4)
;
;(def triangle
;  '([3]
;   [2 4]
;   [1 9 3]
;   [9 9 2 4]
;   [4 6 6 7 8]
;   [5 7 3 5 1 4]))
;
;(count (vec triangle))
;
;(defn path-elements [triangle path]
;  (map #(get-in triangle %) path))
;
;(path-elements (vec triangle) [[0 0] [1 1] [2 2] [3 3]])
;
;(defn path-score [triangle path] (reduce + (path-elements triangle path)))
;
;(path-score (vec triangle) [[0 0] [1 1] [2 2] [3 3]])
;
;(defn solve [triangle]
;  (let [path-elements (fn [triangle path] (map #(get-in triangle %) path))
;        path-score (fn [triangle path] (reduce + (path-elements triangle path)))
;        routes (fn [route] (mapv #(conj route %) (moves (last route))))
;        level (fn [lvl] (mapcat routes lvl))
;        all-paths (fn [height] (last (take height (iterate level [[[0 0]]]))))
;        ]
;    (apply min (map #(path-score (vec triangle) %) (all-paths (count triangle))))))
;
;(solve triangle)
;
;


;; previous working solution
;(def __
;  (fn [s]
;    (let [index-elements (fn [s]
;                           (map-indexed (fn [i,e] (vector i e)) s))
;
;          all-combis (fn all-combis [ss]
;                       (if (empty? ss)
;                         (list (list))
;                         (for [e (first ss)
;                               r (all-combis (rest ss))]
;                           (cons e r))))
;
;          all-indexed-combis (fn [s]
;                               (mapv #(into [] %) (all-combis (map index-elements s))))
;
;          validpath? (fn [s]
;                       (->>
;                         (map #(<= -1 (apply - %) 0) (partition 2 1 (map first s)))
;                         (filter false?)
;                         (first)
;                         (nil?)))
;
;          all-indexed-combis-valid (fn [s]
;                                     (filter validpath? (all-indexed-combis s)))
;
;          all-valid-paths (fn [s]
;                            (map #(map second %) (all-indexed-combis-valid s)))
;
;          score-all-valid-paths (fn [s]
;                                  (map #(vector (reduce + %) %) (all-valid-paths s)))]
;      (first (first (sort-by first (score-all-valid-paths s)))))))
;
;
;
;
;
;
