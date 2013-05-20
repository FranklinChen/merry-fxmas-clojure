(defproject merry-fxmas "0.1.0-SNAPSHOT"
  :description "Silly project"
  :url "http://github.com/FranklinChen/merry-fxmas-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main merry-fxmas.core
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]
                   :plugins [[lein-midje "3.0.1"]]}}
)
