import scala.annotation.tailrec

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] =
    seq.foldLeft[List[T]](Nil) { (acc, tail) => tail :: acc }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    @tailrec
    def fibonacci4IndexTailrec(idx: Int, acc: Int, sum: Int): Int = idx match {
      case 0 => acc
      case _ => fibonacci4IndexTailrec(idx - 1, sum, sum + acc)
    }

    fibonacci4IndexTailrec(idx, 0, 1)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    @tailrec
    def fibonacciTailrec(idx: Int, acc: List[Int]): List[Int] = idx match {
      case 0 => acc
      case _ => acc match {
        case xss :: xs :: _ => fibonacciTailrec(idx - 1, (xss + xs) :: acc)
      }
    }

    fibonacciTailrec(idx - 1, 1 :: 0 :: Nil).reverse
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text.map(symbol => MORSE.getOrElse(symbol.toUpper.toString, symbol.toString)).mkString(" ")


  def wordReverse(text: String): String = {
    def reverse(start: Int, count: Int, text: String): String = {
      val word = text.substring(start, start + count)

      val reversedWord = if (word.head.isUpper) word.toLowerCase.reverse.capitalize
                         else word.reverse

      text.substring(0, start) + reversedWord + text.substring(start + count)
    }

    @tailrec
    def wordReverseTailrec(start: Int, count: Int, text: String): String = {
      if (start >= text.length) text
      else if (text.charAt(start + count).isLetter) wordReverseTailrec(start, count + 1, text)
      else wordReverseTailrec(start + count + 1, 0, if (count > 0) reverse(start, count, text) else text)
    }

    wordReverseTailrec(0, 0, text)
  }

}