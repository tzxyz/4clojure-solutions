;; Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.

;; (= (__ "4,5,6,7,8,9") "4,9")
;; (= (__ "15,16,25,36,37") "16,25,36")


(defn filter-perfect-squares
  [s]
  (let [ss (apply hash-set (map #(Integer/valueOf %) (clojure.string/split s #",")))
        max-num (apply max ss)]
    (println "ss" ss)
    (println "max" max-num)
    (clojure.string/join "," (filter ss (map #(* % %) (range max-num))))))

(= (filter-perfect-squares "4,5,6,7,8,9") "4,9")
(= (filter-perfect-squares "15,16,25,36,37") "16,25,36")
