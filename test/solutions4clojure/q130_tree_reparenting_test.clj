(ns solutions4clojure.q130-tree-reparenting-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q130-tree-reparenting :refer :all]))

(deftest answer-test

  (is (= '(n)
    (__ 'n '(n))))

  (is (= '(a (t (e)))
    (__ 'a '(t (e) (a)))))

  (is (= '(e (t (a)))
    (__ 'e '(a (t (e))))))

  (is (= '(a (b (c)))
    (__ 'a '(c (b (a))))))

  (is (= '(d
        (b
          (c)
          (e)
          (a
            (f
              (g)
              (h)))))
    (__ 'd '(a
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
    (__ 'c '(a
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