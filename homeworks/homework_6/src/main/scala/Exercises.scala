import scala.annotation.tailrec
import scala.util.matching.Regex

object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = {
    @tailrec
    def rec(seq: Seq[T], res: Seq[T] = Seq.empty[T]): Seq[T] = seq.lastOption match {
      case Some(last) => rec(seq.init, res :+ last)
      case None => res
    }

    rec(seq)
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    @tailrec
    def fib(f0: Int = 0, f1: Int = 1, ind: Int): Int = ind match {
      case 0 => f0
      case 1 => f1
      case _ => fib(f1, f0 + f1, ind - 1)
    }

    fib(ind = idx)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    @tailrec
    def fib(seq: Seq[Int] = Seq(0, 1), ind: Int): Seq[Int] = ind match {
      case 0 => Seq(0)
      case 1 => seq
      case _ => fib(seq :+ seq.init.last + seq.last, ind - 1)
    }

    fib(ind = idx)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    @tailrec
    def rec(text: String, res: String = ""): String = text.headOption match {
      case Some(head) => rec(text.tail, res + " " + MORSE.getOrElse(head.toUpper.toString, head))
      case None => res.drop(1)
    }

    rec(text)
  }

  final val wordRegex: Regex = "([A-Za-zА-Яа-я]+)".r

  def wordReverse(text: String): String =
    wordRegex.replaceAllIn(text, r => r.toString().reverse match {
      case str => if (str.last.isUpper)
        str.updated(0, str.head.toUpper).updated(str.length - 1, str.last.toLower)
      else str
    })
}

