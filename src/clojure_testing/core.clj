(ns clojure-testing.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (str "Hello, World! " (reduce str args))))


(map #(* % %) [1 2])

(conj '(2) 1)

; Learning about let
(let [[x & resto] [4 3 2 1]
      y 2]
  (+ (reduce + resto) y))

; Learning about filter

(filter even? [1 2 3 4 5 6 7 8 9])

(filter even?
        (map #(* 3 %) [1 2 5 6 8]))

; Learning about concat strings
(defn concat-fields [& fields]
  (clojure.string/join ", " (remove empty? fields)))

(concat-fields "" "Armenia" "Quindio" nil "Colombia")

(concat-fields nil) ; It prints nothing
