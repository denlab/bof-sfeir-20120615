(defproject bof-sfeir-20120615 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :profiles {:dev
             {:dependencies
              [[midje "1.4.0"]
               [com.intelie/lazytest
                "1.0.0-SNAPSHOT"
                :exclusions
                [swank-clojure]]]}}
  :dependencies [[org.clojure/clojure                   "1.4.0"]
                 [clj-http                              "0.4.0"]
                 [cheshire                              "4.0.0"]
                 [incanter                              "1.3.0"]
                 [com.google.code.javaparser/javaparser "1.0.8"]
                 [org.apache.solr/solr-core             "1.4.1"]
                 [org.apache.solr/solr-cell             "1.4.1"]
                 [org.slf4j/slf4j-simple                "1.5.5"]
                 [junit/junit                           "4.8.2"]
                 [javax.servlet/servlet-api             "2.5"]
                 [org.clojure/tools.trace               "0.7.3"]
                 [net.cgrand/parsley                    "0.9.1"]
                 [seesaw "1.4.1"]])
