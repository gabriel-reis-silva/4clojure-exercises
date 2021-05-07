(ns elementary.19-last)

(prn "Write a function which returns the last element in a sequence.")

(defn the-last [seq]
  (last seq))

(the-last [1 2 3 4 5])

(prn "Now, I'll use anonymous function")

(= (#(last %) [1 2 3 4 5]) 5)

(= (#(last %) '(5 4 3)) 3)

(= (#(last %) ["b" "c" "d"]) "d")

(= (last [1 2 3 4 5]) 5)

(= (last '(5 4 3)) 3)

(= (last ["b" "c" "d"]) "d")

(prn "There are many ways to solve this exercise, but now I'll show how to solve without use last")

(defn ultimo [lista]
  (nth lista (- (count lista) 1)))

(ultimo [1 2 3 4])

(prn "Now using anonymous function without 'last' function")
;; The easiest way :)
#(nth % (- (count %) 1)) 