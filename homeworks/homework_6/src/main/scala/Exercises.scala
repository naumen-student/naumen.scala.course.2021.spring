import scala.annotation.tailrec

object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = {
    @tailrec
    def loop(givenSeq: Seq[T], reverseSeq: Seq[T]): Seq[T] = givenSeq match {
      case Nil => reverseSeq
      case head :: tail => loop(tail, head +: reverseSeq)
    }
    loop(seq, Seq())
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = idx match {
    case 1 => 1
    case 2 => 1
    case _ => fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = idx match {
    case 1 => Seq(0, 1)
    case 2 => Seq(0, 1, 1)
    case _ => {
      val previous = fibonacci(idx - 1)
      previous :+ previous.takeRight(2).sum
    }
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text
      .toArray
      .map(_.toString)
      .map(letter => if (MORSE.contains(letter.toUpperCase)) MORSE(letter.toUpperCase) else letter)
      .mkString(" ")



  def wordReverse(text: String): String = {
    @tailrec
    def loop(givenText: String, words: Seq[String], currentWord: String): Seq[String] = givenText match {
      case "" => words
      case currentText =>
        if (currentText.head.isLetter)
          loop(currentText.tail, words, currentWord + currentText.head)
        else
          loop(currentText.tail, words :+ currentWord :+ currentText.head.toString , "")
    }
    def reverse(word: String): String = {
      val reverseWord = word.reverse.toLowerCase
      if (word.head.isUpper)
        reverseWord.head.toUpper + reverseWord.tail
      else
        reverseWord
    }
    loop(text, Seq(), "")
      .filter(_ != "")
      .map(word => if (word.head.isLetter) reverse(word) else word)
      .mkString("")
  }
}
