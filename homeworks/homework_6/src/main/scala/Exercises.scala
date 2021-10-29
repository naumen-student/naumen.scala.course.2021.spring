import scala.::

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
      seq match {
          case head :: Nil => head :: Nil
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
      if (idx == 0) return 0
      if (idx == 1) return 1
      fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = {
      def fibonacciStream(a: Int = 0, b: Int = 1): Stream[Int] = a #:: fibonacciStream(b, a + b)
      fibonacciStream().take(idx + 1)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
      text.map(c =>
          if (c.isLetter) MORSE(c.toUpper.toString)
          else c
      ).mkString(" ")
  }


  def wordReverse(text: String): String = {
      text.split(' ').map(w => {
          val word = w.filter(c => c.isLetter)
          val reversedWord = if (word.head.isUpper)
                  word.reverse.head.toUpper + word.reverse.tail.toLowerCase
              else word.reverse
          if (w.indexOf(word) == 0)
              reversedWord + w.drop(reversedWord.length)
          else
              w.split(word).head + reversedWord + w.split(word).tail.mkString
      }
      ).mkString(" ")
  }
}
