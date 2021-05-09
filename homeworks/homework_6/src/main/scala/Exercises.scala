import scala.collection.mutable.ListBuffer

object Exercises {


    def reverse[T](seq: Seq[T]): Seq[T] = seq.toList.reverse

    val fibonacciCache = Map(0 -> 0, 1 -> 1, 2 -> 1)

    /**
     * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
     *
     * @param idx
     * @return
     */
    def fibonacci4Index(idx: Int): Int = {
        if (fibonacciCache.contains(idx))
            fibonacciCache(idx)
        else fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
    }

    def fibonacci(idx: Int): Seq[Int] = {
        val list = ListBuffer[Int]()
        for (i <- 0 to idx) {
            list += fibonacci4Index(i)
        }
        list.toList
    }

    lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
        "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
        "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
        "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
        "Y" -> "-.--", "Z" -> "--..", " " -> " ")

    def morse(text: String): String = {
        val list = text.split("")
        val result = new StringBuilder()
        list.foreach(letter => {
            if (MORSE.contains(letter.toUpperCase)) result ++= s" ${MORSE(letter.toUpperCase)}" else result ++= letter
        })
        result.toString().trim
    }

    def wordReverse(text: String): String = {
        text.split("((?<=\\.)|(?=\\.))|((?<=!)|(?=!))|((?<=,)|(?=,))|((?<= )|(?= ))").map(element => {
            if (element.head.isUpper) {
                element.toLowerCase.reverse.capitalize
            } else element.reverse
        }).mkString
    }
}
