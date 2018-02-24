(ns four-clojure.core-test
    (:require [clojure.test :refer :all]
              [four-clojure.core :refer :all]))

(deftest test-my-count
    (is (= (my-count '(1 2 3 3 1)) 5)))

(deftest test-my-reverse
    (is (= (my-reverse [1 2 3 4 5]) [5 4 3 2 1])))

(deftest test-my-sum
    (is (= (my-sum (list 0 -2 5 5)) 8)))