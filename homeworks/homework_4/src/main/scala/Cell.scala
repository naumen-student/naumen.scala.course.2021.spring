import scala.annotation.tailrec

trait Cell

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}

case class StringCell(value: String) extends Cell {
  override def toString: String = value
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  import ReferenceCell._

  @tailrec
  private def _toString(cell: Cell, visited: Set[ReferenceCell]): String = {
    if (!cell.isInstanceOf[ReferenceCell])
      return cell.toString

    val refCell = cell.asInstanceOf[ReferenceCell]
    if (visited.contains(refCell))
      return CYCLIC
    table.getCell(refCell.ix, refCell.iy) match {
      case Some(e) => _toString(e, visited + refCell)
      case None => OUT_OF_RANGE
    }
  }

  override def toString: String = table.getCell(ix, iy) match {
    case Some(e) => _toString(e, Set(this))
    case None => OUT_OF_RANGE
  }
}

object ReferenceCell {
  val OUT_OF_RANGE = "outOfRange"
  val CYCLIC = "cyclic"
}
