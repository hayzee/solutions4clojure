(ns solutions4clojure.q063-group-a-sequence)

(def __
  (let [umap (fn [m [k v]] (update m k #(conj (vec %) v)))]
    (fn [f s]
      (reduce umap {} (map #(vector (f %) %) s)))))

;(update {:key nil} :key #(:egg))
;
;(update-in {:a [2]} [:a] (fnil conj []) 1)
;
;
;(conj [])
;
;(let [e 1
;      f inc]
;  (update-in {} [(f e)] (fnil conj []) e)  )
