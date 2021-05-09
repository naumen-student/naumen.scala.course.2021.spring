object Exercises {

  val em_seq = Seq()

  def reverse[T](seq: Seq[T]): Seq[T] =
    {
      nonEmptySeq(seq,Seq())
    }

  def nonEmptySeq[T](empty_seq: Seq[T], full_seq: Seq[T]): Seq[T] = {
    if (empty_seq.nonEmpty){
      val temp = empty_seq.head
      val empty_seq1 = empty_seq.tail
      val full_seq1 = temp +: full_seq
      nonEmptySeq(empty_seq1, full_seq1)
    }
    else full_seq
  }

  def f_seq (i: Int, seq: Seq[Int] = Seq(0,1): Seq[Int]):Seq[Int] = {
    if (seq.length < i+1) {
      val len = seq.length
      val t = seq :+ (seq(len-1) + seq(len-2))
      f_seq(i,t)
    }
    else seq
  }

  def fibonacci4Index(idx: Int): Int = {
    val seq = f_seq(idx)
    seq(idx)
  }

  def fibonacci(idx: Int): Seq[Int] = f_seq(idx)

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {

    text.map(elem =>
    {
      val el = elem.toString.toUpperCase
      if ((elem.toInt>32)&&(elem.toInt<65)) el
      else if (MORSE.contains(el)) " " + MORSE(el)
      else " " + el
    }
    ).mkString("").tail

  }


  def wordReverse(text: String): String = {

    var full_str= ""
    var str = ""
    var counter = false

    for (elem <- text) {
      if (elem.toInt>65) {
        str = str + elem
        if (elem == elem.toUpper) counter = true
      }
      else {
        if (counter) {
          counter = false
          str = str.toLowerCase
          str = str.init + str.last.toUpper
        }
        full_str = full_str + str.reverse + elem
        str = ""
      }
    }
    full_str
  }

}
