object Exercises {

    def reverse[T](seq: Seq[T]): Seq[T] = {
        seq.toList match {
            case Nil => Nil
            case head :: tail => reverse(tail) :+ head
        }
    }

    /**
     * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
     *
     * @param idx
     * @return
     */
    def fibonacci4Index(idx: Int): Int = {
        idx match {
            case 0 => 0
            case 1 => 1
            case _ => fibonacci4Index(idx - 2) + fibonacci4Index(idx - 1)
        }
    }

    def fibonacci(idx: Int): Seq[Int] = {
        idx match {
            case 0 => Seq(fibonacci4Index(0))
            case _ => fibonacci(idx - 1) :+ fibonacci4Index(idx)
        }
    }

    lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
        "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
        "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
        "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
        "Y" -> "-.--", "Z" -> "--..")

    def morse(text: String): String = {
        text.map(s => MORSE.getOrElse(s.toString.toUpperCase, s)).mkString(" ")
    }

    def wordReverse(text: String): String = {
        if (text.isEmpty)
            return text
        val notWord = text.takeWhile(s => !s.isLetter)
        val word = text.slice(notWord.length, text.length).takeWhile(s => s.isLetter)
        notWord + reverseWord(word) + wordReverse(text.slice(notWord.length + word.length, text.length))
    }

    def reverseWord(word: String): String = {
        if (word.isEmpty)
            return word
        val reversed = reverse(word.head.toLower + word.tail).mkString
        if (word.head.isUpper)
            reversed.head.toUpper + reversed.tail.mkString
        else
            reversed
    }
}
