package homework_3

case class IterablePoint(var x: Int, y: Int) extends Iterable[Int] {
    override def iterator: Iterator[Int] = {
        Iterator(x, y)
    }
}