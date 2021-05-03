object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq match {
    case head :: tail => reverse(tail) :+ head
    case _ => Nil
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = idx match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = idx match {
    case 0 => Seq(0)
    case _ => fibonacci(idx - 1) :+ fibonacci4Index(idx)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
  text.map(c => MORSE.getOrElse(c.toString.toUpperCase, c.toString))
    .mkString(" ")

  def getTokens(text: String): List[String] = text match {
    case "" => List[String]()
    case _ => text.takeWhile(_.isLetter == text.charAt(0).isLetter).mkString("") ::
      getTokens(text.dropWhile(_.isLetter == text.charAt(0).isLetter))
  }

  def mapToken(tkn: String): String = tkn.charAt(0) match {
    case x if !x.isLetter => tkn
    case x if x.isUpper => tkn.toLowerCase.reverse.capitalize
    case _ => tkn.reverse
  }

  def wordReverse(text: String): String = getTokens(text)
    .map(mapToken)
    .mkString("")

}
