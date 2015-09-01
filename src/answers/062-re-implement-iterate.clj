;; Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
;; Special Restrictionsiterate

;; (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
;; (= (take 100 (__ inc 0)) (take 100 (range)))
;; (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

;; lazy-seq 可以避免栈深度溢出
(defn re-implement-iterate
  [f value]
  "write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc."
  (lazy-seq (cons value (re-implement-iterate f (f value)))))

(= (take 5 (re-implement-iterate #(* 2 %) 1)) [1 2 4 8 16])
(= (take 100 (re-implement-iterate inc 0)) (take 100 (range)))
(= (take 9 (re-implement-iterate #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

;; 最后一个不通过
;; 原因是0不停的乘不会变，但是init一直变大，超过interge的值
;; 用repeat！
(defn simple-closure
  [times]
  (fn [value] (loop [t 1
                     init value
                     d    value]
                (println init)
                (if
                  (= t times)
                  init
                  (recur (inc t) (* init d) d)))))

((simple-closure 2) 16)
((simple-closure 0) 2)

(repeat 0 2)
(reduce * ())

(= [1 8 27 64] (map (simple-closure 3) [1 2 3 4]))

(= [1 2 4 8 16] (map #((simple-closure %) 2) [0 1 2 3 4]))

;; (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})

(defn my-group-by
  [f coll]
  (let [m {}]
    (filter f coll)
    (assoc m :fuck (filterv f coll))
    (filter (complement f) coll)
    (assoc m :u (filterv f coll))))

(my-group-by #(> % 5) [1 5 9])

(->> (map inc (range))
        (drop (dec 1000000))
        (take 2))

;; map和mapv的区别！

(#(apply sorted-set (for [x %1 y %2] [x y])) #{1 2 3} #{4 5})
(= (#(apply sorted-set (for [x %1 y %2] [x y])) #{1 2 3} #{4 5}) #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})

(apply sorted-set
 (for [x #{1 2 3}
      y #{4 5}]
  [x y]))

