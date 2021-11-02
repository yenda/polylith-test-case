(ns com.my-company.cli.core
  (:require [ragtime.jdbc :as ragtime.jdbc]
            [clojure.java.io :as io]))

(defn hello [name]
  (str "Hello " name "!!")
  (println "EXISTS!" (io/resource "migrations/postgres/20210301000000-test.up.sql"))
  (ragtime.jdbc/load-resources "migrations/postgres"))
