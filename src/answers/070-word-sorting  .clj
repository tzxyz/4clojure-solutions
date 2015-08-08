#(sort-by (fn [s-seq] (.toUpperCase s-seq)) (re-seq #"\w+" %))

;; (sort-by keyfn coll)
;; keyfn:根据keyfn排序 coll:待排序序列
;; return 排好序的序列
;; 如果coll是数组，那么这么数组会被改变


