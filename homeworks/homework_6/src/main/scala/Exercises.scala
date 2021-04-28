import scala.annotation.tailrec
import scala.util.matching.Regex

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
      @tailrec
      def rec(seq: Seq[T], reversedSeq: Seq[T] = Nil): Seq[T] = seq match {
              case head :: tail => rec(tail, head +: reversedSeq)
              case Nil => reversedSeq
          }

      rec(seq)
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = idx match {
      case 0 | 1 => idx
      case _ => fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = idx match {
      case 0 => Seq(0)
      case 1 => Seq(0, 1)
      case _ =>
          val prev = fibonacci(idx - 1)
          prev :+ prev.takeRight(2).sum
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
      text
        .map(char => MORSE.getOrElse(char.toUpper.toString, char))
        .mkString(" ")

  val wordRegexp: Regex = "([а-яА-Яa-zA-Z]+|[^а-яА-Яa-zA-Z])".r
  def wordReverse(text: String): String =
      wordRegexp.findAllIn(text)
        .map(word => if (word.head.isUpper) word.toLowerCase.reverse.capitalize else word.reverse)
        .mkString("")

}
