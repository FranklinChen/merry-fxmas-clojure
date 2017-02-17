(ns merry-fxmas.core-test
  (:require [clojure.test :refer :all]
            [merry-fxmas.core :refer :all]))

(deftest a-test
  (testing "Macro expansion of repeat-greeting."
    (is
     (macroexpand '(repeat-greeting 3))
     '(do
        (clojure.core/printf "Merry Christmas Bill %s!\n" 3)
        (clojure.core/printf "Merry Christmas Bill %s!\n" 2)
        (clojure.core/printf "Merry Christmas Bill %s!\n" 1)))))
