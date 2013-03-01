(defproject merry-fxmas "0.1.0-SNAPSHOT"
  :description "Silly project"
  :url "http://github.com/FranklinChen/merry-fxmas-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main merry-fxmas.core
  :repositories {"stuart" "http://stuartsierra.com/maven2"}
  :dependencies [[org.clojure/clojure "1.5.0"]]
  :profiles {:dev {:dependencies [[midje "1.4.0"]]
                   :plugins [[lein-midje "2.0.4"]]}}
)
