(ns solutions4clojure.q028-flatten-a-sequence)

(def answer (fn f [[h & t :as s]]
              (when (seq s)
                (if (coll? h)
                  (concat (f h) (f t))
                  (cons h (f t))))))