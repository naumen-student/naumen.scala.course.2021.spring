object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    @scala.annotation.tailrec
    def func(seq: Seq[T], temp: Seq[T]): Seq[T] = seq match {
      case x :: xs => func(xs, x +: temp)
      case Nil => temp
    }

    func(seq, Nil)
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    @scala.annotation.tailrec
    def func(first_prev : Int, second_prev : Int, temp: Int): Int = temp match {
      case 0 => first_prev
      case _ => func(second_prev, first_prev + second_prev, temp - 1)
    }

    func(0, 1, idx)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    @scala.annotation.tailrec
    def func(first_prev : Int, second_prev : Int, temp: Int, seq: Seq[Int]): Seq[Int] = temp match {
      case -1 => seq
      case _ => func(second_prev, first_prev + second_prev, temp - 1, seq :+ first_prev)
    }

    func(0, 1, idx, Nil)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    text.map(letter => MORSE.get(letter.toString.toUpperCase) match{
      case None => letter
      case Some(s) => s
    }
    ).mkString(" ")
  }


  def wordReverse(text: String): String = {
    def reverse_word(temp_string: String): String = {
      val res = temp_string.partition(_.isLetter)
      if(res._1.head.isUpper)
        res._1.reverse.toUpperCase.head + res._1.reverse.toLowerCase.tail + res._2
      else
        res._1.reverse.toLowerCase + res._2
    }
    text.split(" ").map(word => reverse_word(word)).mkString(" ")
  }

}
