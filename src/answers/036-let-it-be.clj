;; Can you bind x, y, and z so that these are all true?

;; (= 10 (let __ (+ x y)))
;; (= 4 (let __ (+ y z)))
;; (= 1 (let __ z))

(= 10 (let [x 7 y 3 z 1] (+ x y)))
(= 4  (let [x 7 y 3 z 1] (+ y z)))
(= 1  (let [x 7 y 3 z 1] z))
