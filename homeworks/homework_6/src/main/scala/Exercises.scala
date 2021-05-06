object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.foldRight(Seq.empty[T])((element, reversedElements) => reversedElements :+ element)

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = idx match {
    case x if x < 0 => -1 // на случай, если кто-то подаст отрицательное число
    case 0 => 0
    case 1 => 1
    case x => fibonacci4Index(x - 1) + fibonacci4Index(x - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = idx match {
    case x if x < 0 => Seq(-1) // на случай, если кто-то подаст отрицательное число
    case 0 => Seq(0)
    case 1 => Seq(0, 1)
    case x => (2 to x).foldLeft(Seq(0, 1))((seq, _) => seq :+ (seq.last + seq.init.last))
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = ???


  def wordReverse(text: String): String = ???

}
