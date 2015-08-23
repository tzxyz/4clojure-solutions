;; Let bindings and function parameter lists support destructuring.

;; (= [2 4] (let [[a b c d e f g] (range)] __))

(= [2 4] (let [[a b c d e f g] (range)] [c e]))
