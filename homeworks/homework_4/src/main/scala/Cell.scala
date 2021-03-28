trait Cell

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
  override def toString: String = referenceCellToString(List())

  private def referenceCellToString(visited: List[Cell]): String ={
    table.getCell(ix,iy) match {
      case None => "outOfRange"
      case Some(cell) => cell match {
        case refCell: ReferenceCell => {
          if (visited.contains(refCell)) "cyclic" else refCell.referenceCellToString(visited :+ refCell)
        }

        case _ => cell.toString
      }
    }
  }
}