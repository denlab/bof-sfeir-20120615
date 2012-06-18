;; ----------------------------------------------------------------------------
;; Code example for the Bird of a feather @Sfeir 20120615
;; ----------------------------------------------------------------------------
(ns bof-sfeir-20120615.core
  (:use    [clojure.string :as s])
  (:use    [incanter core stats charts datasets pdf])
  (:import [java.io File]))

;; listing all files
(def all-files (file-seq (File. "/home/denis/Dropbox/doc-cache")))

;; filter directories
(def no-dir (remove #(.isDirectory %) all-files))

;; Get the extension of the given file
(defn get-extension
  [f] (last (s/split (.getName f) #"\.")))

;; a sequence of extension / size pairs
(def ext-size (map (fn [f] [(get-extension f) (.length f)]) no-dir))

;; group the preceding seq by extension
(def group-by-ext (group-by first ext-size))

;; sum the sizes for each extensions
(def ext-size (map (fn [[e sizes]] [e (reduce + (map second sizes))])
               group-by-ext))

;; view the data
(defn view-pie-chart
  [] (view (pie-chart (map first ext-size)
                      (map second ext-size))))
