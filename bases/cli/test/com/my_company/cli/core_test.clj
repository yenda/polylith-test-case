(ns com.my-company.cli.core-test
  (:require [clojure.test :as test :refer :all]
            [com.my-company.cli.core :as core]))

(deftest hello-test
  (is (= 1 (core/hello "bob"))))
