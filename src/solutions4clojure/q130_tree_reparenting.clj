(ns solutions4clojure.q130-tree-reparenting)

(def answer
  #(let [detach (fn [tree node]
                  (let [path (atom [])
                        found (atom [nil []])
                        visit (fn [n t]
                                (if (seq? t)
                                  (if (= (first t) n)
                                    (do
                                      (reset! found [t (pop @path)]);)
                                      nil)
                                    (do
                                      (when (seq @path)
                                        (swap! path pop))
                                      (remove nil? t)))
                                  (do
                                    (swap! path conj t)
                                    t)))]
                    {:rem (clojure.walk/postwalk (partial visit node) tree)
                     :det (first @found)
                     :path (second @found)
                     }))
         detachments (fn detachments [tree node]
                       (let [{r :rem d :det p :path} (detach tree node)]
                         (when d
                           (cons d (detachments r (peek p))))))
         attach (fn [t2 t1]
                  (if (seq t1)
                    (concat t1 (list t2))
                    t2))
         reparent (fn [tree node]
                    (reduce attach (reverse (detachments tree node))))
         ]
     (reparent %2 %1))
  )