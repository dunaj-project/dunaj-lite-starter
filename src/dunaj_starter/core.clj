(ns dunaj-starter.core
  "See http://lite.dunaj.org for documentation and examples"
  (:refer-clojure :only [])
  (:require [dunaj.core :refer [dunaj-api!]]
            [dunaj.set :refer [intersection]]))

(dunaj-api!
  (:refer-dunaj :exclude [+])
  ;; you can require additional stuff here
  (:require [dunaj.math.precise :refer [+]]))

(defn bar :- String
  [s :- String]
  (str (print "Hello %s!" s)))

(defn foo :- nil
  [s :- String]
  (println! (bar s))
  nil)

(foo "World")
