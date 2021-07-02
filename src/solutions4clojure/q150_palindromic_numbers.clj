(ns solutions4clojure.q150-palindromic-numbers)

(def __
  (fn palins [n]
    (let [next-palin (fn [n fn-mod]
                       (let [str-n (str n)]
                         (if (some #(not= \9 %) str-n)
                           (let [len (count str-n)
                                 fh  (str (fn-mod (read-string (subs str-n 0 (/ (inc len) 2 )))))
                                 rev-fh (clojure.string/reverse fh)
                                 sh  (if (even? len)
                                       rev-fh
                                       (subs rev-fh 1))]
                             (read-string (str fh sh)))
                           (fn-mod (fn-mod n)))))
          search-palin (fn [n]
                         (let [str-n (str n)]
                           (if (neg? (compare str-n (clojure.string/reverse str-n)))
                             (next-palin n inc)
                             (next-palin n identity))))]
      (iterate #(next-palin % inc) (search-palin n)))))