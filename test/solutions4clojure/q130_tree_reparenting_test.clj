(ns solutions4clojure.q130-tree-reparenting-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q130-tree-reparenting :refer :all]))

(deftest answer-test

  (is (= '(n)
    (answer 'n '(n))))

  (is (= '(a (t (e)))
    (answer 'a '(t (e) (a)))))

  (is (= '(e (t (a)))
    (answer 'e '(a (t (e))))))

  (is (= '(a (b (c)))
    (answer 'a '(c (b (a))))))

  (is (= '(d
        (b
          (c)
          (e)
          (a
            (f
              (g)
              (h)))))
    (answer 'd '(a
                  (b
                    (c)
                    (d)
                    (e))
                  (f
                    (g)
                    (h))))))

  (is (= '(c
        (d)
        (e)
        (b
          (f
            (g)
            (h))
          (a
            (i
              (j
                (k)
                (l))
              (m
                (n)
                (o))))))
    (answer 'c '(a
                  (b
                    (c
                      (d)
                      (e))
                    (f
                      (g)
                      (h)))
                  (i
                    (j
                      (k)
                      (l))
                    (m
                      (n)
                      (o))))))))