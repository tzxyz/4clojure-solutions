;; (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
;; 62 fix
(defn i-iterate
  [f x]
  (lazy-seq (cons x (i-iterate f (f x)))))

(take 5 (i-iterate inc 5))

;; 107
;; (= 256 ((__ 2) 16), ((__ 8) 2))

(defn simple-closure
  [m]
  (fn [n] (reduce * (repeat m n))))

((simple-closure 2) 16)

((simple-closure 8) 2)

;; 63
;; (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})

;; (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
;;   {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})

(defn group-a-seq
  [pred coll]
  (->>  coll
        (map (fn [item] {(pred item) [item]}))
        (apply merge-with concat)))

(defn gb2
  [f coll]
	(apply
		merge-with
		concat
		(map
			#(assoc {} (f %) [%])
			coll)))

(let [pred #(apply / %)]
  (->> [[1 2] [2 4] [4 6] [3 6]]
       (map (fn [item] {(pred item) [item]}))
       (apply merge-with concat)))

(vector [[1] [2]] [3])

(group-a-seq #(> % 5) [1 2 6 7])
(group-a-seq #(apply / %) [[1 2] [2 4] [4 6] [3 6]])

(concat [] [[1]])
