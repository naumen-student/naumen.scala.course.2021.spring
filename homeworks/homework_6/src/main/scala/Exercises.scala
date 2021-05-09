import scala.annotation.tailrec

object Exercises {

    lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
        "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
        "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
        "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
        "Y" -> "-.--", "Z" -> "--..")

    def reverse[T](seq: Seq[T]): Seq[T] = seq.foldRight(Seq[T]())((elem, seq) => seq :+ elem)

    def fibonacci4Index(idx: Int): Int = {
        @tailrec
        def fib(a: Int, b: Int, n: Int): Int = {
            n match {
                case 0 => a
                case _ => fib(b, a + b, n - 1)
            }
        }

        fib(0, 1, idx)
    }

    def fibonacci(idx: Int): Seq[Int] = {
        @tailrec
        def fib(current: Seq[Int], n: Int): Seq[Int] = {
            n match {
                case 1 => current
                case _ => fib(current :+ current.reverseIterator.take(2).sum, n - 1)
            }
        }

        idx match {
            case 0 => Seq(0)
            case _ => fib(Seq(0, 1), idx)
        }
    }

    def morse(text: String): String = text.map(ch => MORSE.getOrElse(ch.toUpper.toString, ch.toString)).mkString(" ")

    def wordReverse(text: String): String = {
        def reverse(s: String): String = {
            val (word, delimiters) = s.span(x => x.isLetter)

            (if (word(0).isUpper) word.reverse.toLowerCase.capitalize else word.reverse).concat(delimiters)
        }

        text.split(' ').map(reverse).mkString(" ")
    }
}
