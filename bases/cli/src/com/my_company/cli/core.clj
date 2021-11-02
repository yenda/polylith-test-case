(ns com.my-company.cli.core
  (:require [ragtime.jdbc :as ragtime.jdbc]
            [resauce.core :as resauce]
            [clojure.java.io :as io]))

(defn hello [name]
  (str "Hello " name "!!")
  (println "EXISTS!" (io/resource "migrations/postgres/20210301000000-test.up.sql"))
  (println "WORKS!" (resauce/resources "migrations/postgres"))
  (println "SLURP!" (slurp (first (resauce/resources "migrations/postgres/20210301000000-test.up.sql"))))
  (resauce/url-dir (first (resauce/resources "migrations/postgres"))))
