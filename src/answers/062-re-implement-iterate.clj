;; Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
;; Special Restrictionsiterate

;; (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
;; (= (take 100 (__ inc 0)) (take 100 (range)))
;; (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

;; lazy-seq 可以避免栈深度溢出
;; 使用lazy-seq实现递归
(defn re-implement-iterate
  [f value]
  (lazy-seq (cons value (re-implement-iterate f (f value)))))

(= (take 5 (re-implement-iterate #(* 2 %) 1)) [1 2 4 8 16])
(= (take 100 (re-implement-iterate inc 0)) (take 100 (range)))
(= (take 9 (re-implement-iterate #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

