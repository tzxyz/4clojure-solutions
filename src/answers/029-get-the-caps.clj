;; Write a function which takes a string and returns a new string containing only the capital letters.

;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")

(= (#(apply str (re-seq #"[A-Z]" %)) "HeLlO, WoRlD!") "HLOWRD")
(= (#(apply str (re-seq #"[A-Z]" %)) "$#A(*&987Zf") "AZ")
(empty? (#(apply str (re-seq #"[A-Z]" %)) "nothing"))
