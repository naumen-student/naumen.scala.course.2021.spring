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

  override def toString: String = {
    getString(mutable.HashSet[ReferenceCell](), this)
  }

  private def getString(existed: mutable.HashSet[ReferenceCell], current: ReferenceCell): String = {
    if (existed contains current)
      return "cyclic"
    existed += current
    current.table.getCell(current.x, current.y) match {
      case None => "outOfRange"
      case Some(cell: ReferenceCell) => getString(existed, cell)
      case Some(cell) => cell.toString
    }
  }
}

