import scala.annotation.tailrec

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = if (seq.nonEmpty)
    seq.tail.foldLeft(Seq(seq.head))((current, value) => value +: current)
  else
    seq

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = fibonacci4IndexRecursion(idx)

  @tailrec
  private def fibonacci4IndexRecursion(i: Int, f1: Int = 0, f2: Int = 1): Int = i match {
    case 0 => f1
    case 1 => f2
    case _ => fibonacci4IndexRecursion(i - 1, f2, f1 + f2)
  }

  def fibonacci(idx: Int): Seq[Int] = fibonacciRecursion(idx)

  @tailrec
  private def fibonacciRecursion(i: Int, f1: Int = 0, f2: Int = 1, fib: Vector[Int] = Vector(0)): Seq[Int] = i match {
    case 0 => fib
    case 1 => fib :+ f2
    case _ => fibonacciRecursion(i - 1, f2, f1 + f2, fib :+ f2)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text.map(char => MORSE.getOrElse(char.toUpper.toString, char)).mkString(" ")


  def wordReverse(text: String): String = ???

}
