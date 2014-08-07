(ns merry-fxmas.core-test
  (:use midje.sweet)
  (:use [merry-fxmas.core]))

(fact
 (repeat-greeting 3)

 =expands-to=>

 (do
   (clojure.core/printf "Merry Christmas Bill %s!\n" 3)
   (clojure.core/printf "Merry Christmas Bill %s!\n" 2)
   (clojure.core/printf "Merry Christmas Bill %s!\n" 1)))
