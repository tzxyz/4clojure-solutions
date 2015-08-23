;; Write a function which returns a personalized greeting.

;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")

(= (#(str "Hello, " % "!") "Dave") "Hello, Dave!")
(= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!")
(= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!")

(= (#(format "Hello, %s!" %) "Dave") "Hello, Dave!")
(= (#(format "Hello, %s!" %) "Dave") "Hello, Jenn!")
(= (#(format "Hello, %s!" %) "Dave") "Hello, Rhea!")


