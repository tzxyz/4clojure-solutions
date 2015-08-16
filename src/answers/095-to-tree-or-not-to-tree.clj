;; Write a predicate which checks whether or not a given sequence represents a binary tree.
;; Each node in the tree must have a value, a left child, and a right child.

;; (= (__ '(:a (:b nil nil) nil)) true)
;; (= (__ '(:a (:b nil nil))) false)
;; (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]]) true)
;; (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false)

;; 思路：
;; 二叉树必须有value，lift，right，所有(= 3 (count binary-tree))
;; 第一个值是value
;; 第二个和第三个要么是nil，要么是一个子节点

(defn to-tree-or-not-to-tree
  [coll]
  "Write a predicate which checks whether or not a given sequence represents a binary tree."
  (letfn [(binary-tree? [coll]
                        (println coll)
                        (and
                          (= (count coll) 3)
                          (let [left  (second coll)
                                right (last   coll)]
                            (and
                              (or
                                (nil? left)
                                (and
                                  (sequential?  left)
                                  (binary-tree? left)))
                              (or
                                (nil? right)
                                (and
                                  (sequential?  right)
                                  (binary-tree? right)))))))]
    (binary-tree? coll)))
