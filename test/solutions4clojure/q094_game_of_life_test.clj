(ns solutions4clojure.q094-game-of-life-test
  (:require [clojure.test :refer :all])
  (:require [solutions4clojure.q094-game-of-life :refer :all]))

(deftest answer-test
  (is (= (__ ["      "
              " ##   "
              " ##   "
              "   ## "
              "   ## "
              "      "])
        ["      "
         " ##   "
         " #    "
         "    # "
         "   ## "
         "      "]))
  (is (= (__ ["     "
              "     "
              " ### "
              "     "
              "     "])
        ["     "
         "  #  "
         "  #  "
         "  #  "
         "     "]))
  (is (= (__ ["      "
              "      "
              "  ### "
              " ###  "
              "      "
              "      "])
        ["      "
         "   #  "
         " #  # "
         " #  # "
         "  #   "
         "      "])))
