(defproject com.oscaro/clj-gcloud-storage "0.3.1-SNAPSHOT"
  :description "Clojure wrapper for google-cloud-storage Java client"
  :url "https://github.com/oscaro/clj-gcloud-storage"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.oscaro/clj-gcloud-common "0.3.1"]
                 [com.google.cloud/google-cloud-storage "1.26.0"]
                 [org.clojure/tools.logging "0.4.0"]]
  :global-vars {*warn-on-reflection* true}
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [com.google.cloud/google-cloud-nio "0.44.0-alpha"]]}}
  :repl-options {:init-ns user})
