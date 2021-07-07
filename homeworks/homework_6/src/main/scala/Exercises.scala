import scala.annotation.tailrec
import scala.util.matching.Regex

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    @tailrec
    def reverse_(seq: Seq[T], res: Seq[T]): Seq[T] =
      seq match {
        case Nil => res
        case x :: xs => reverse_(xs, x +: res)
      }

    reverse_(seq, Seq.empty)
  }


  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    @tailrec
    def fibonacci_(prevFirst: Int, prevSecond: Int, remain: Int): Int = {
      remain match {
        case 0 => prevFirst
        case _ => fibonacci_(prevSecond, prevFirst + prevSecond, remain - 1)
      }
    }

    fibonacci_(0, 1, idx)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    @tailrec
    def fibonacci_(fibNumbers: Seq[Int], remain: Int): Seq[Int] = {
      remain match {
        case 0 => fibNumbers
        case _ => fibonacci_(fibNumbers :+ (fibNumbers(fibNumbers.length - 2) + fibNumbers.last), remain - 1)
      }
    }

    fibonacci_(Seq(0, 1), idx - 1)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    text.toUpperCase.map(x => MORSE.getOrElse(x.toString, x.toString)).mkString(" ")
  }


  val wordRegexp: Regex = "([а-яА-Яa-zA-Z]+|[^а-яА-Яa-zA-Z]+)".r

  def wordReverse(text: String): String =
    wordRegexp.findAllIn(text)
      .map(word =>
        word.head match {
          case x if x.isUpper => word.toLowerCase.reverse.capitalize
          case x if x.isLetter => word.reverse
          case _ => word
        }
      )
      .mkString
}
