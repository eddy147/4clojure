(ns four-clojure.core
  (:gen-class))

(defn my-nth
    "http://www.4clojure.com/problem/21"
    [xs n]
    (loop
        [ys xs
         k 0]
        (if (empty? ys)
            nil
            (if (= k n)
                (first ys)
                (recur (rest ys) (inc k))))))

(defn my-count
    "http://www.4clojure.com/problem/22"
    [xs]
    (loop
        [ys xs
         k 0]
        (if (empty? ys)
            k
            (recur (rest ys) (inc k)))))


(defn -main
  "See above for the individual solutions"
  [& args]
  (println "See core.clj for the 4clojure solutions."))
