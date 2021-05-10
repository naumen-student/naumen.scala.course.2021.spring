

object Exercises {

    def reverse[T](seq: Seq[T]): Seq[T] = seq.foldLeft(List.empty[T])((result, current) => current +: result)

    /**
     * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
     *
     * @param idx
     * @return
     */
    def fibonacci4Index(idx: Int): Int = fibonacci(idx).last

    def fibonacci(idx: Int): Seq[Int] = idx match {
        case 0 => Seq(0)
        case 1 => Seq(0, 1)
        case _ => Range(2, idx + 1)
            .foldLeft(List(0, 1))((result, _) => result ::: List(result.last + result.init.last))
    }

    lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
        "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
        "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
        "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
        "Y" -> "-.--", "Z" -> "--..")

    def morse(text: String): String =
        text.map(symbol => MORSE.getOrElse(symbol.toUpper.toString, symbol)).mkString(" ")


    def wordReverse(text: String): String = {
        val firstIndexOfWord = text.indexWhere(_.isLetter)
        val firstIndexOfSeparator = text.indexWhere(!_.isLetter)
        firstIndexOfWord match {
            case -1 => text
            case _ if firstIndexOfSeparator < firstIndexOfWord =>
                text.substring(0, firstIndexOfWord) + wordReverse(text.substring(firstIndexOfWord))
            case _ => text.substring(0, firstIndexOfWord) +
                reverseString(text.substring(firstIndexOfWord, firstIndexOfSeparator)) +
                wordReverse(text.substring(firstIndexOfSeparator))
        }
    }

    private def reverseString(text: String): String =
        if (text.head.isUpper) text.last.toUpper + text.init.reverse.toLowerCase
        else text.reverse

}
