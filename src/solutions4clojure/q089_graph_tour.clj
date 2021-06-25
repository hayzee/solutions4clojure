(ns solutions4clojure.q089-graph-tour)

(def __
  (fn [edges]
    (let [state {:edges edges
                 :vertex nil}
          solved? (fn [state]
                    (empty? (:edges state)))
          make-move (fn [state [e1 e2]]
                      (when state
                        (let [[s1 s2] (split-with #(not= [e1 e2] %) (state :edges))
                              edges   (concat s1 (rest s2))]
                          (assoc state
                            :edges edges
                            :vertex (if (= e1 (state :vertex))
                                      e2
                                      e1)))))
          generator (fn [state]
                      (if (state :vertex)
                        (let [traversals (filter #(some #{(state :vertex)} %) (state :edges))]
                          (map #(make-move state %) traversals))
                        (map #(assoc state :vertex %) (distinct (flatten (state :edges))))))
          solver (fn [state generator solved?]
                   (let [solve-state (fn find-fut-states [state]
                                       (let [fut-states (for [gen-state (generator state)
                                                              fut-state (find-fut-states gen-state)] fut-state)]
                                         (if (solved? state)
                                           (cons state fut-states)
                                           fut-states)))]
                     (solve-state state)))
          ]
      (boolean (first (solver state generator solved?))))))
