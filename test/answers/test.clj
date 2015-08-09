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

