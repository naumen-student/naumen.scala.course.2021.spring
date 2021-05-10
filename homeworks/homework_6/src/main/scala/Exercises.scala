import scala.annotation.tailrec

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    @tailrec
    def loop(seq: Seq[T], resultSeq: Seq[T]): Seq[T] = seq match {
      case Nil => resultSeq
      case x :: y => loop(y, x +: resultSeq)
    }
    loop(seq, Seq())
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    @tailrec
    def loop(index: Int, s: Int, current: Int): Int = {
      if (index <= 0) current
      else loop(index - 1, s + current, s)
    }
    loop(idx, 1, 0)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    var prev = -1
    var next = 1
    var s = Seq[Int]()
    for(_ <- 0 to idx)
    {
      val sum = prev + next
      prev = next
      next = sum
      s = s :+ sum
    }
    s
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text.map(c => MORSE.getOrElse(c.toUpper.toString, c.toString)).mkString(" ")


  def wordReverse(text: String): String = {
    val temp = new StringBuilder
    val result = new StringBuilder
    for (ch <- text.toCharArray) {
      if (ch.isLetter) temp.append(ch)
      else {
        var r = temp.result().reverse
        if(r.nonEmpty && r(r.length - 1).isUpper) {
          r = r(0).toUpper + r.substring(1, r.length-1) + r(r.length - 1).toLower
        }
        result.append(r).append(ch)
        temp.delete(0, temp.length)
      }
    }
    result.append(temp)
    result.toString
  }

}
