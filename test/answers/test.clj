(ns answers.test)

;; ------------------ test tree-seq ---------------------
;; (tree-seq branch? children root)
;; 返回一个惰性序列
;; branch?接收一个predicate，判断传递给它的节点是否拥有子节点
;; children接收一个函数，该函数遍历出他所有的子节点
;; root是根节点


;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))



(complement sequential?)

(filter sequential? (tree-seq #(sequential? %) #(map identity %) ["a" ["b"] "c"]))

;; ------------------ test complement -------------------
;; complement接收一个fn，返回一个匿名函数，接收参数和副作用都和f一样，但返回值和f相反
(defn f-true [] true)
(f-true)
((complement f-true))

;; nil和false就返回真，其余返回false
(defn f-nil [] nil)
(f-nil)
((complement f-nil))

(defn f-num [] 1)
(f-num)
((complement f-num))

;; ------------------- test identity ---------------------
(identity [1 2])

;; ------------------- test interleave -------------------
;; (interleave) (interleave coll) (interleave coll1 coll2) (interleave coll1 coll2 & colls)
;; 返回每一个coll中的第一个item，第二个item... 第n个item，以item长度最小的那个coll为基础
(interleave)
(interleave [1 2])
(interleave [1 2] ["a" "b"])
(interleave [1 2] [2 1])
(interleave [1 2 3 4] ["a" "b" "c"] [11 22 33] [111 222 333])

