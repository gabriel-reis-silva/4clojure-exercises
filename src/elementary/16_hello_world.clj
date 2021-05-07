(ns elementary.16_hello-world)

(defn hello [name]
  "this is using defn to create a function"
  (str "Hello, " name "!"))

(hello "Dave")

;In the solution below, I'm using anonymous function

(= ( #(str "Hello, " % "!")"Dave") "Hello, Dave!")