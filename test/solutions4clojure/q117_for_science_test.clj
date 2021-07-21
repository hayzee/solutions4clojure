(ns solutions4clojure.q117-for-science-test
  (:require [clojure.test :refer :all]
            [solutions4clojure.q117-for-science :refer :all]))

(deftest answer-test
  (is (= true  (__ ["M   C"]))(= true  (__ ["M   C"])))
  (is (= false (__ ["M # C"])))
  (is (= true  (__ ["#######"
                    "#     #"
                    "#  #  #"
                    "#M # C#"
                    "#######"])))
  (is (= false (__ ["########"
                    "#M  #  #"
                    "#   #  #"
                    "# # #  #"
                    "#   #  #"
                    "#  #   #"
                    "#  # # #"
                    "#  #   #"
                    "#  #  C#"
                    "########"])))
  (is (= false (__ ["M     "
                    "      "
                    "      "
                    "      "
                    "    ##"
                    "    #C"])))
  (is (= true  (__ ["C######"
                    " #     "
                    " #   # "
                    " #   #M"
                    "     # "])))
  (is (= true  (__ ["C# # # #"
                    "        "
                    "# # # # "
                    "        "
                    " # # # #"
                    "        "
                    "# # # #M"])))
  )
