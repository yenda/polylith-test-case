(ns com.my-company.cli.core
  (:require [ragtime.jdbc :as ragtime.jdbc]))

(defn hello [name]
  (str "Hello " name "!!")
  (ragtime.jdbc/load-resources "migrations/postgres"))
