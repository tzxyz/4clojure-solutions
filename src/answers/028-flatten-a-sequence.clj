;; Write a function which flattens a sequence.

;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; (= (__ '((((:a))))) '(:a))

(defn flattens-a-sequence
  [s]
  "Write a function which flattens a sequence."
  (filter (complement sequential?)
          (tree-seq #(sequential? %) #(map identity %) s)))


(flattens-a-sequence '((1 2) 3 [4 [5 6]]))
(flattens-a-sequence ["a" ["b"] "c"])
(flattens-a-sequence '((((:a)))))
