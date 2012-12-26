(ns merry-fxmas.core
  (:gen-class))

(defmacro repeat-greeting
  "Repeat greeting n times, from n down to 1, with loop unrolled."
  [n]
  (let [n# n]
    `(do
       ~@(loop [i# 1
                result# '()]
           (if (> i# n#)
             result#
             (recur (inc i#)
                    (cons `(printf "Merry Christmas Bill %s!\n" ~i#)
                          result#)))))))

(defn -main
  "Say Merry Christmas 25 times."
  [& args]
  (repeat-greeting 25))
