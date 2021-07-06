(ns solutions4clojure.q148-the-big-divide)

(def __
  (fn [n a b]
    (let [f #(quot (dec n) %)
          g #(/ (*' % (f %) (inc (f %))) 2)]
      (- (+ (g a) (g b)) (g (* a b))))))
