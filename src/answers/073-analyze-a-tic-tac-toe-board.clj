;; A tic-tac-toe board is represented by a two dimensional vector.
;; X is represented by :x, O is represented by :o, and empty is represented by :e.
;; A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row.
;; Write a function which analyzes a tic-tac-toe board and returns :x if X has won, :o if O has won, and nil if neither player has won.

;; (= nil (__ [[:e :e :e]
;;             [:e :e :e]
;;             [:e :e :e]]))
;; (= :x (__ [[:x :e :o]
;;            [:x :e :e]
;;            [:x :e :o]]))
;; (= :o (__ [[:e :x :e]
;;            [:o :o :o]
;;            [:x :e :x]]))
;; (= nil (__ [[:x :e :o]
;;             [:x :x :e]
;;             [:o :x :o]]))
;; (= :x (__ [[:x :e :e]
;;            [:o :x :e]
;;            [:o :e :x]]))
;; (= :o (__ [[:x :e :o]
;;            [:x :o :e]
;;            [:o :e :x]]))
;; (= nil (__ [[:x :o :x]
;;             [:x :o :x]
;;             [:o :x :o]]))

(defn analyzes-a-tic-tac-toe-board
  [v]
  (let [[v1 v2 v3] v
        [v4 v5 v6] (map vector v1 v2 v3)

        v7 [(first v1) (second v2) (last v3)]
        v8 [(first v3) (second v2) (last v1)]

        ret [v1 v2 v3 v4 v5 v6 v7 v8]]
    (ffirst (filter #(and (apply = %) (= -1 (.indexOf % :e))) ret))))

(analyzes-a-tic-tac-toe-board [[:x :e :o]
                               [:x :o :e]
                               [:o :e :x]])


(analyzes-a-tic-tac-toe-board [[:x :o :x]
                               [:x :o :x]
                               [:o :x :o]])


(analyzes-a-tic-tac-toe-board [[:e :e :e]
                               [:e :e :e]
                               [:e :e :e]])


