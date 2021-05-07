sealed trait Cell {
  override def toString: String = {
    this match {
      case EmptyCell() => "empty"
      case NumberCell(number: Int) => number.toString
      case StringCell(string) => string
      case ReferenceCell(cellX, cellY, table) => table.getCell(cellX, cellY) match {
        case None => "outOfRange"
        case Some(cell) => cell match {
          case ReferenceCell(cellX, cellY, table) => table.getCell(cellX, cellY) match {
            case None => "outOfRange"
            case Some(x) => if (x == this) "cyclic" else x.toString
          }
          case _=> cell.toString
        }
      }
    }
  }
}
case class EmptyCell() extends Cell
case class NumberCell(number: Int) extends Cell
case class StringCell(string: String) extends Cell
case class ReferenceCell(cellX: Int, cellY: Int, table: Table) extends Cell
