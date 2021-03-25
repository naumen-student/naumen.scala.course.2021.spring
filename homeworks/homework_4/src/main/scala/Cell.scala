sealed trait Cell {
  def toString: String
}

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

case class StringCell(string: String) extends Cell {
  override def toString: String = string
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = lastCellToString(this, Set())

  private def lastCellToString(cell: ReferenceCell, visited: Set[ReferenceCell]): String = {
    cell.table.getCell(cell.ix, cell.iy) match {
      case None => "outOfRange"
      case Some(valueCell) => valueCell match {
        case nextCell: ReferenceCell => {
          if (visited.contains(nextCell)) "cyclic"
          else lastCellToString(nextCell, visited + nextCell)
        }
        case _ => valueCell.toString
      }
    }
  }
}