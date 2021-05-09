import scala.collection.mutable.ListBuffer

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq match {
    case Nil => seq
    case head :: tail => reverse(tail) ++ Seq(head)
  }

  def fibonacci4Index(idx: Int): Int = idx match {
    case 0 => 0
    case 1 => 1
    case idx => fibonacci4Index(idx - 2) + fibonacci4Index(idx - 1)
  }

  def fibonacci(idx: Int): Seq[Int] = idx match {
    case 0 => Seq(0)
    case 1 => Seq(0, 1)
    case idx => fibonacci(idx - 1) :+ fibonacci4Index(idx)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text
      .map(letter => letter.toString)
      .map(letter => if (MORSE.contains(letter.toUpperCase)) MORSE(letter.toUpperCase) else letter)
      .mkString(" ")

  def wordReverse(text: String): String = {
    def extractWords(text:String): ListBuffer[String] = {
      var word = ""
      val result = ListBuffer[String]()
      for (i <- 0 until text.length) {
        val symbol = text.charAt(i)
        if (symbol.isLetter) {
          if (word.isEmpty) {
            word = symbol.toString
          } else {
            word = word + symbol.toString
          }
        } else {
          if (word.nonEmpty) {
            result += word
            word = ""
          }
        }
      }
      result
    }

    def reverse(word: String):String = {
      val reversedWord = word.toLowerCase.reverse
      if (word.head.isUpper) reversedWord.head.toUpper + reversedWord.tail else reversedWord
    }

    var result = text
    for(word <- extractWords(text)) {
      result = result.replaceAll(word, reverse(word))
    }
    result
  }
}
