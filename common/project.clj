(defproject clinicico.common "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"sonatype-nexus-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [com.google.guava/guava "14.0.1"]
                 [com.taoensso/nippy "2.2.0-RC1"]
                 [log4j/log4j "1.2.17"]
                 [clj-time "0.5.1"]
                 [org.jeromq/jeromq "0.3.0-SNAPSHOT"]
                 [org.zeromq/cljzmq "0.1.1" :exclusions [org.zeromq/jzmq]]])
