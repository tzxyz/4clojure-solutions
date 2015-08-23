;; The iterate function can be used to produce an infinite lazy sequence.

;; (= __ (take 5 (iterate #(+ 3 %) 1)))

(= (list 1 4 7 10 13) (take 5 (iterate #(+ 3 %) 1)))
