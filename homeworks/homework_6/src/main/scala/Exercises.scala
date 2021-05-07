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
    case x if x < 0 => Seq(-1)
    case 0 => Seq(0)
    case 1 => Seq(0, 1)
    case n if n >= 2 => fibonacci(n-1) :+ fibonacci(n-1).last + fibonacci(n-2).last
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text.map(char => MORSE.getOrElse(char.toString.toUpperCase(), char)).mkString(" ")

  private def reverseStringWithCapitalize(text: String): String =
    if (text.head.isUpper) text.last.toUpper + text.init.reverse.toLowerCase
    else text.reverse


  def wordReverse(text: String): String = {
    val startWord = text.indexWhere(_.isLetter)
    val endSeparator = text.indexWhere(!_.isLetter)
    startWord match {
      case -1 => text
      case _ if endSeparator < startWord => text.substring(0, startWord) + wordReverse(text.substring(startWord))
      case _ => text.substring(0, startWord) +
        reverseStringWithCapitalize(text.substring(startWord, endSeparator)) + wordReverse(text.substring(endSeparator))
    }
  }

}
