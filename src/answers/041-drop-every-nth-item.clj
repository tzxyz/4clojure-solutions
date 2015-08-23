;; Write a function which drops every Nth item from a sequence.

;; (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
;; (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;; (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])

;; 方法一思路：先以n为步长分区，用take取出除了ntm item以为的元素再mapcat
(defn drop-every-nth-item-v1
  [coll n]
  "Write a function which drops every Nth item from a sequence."
  (mapcat #(take (dec n) %) (partition-all n coll)))

(= (drop-every-nth-item-v1 [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
(= (drop-every-nth-item-v1 [:a :b :c :d :e :f] 2) [:a :c :e])
(= (drop-every-nth-item-v1 [1 2 3 4 5 6] 4) [1 2 3 5 6])


;; 方法二思路：每一个元素的下标不等于n-1即可
(defn drop-every-nth-item-v2
  [coll n]
  "Write a function which drops every Nth item from a sequence."
  (filter #(not= (dec n) (mod (.indexOf coll %) n)) coll))

(= (drop-every-nth-item-v2 [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
(= (drop-every-nth-item-v2 [:a :b :c :d :e :f] 2) [:a :c :e])
(= (drop-every-nth-item-v2 [1 2 3 4 5 6] 4) [1 2 3 5 6])

(drop-every-nth-item-v2 [1 2 3 4 5 6 7 8] 3)
