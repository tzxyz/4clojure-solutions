;; (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]])


(defn x [coll]
  (group-by (apply coll) coll))

;; (x [:a :b :c])


(apply hash-map [1 2 3 :4])

;; =========== test mapcat ==================
;; (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
(mapcat vec [[1 2 3] [:a :b]])
(mapcat reverse [[1 2 3] [9 8 7]])

;; =========== test reductions ==============
;; (reductions f coll)
;; (reductions f init coll)
;; 返回reduce过程的lazyseq
(reductions + [1 2 3])
(reductions conj [] [1 2 3])
(reductions max [5 9 3 1 3 4 5 6 7])

;; (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(mapcat vector [1 2 3] [:a :b :c])
(mapcat vector [1 2] [3 4 5 6])

(vector [1 2 3] [:a :b :c])

(map vector [1 2 3])

(apply concat (map vector [1 2 3] [:a :b :c]))

(map vector [1 2 3] [:a :b :c])
(map vector [1 2 3] [:a :b :c] ["x" "y" "z"])

(vector [1 2] [:a :b])
