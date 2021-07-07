import scala.collection.mutable

class Cell(private val value: Any) {
  override def toString: String = value.toString
}
class EmptyCell extends Cell("empty")

class NumberCell(private val value: Int) extends Cell(value)

class StringCell(private val value: String) extends Cell(value)

class ReferenceCell(private val x: Int,
                    private val  y: Int,
                    private val table: Table) extends Cell {
  private val CYCLIC = "cyclic"
  private val OUT_OF_RANGE = "outOfRange"

  override def toString: String = toStringWithoutCycle(mutable.HashSet[ReferenceCell]())

  private def toStringWithoutCycle(visited: mutable.HashSet[ReferenceCell]): String = {
    if (visited.contains(this))
      return CYCLIC
    visited += this
    val result = table.getCell(x, y)
    if (result.isEmpty)
      return OUT_OF_RANGE
    result.get match {
      case referenceCell: ReferenceCell => referenceCell.toStringWithoutCycle(visited)
      case cell => cell.toString
    }
  }
}