import scala.annotation.tailrec

object Exercises {
  lazy val MORSE = Map(
    'A' -> ".-",
    'B' -> "-...",
    'C' -> "-.-.",
    'D' -> "-..",
    'E' -> ".",
    'F' -> "..-.",
    'G' -> "--.",
    'H' -> "....",
    'I' -> "..",
    'J' -> ".---",
    'K' -> "-.-",
    'L' -> ".-..",
    'M' -> "--",
    'N' -> "-.",
    'O' -> "---",
    'P' -> ".--.",
    'Q' -> "--.-",
    'R' -> ".-.",
    'S' -> "...",
    'T' -> "-",
    'U' -> "..-",
    'V' -> "...-",
    'W' -> ".--",
    'X' -> "-..-",
    'Y' -> "-.--",
    'Z' -> "--..",
  )

  def reverse[T](seq: Seq[T]): Seq[T] = {
    @tailrec
    def _impl(seq: Seq[T], buffer: Seq[T]): Seq[T] = seq match {
      case head :: tail => _impl(tail, head +: buffer)
      case Nil => buffer
    }
    _impl(seq, Nil)
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

  def fibonacci(idx: Int): Seq[Int] = (0 to idx).map(fibonacci4Index)

  def morse(text: String): String = text
    .map(e => MORSE.getOrElse(e.toUpper, e))
    .mkString(" ")

  def wordReverse(text: String): String = "(?U)\\w+".r
      .replaceAllIn(text, e => {
        val word = e.group(0)
        if (word.charAt(0).isUpper) word.toLowerCase.reverse.capitalize else word.reverse
      })
}
