object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = seq match {
    case head :: tail => reverse(tail) ++ Seq(head)
    case Nil => Nil
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
      val fibonacciPrev = fibonacci(idx - 1)
      fibonacciPrev :+ fibonacciPrev.takeRight(2).sum
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text match {
    case char if char.length == 1 => MORSE.getOrElse(char, char)
    case text => morse(text.head.toString.toUpperCase) + " " + morse(text.tail)
  }

  def wordReverse(text: String): String = {
    var words = text.split("[^А-Яа-яёЁ]+")
    val split = text.split("[А-Яа-яёЁ]+").tail
    words = words.map(w => caseReverse(w)).map(w => w.reverse)
    var res = ""
    for (i <- words.indices) {
      res += words(i)
      res += split(i)
    }
    res
  }

  def caseReverse(word: String): String = {
    if ("[А-Я]".r.unapplySeq(word.take(1)).isDefined) {
      word.take(1).toLowerCase() + word.substring(1, word.length - 1) + word.takeRight(1).toUpperCase()
    }
    else word
  }

}
