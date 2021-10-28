import scala.util.matching.Regex
object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.foldLeft(List.empty[T])((list, el) => el :: list)

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
    case _ => (2 to idx).foldLeft(List(0, 1))((list, _) => list :+ (list.last + list.init.last))
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text.map(char => MORSE.getOrElse(char.toUpper.toString, char)).mkString(" ")

  val wordRegex: Regex = "([а-яА-Яa-zA-Z]+|[^а-яА-Яa-zA-Z])".r
  def wordReverse(text: String): String = wordRegex.findAllIn(text).map {
    case s if s.head.isUpper => s.toLowerCase.reverse.capitalize
    case s => s.reverse
  }.mkString("")

}
