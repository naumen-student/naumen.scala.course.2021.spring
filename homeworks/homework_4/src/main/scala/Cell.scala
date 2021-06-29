sealed trait Cell

case class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  def getCell: Option[Cell] = {
    table.getCell(ix, iy)
  }

  override def toString: String = {
    getCell match {
      case None => "outOfRange"
      case Some(cell: ReferenceCell) => {
        val other = cell.getCell.get
        if(other != this) other.toString
        else "cyclic"
      }
      case Some(cell: Cell) => cell.toString
    }
  }
}

case class StringCell(s: String) extends Cell {
  override def toString: String = s
}