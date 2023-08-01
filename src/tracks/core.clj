(ns tracks.core
  (:gen-class))


(def example
  {:col-constraint [3 4 5 4 2 1 6 5]
    :row-constraint [3 4 4 3 3 4 5]
   :track-position
   [{:point [2 6]  ; [x y]
     :join-points  [[2 7]  [2 5]]}
    {:point [0 2]
     :join-points [[0 1]]}
    {:point [2 3]
     :join-points [[1 3] [2 4]]}
    {:point [7 0]
     :join-points [[7 1]]}
    ]})




;; D6
;; :straight-vertical :d2

(def example2
  [[nil nil nil nil nil nil nil nil]
   [nil nil :d2 nil nil nil nil nil]
   [nil nil nil nil nil nil nil nil]
   [nil nil nil nil nil nil nil nil]
   [nil nil :iv nil nil nil nil nil]
   [:i  nil nil nil nil nil nil nil]
   [nil nil nil nil nil nil nil nil]
   [nil nil nil nil nil nil nil :d2]])






(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
