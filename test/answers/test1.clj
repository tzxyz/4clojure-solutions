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

;; 将coll转换成vec 只有一个参数
(vec [1])
(vec {:name "zhuo" :age 22})

(vector [1 2] [:a :b])

;; 为什么map是这样
(map inc [1 2 3])

(get [1 2] 0)
(get 1 [1 2])

(def v [1 2 3])
(defn fuck [])
(.indexOf [1 2 3] 2)

(defn balabal
  [coll n]
  (filter #(> (mod (.indexOf coll %) n) 0) coll))

(defn fucku [coll n]
  (mapcat #(take (dec n) %) (partition-all n coll)))

(defn drop-version [coll n]
  (filter #(not= (dec n) (mod (.indexOf coll %) n)) coll))

(fucku [0 1 2 3 4 5 6 7 8 9 10 11 12 13] 3)
(drop-version [0 1 2 3 4 5 6 7 8 9 10 11 12 13] 3)

;; (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))

(map identity (partition-all 2 [1 2 3 4 5 6]))
(map #(first %) (partition-all 2 [1 2 3 4 5 6]))


(defn r-interleave
  [n coll]
  (let [data list
        index 0]
    (while (< index (count coll))
      (conj data (map #(nth index %) (partition-all (/ (count coll) n) coll))))))

(defn group-bys [n coll]
  (vals (group-by #(mod (.indexOf coll %) n) coll)))

(group-bys 2 [1 2 3 4 5 6])
(group-bys 3 (range 9))

(conj '() "a")
(nth [1 2 3] 1)

(take 2 [1 2 3 4 5])
(drop 2 [1 2 3 4 5])

;; =========== #44==============================
(defn f43 [n coll]
  #(if (pos? %1)
      (apply conj (take (mod %1 (count %2)) %2) (reverse (drop (mod %1 (count %2)) %2)))
      (apply conj (drop-last (mod (* -1 %1) (count %2)) %2) (reverse (take-last (mod (* -1 %1) (count %2)) %2)))))


(mod -2 12)
(pos? 1)

(apply conj (take 2 [1 2 3 4 5]) (reverse (drop 2 [1 2 3 4 5])))
(apply conj (take -2 [1 2 3 4 5]) (reverse (drop -2 [1 2 3 4 5])))
(apply conj (drop-last 2 [1 2 3 4 5]) (reverse (take-last 2 [1 2 3 4 5])))

(apply conj '() '(2 1 5 4 3))

(conj '() 1 2)

;; =====49
;; (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])

(vector (take 3 [1 2 3 4 5 6]) (take-last (- (count [1 2 3 4 5 6]) 3) [1 2 3 4 5 6]))

;; ============= 50
;; (= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
(defn split-by-type [coll]
  (group-by #(type %) coll))

(split-by-type [1 :a 2 :b 3 :c])

;; ==================== test 100 ========================
(== (* 1/3 2/5) 2)

(* 1/3 2/5)

(* 7 5/7 2 3/5)

;; ==================== test 88 =====================
;; (= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
(merge #{1 2 3 4 5 6} #{1 3 5 7})

(merge (frequencies #{1 2 3 4 5 6}) (frequencies #{1 3 5 7}))

(use 'clojure.set)
(difference  (union #{1 2 3 4 5 6} #{1 3 5 7}) (intersection #{1 2 3 4 5 6} #{1 3 5 7}))

;; ==================== test 81 ======================
(set (for [x (union #{1 2 3 4 5 6} #{1 3 5 7}) :when (and (contains? #{2 3 4 5} x) (contains? #{0 1 2 3} x))]
  x))

;; =================== test 122 ======================
;; (= 7     (__ "111"))

(Integer/valueOf "111")

(vec (seq "100"))

(apply hash-map [1 2 3 4])

(map-indexed (fn [index value] [index value]) "111")

(repeat 2 1)

(->> (reverse "1000")
     (map-indexed vector)
     (filter #(= \1 (last %)))
         (map #(first %))
         (map #(apply * (repeat % 2)))
         (reduce +))

;; ================= success ======

(#(map first (group-by identity %)) (range 50))



