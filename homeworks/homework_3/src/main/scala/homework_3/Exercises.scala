package homework_3

object Exercises {

  /*Задание №1*/
  def prettyBooleanFormatter1(x: Any): String = {
    if (x.isInstanceOf[Boolean])
      if (x.asInstanceOf[Boolean]) "правда" else "ложь"
    else x.toString
  }

  def prettyBooleanFormatter2(x: Any): String = x match {
    case true => "правда"
    case false => "ложь"
    case _ => x.toString
  }

  def prettyBooleanFormatter3(x: Any): String = {
    if (x.getClass.getSimpleName == "Boolean")
      if (x.asInstanceOf[Boolean]) "правда" else "ложь"
    else x.toString
  }

  /*Задание №2*/
  def max1(xs: Seq[Int]): Int = if (xs.isEmpty) Int.MinValue else xs.max
  def max2(xs: Seq[Int]): Seq[Int] = if (xs.isEmpty) Seq() else Seq(xs.max)
  def max3(xs: Seq[Int]): Option[Int] = if (xs.isEmpty) None else Some(xs.max)

  /*Задание №3*/
  def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int = xs.sum

  def sum1(x: Int, y: Int): Int = sumIntegers(Seq(x,y))
  def sum2(x: Int, y: Int): Int = sumIntegers(List(x,y))
  def sum3(x: Int, y: Int): Int = sumIntegers(MyIterable(x,y))

  case class MyIterable(x: Int, y: Int) extends Iterable[Int] {
    override def iterator: Iterator[Int] = Iterator(x,y)
  }
}
