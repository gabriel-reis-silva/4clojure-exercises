(ns elementary.17-map)


(prn "Map function get all the values from the list and uses them in te anonymous function")


(= '(6 7 8) (map #(+ % 5) '(1 2 3)))