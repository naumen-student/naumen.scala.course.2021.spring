import scala.annotation.tailrec

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    @tailrec
    def loop(seq: Seq[T], resultSeq: Seq[T]): Seq[T] = seq match {
      case Nil => resultSeq
      case x :: y => loop(y, x +: resultSeq)
    }
    loop(seq, Seq())
  }

  def fibonacci4Index(idx: Int): Int = {
    @tailrec
    def fibLoop(first: Int, second: Int, index: Int): Int =
      index match {
        case 0 => first
        case otherIndex => fibLoop(second, first + second, otherIndex - 1)
      }

    fibLoop(0, 1, idx)
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
    text.map(c => MORSE.getOrElse(c.toUpper.toString, c.toString)).mkString(" ")


  def wordReverse(text: String): String =
    text
      .split("(?=[!. ,?])|(?<=[!. ,?])")
      .map(word => if (word.charAt(0).isUpper) {word.toLowerCase.reverse.capitalize} else word.reverse)
      .mkString("")

}
