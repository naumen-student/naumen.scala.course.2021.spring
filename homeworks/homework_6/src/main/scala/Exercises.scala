object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = seq match {
    case Nil => seq
    case head :: tail => reverse(tail) :+ head
  }

  def fibonacci4Index(idx: Int): Int = idx match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci4Index(idx-2) + fibonacci4Index(idx-1)
  }

  def fibonacci(idx: Int): Seq[Int] = idx match {
    case 0 => Seq(0)
    case _ => fibonacci(idx-1) :+ fibonacci4Index(idx)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text
    .map(x => x.toString)
    .map(x => MORSE.getOrElse(x.toUpperCase(), x))
    .mkString(" ")

  def reverseWord(word: String): String = {
    if (word.head.isUpper)
      return (word.tail.reverse :+ word.head.toLower).capitalize
    word.reverse
  }

  def wordReverse(text: String): String = {
    val regex = "([а-яА-Яa-zA-Z]+|[^а-яА-Яa-zA-Z])".r
    regex.findAllIn(text)
      .map(x => reverseWord(x))
      .mkString("")
  }
}