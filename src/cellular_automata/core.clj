(ns cellular-automata.core
  (:gen-class))

(def alive-str "◼")
(def dead-str "◻")

(defn cond-bit-set [cond x n]
  (if cond (bit-set x n) x))

(defn convert-left-middle-right-to-int [l m r]
  (cond-bit-set l (cond-bit-set m (cond-bit-set r 0 0) 1) 2))

(defn create-rule-fn [x]
  #(bit-test x (convert-left-middle-right-to-int %1 %2 %3)))

(defn pad-alive-with-dead-neighbors [alive-set]
  (let [padded-set (transient alive-set)]
    (doseq [alive alive-set]
      (if (not (contains? alive-set (dec alive)))
        (conj! padded-set (dec alive)))
      (if (not (contains? alive-set (inc alive)))
        (conj! padded-set (inc alive))))
    (persistent! padded-set)))

(defn next-generation [alive-set rule-fn]
  (let [transient-alive-set (transient alive-set)
        padded-alive-set (pad-alive-with-dead-neighbors alive-set)]
    (doseq [dead-or-alive padded-alive-set]
      (let [l (contains? alive-set (dec dead-or-alive))
            m (contains? alive-set dead-or-alive)
            r (contains? alive-set (inc dead-or-alive))]
        (if (rule-fn l m r)
          (conj! transient-alive-set dead-or-alive)
          (disj! transient-alive-set dead-or-alive))))
    (persistent! transient-alive-set)))

(defn cell-str-value [position alive-set]
  (if (contains? alive-set position)
    alive-str
    dead-str))

(defn run-cellular-automata [seed rule-fn generations]
  (if (>= generations 1)
    (conj (run-cellular-automata
            (next-generation seed rule-fn)
            rule-fn
            (dec generations))
          seed)
    (list seed)))

(defn pprint-generations [generations]
  (let [min-val (reduce #'min (last generations))
        max-val (reduce #'max (last generations))]
    (doseq [generation generations]
      (println (apply str (map #(cell-str-value %1 generation) (range min-val (inc max-val))))))))

(defn -main
  [& args]
  (let [rule-num (nth args 0 30)
        generations (nth args 1 16)]
    (pprint-generations
      (run-cellular-automata #{0} (create-rule-fn rule-num) generations))))
