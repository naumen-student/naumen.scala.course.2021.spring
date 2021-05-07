import scala.collection.mutable

trait Cell


case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

class NumberCell(val number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(val text: String) extends Cell {
  override def toString: String = text
}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
  val outOfRangeError = "outOfRange"
  val cyclicError = "cyclic"

  override def toString: String = toStringCheckCycle(mutable.HashSet[ReferenceCell]())

  def toStringCheckCycle(visited: mutable.HashSet[ReferenceCell]): String = {
    if (visited.contains(this)) {
      return cyclicError
    }
    visited.add(this)
    if (ix < 0 || iy < 0 || ix >= table.x || iy >= table.y) return outOfRangeError
    val cell = table.getCell(ix, iy)
    cell.get match {
      case referenceCell: ReferenceCell => referenceCell.toStringCheckCycle(visited)
      case value => value.toString
    }
  }
}