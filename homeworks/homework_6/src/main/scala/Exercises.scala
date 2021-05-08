object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq match {
    case Nil => seq
    case _ => seq.last +: reverse(seq.init)
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
    case 1 => Seq(0, 1)
    case _ => fibonacci(idx - 1) :+ fibonacci(idx - 1).last + fibonacci(idx - 2).last
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text.map(char => MORSE.getOrElse(char.toUpper.toString, char)).mkString(" ")

  def reverseString(s: (String, String)): String = {
    if (s._1.head.isUpper) s._1.reverse.toLowerCase().capitalize + s._2
    else s._1.reverse + s._2
  }

  def wordReverse(text: String): String = text.split(" ")
    .map(_.partition(_.isLetter))
    .map(s => reverseString(s))
    .mkString(" ")

}
