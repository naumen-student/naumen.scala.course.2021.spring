import scala.annotation.tailrec
import scala.util.matching.Regex

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    @tailrec
    def reversedLoop(list: List[T], reversedList: List[T] = Nil): Seq[T] =
      list match {
        case Nil => reversedList
        case el :: tail => reversedLoop(tail, el :: reversedList)
      }

    reversedLoop(seq.toList)
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    @tailrec
    def fibLoop(first: Int, second: Int, index: Int): Int =
      index match {
        case 0 => first
        case otherIndex => fibLoop(second, first + second, otherIndex - 1)
      }

    fibLoop(0, 1, idx)
  }

  private val fibGenerator: Stream[Int] = 0 #:: fibGenerator.scanLeft(1)(_ + _)
  def fibonacci(idx: Int): Seq[Int] = fibGenerator take (idx + 1)

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..", " " -> " ")

  //С использованием StringBuilder будет эффективнее, но это mutable структура
  def morse(text: String): String =
    text.foldLeft("") {
    (res, sym) => res + {
      MORSE.get(sym.toString.toUpperCase) match {
        case Some(value: String) => " " + value
        case None => sym
      }
    }
  }.drop(1)


  val wordBase: Regex = "([а-яА-Яa-zA-Z]+|[^а-яА-Яa-zA-Z])".r
  def wordReverse(text: String): String =
    wordBase.findAllIn(text).map {
      case s if s.head.isUpper => s.toLowerCase.reverse.capitalize
      case s => s.reverse
    }.mkString("")

}
