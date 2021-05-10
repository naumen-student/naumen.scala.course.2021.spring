import scala.annotation.tailrec
object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    @tailrec
    def rec(seq: Seq[T], reversed: Seq[T]): Seq[T] = seq match {
      case Nil => reversed
      case x :: xs => rec(xs, x +: reversed)
    }
    rec(seq, Nil)
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    @tailrec
    def fib(first: Int, second: Int, index: Int): Int = {
      if (index == 1) second
      else
        fib(second, first + second, index - 1)
    }
    fib(0, 1, idx)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    @tailrec
    def fib(first: Int, second: Int, index: Int, seq: Seq[Int]): Seq[Int] = {
      if (index == 0) seq :+ first
      else fib(second, first + second, index - 1, seq :+ first)
    }
    fib(0, 1, idx, Nil)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =  text.map(char => MORSE.get(char.toString.toUpperCase) match {
    case Some(symbol) => symbol
    case None => char
  }).mkString(" ")


  def wordReverse(text: String): String = {

    @tailrec
    def loop(i: Int, result: String = ""): String = {
      if (i == text.length) result
      else {
        if (text(i).isLetter) {
          val word: String = findWord(i)
          if (word(0).isUpper)
            loop(i + word.length, result + word.last.toUpper + word.init.toLowerCase.reverse)
          else
            loop(i + word.length, result + word.reverse)
        }
        else {
          loop(i + 1, result + text(i))
        }
      }
    }

    @tailrec
    def findWord(i: Int, word: String = ""): String= {
      val char = text(i)
      if (char.isLetter)
        findWord(i + 1, word :+ char)
      else word
    }
    loop(0)
  }

}
