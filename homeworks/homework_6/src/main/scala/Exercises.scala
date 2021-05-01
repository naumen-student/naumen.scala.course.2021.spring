object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */

  val fib: Stream[Int] = 0 #:: 1 #:: fib.zip(fib.tail).map(p => p._1 + p._2)

  def fibonacci4Index(idx: Int): Int = fib(idx)

  def fibonacci(idx: Int): Seq[Int] = fib.take(idx+1).toList.toSeq

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text.map(x => if (x.isLetter) x.toUpper.toString else x.toString).map(x => MORSE.getOrElse(x, x)).mkString(" ")


  def wordReverse(text: String): String = {

    def parseText(strings : List[String], left: String): List[String] = {
      left match {
        case "" => strings
        case _ => {
          val isUpper = left.head.isLetter && left.head.isUpper
          val parsed = {
            if (left.head.isLetter) left.span(_.isLetter)
            else left.span(!_.isLetter)
          }
          val firstPart = {
            if (isUpper) {
               parsed._1.toLowerCase().dropRight(1) + parsed._1.last.toUpper
            }
            else parsed._1
          }
          parseText(strings :+ firstPart, parsed._2)
        }
      }
    }

    parseText(List(), text).map(x => if (x.head.isLetter) x.reverse else x).mkString("")
  }

}
