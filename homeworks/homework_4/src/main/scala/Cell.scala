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
  override def toString: String = table.getCell(ix, iy) match {
    case Some(cell) => if (isCyclic(cell)) "cyclic" else cell.toString
    case None => "outOfRange"
  }

  private def isCyclic(cell: Cell): Boolean = {
    cell match {
      case ReferenceCell(ix, iy, table) => table.getCell(ix, iy).getOrElse(false) == this
      case _ => false
    }
  }
}
