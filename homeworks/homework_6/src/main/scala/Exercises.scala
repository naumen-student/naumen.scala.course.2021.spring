object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    seq.reverse
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    idx match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci4Index(idx-1) + fibonacci4Index(idx-2)
    }
  }

  def fibonacci(idx: Int): Seq[Int] = {
    idx match {
      case 0 => Seq(fibonacci4Index(0))
      case _ => fibonacci(idx - 1) :+ fibonacci4Index(idx)
    }
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    text.toUpperCase().split("").map(s => MORSE.getOrElse(s, s)).mkString(" ")
  }

  def wordReverse(text: String): String = {
    val words = text.split("[^А-Яа-я]+")
    var splitters = text.split("[А-Яа-я]+")
    splitters = splitters.takeRight(splitters.length - 1) :+ ""
    var newWords = Array[String]()
    for (i <- 0 until words.length) {
      newWords :+= charReverse(words(i))
      newWords :+= splitters(i)
    }
    newWords.mkString("")
  }

  def charReverse(word :String): String = {
    var newWord = word.reverse
    if (word.take(1) == word.take(1).toUpperCase())
      newWord = newWord.take(1).toUpperCase() +
        newWord.substring(1, word.length - 1) +
        newWord.takeRight(1).toLowerCase()
    newWord
  }

}
