trait Cell {
  def toString: String
}

case class EmptyCell() extends Cell {
  override def toString = "empty"
}

case class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

case class StringCell(text: String) extends Cell {
  override def toString: String = text
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = table.getCell(ix, iy) match {
    case None => "outOfRange"
    case Some(cell: ReferenceCell) =>
      if (cell.table.getCell(cell.ix, cell.iy).contains(this))
        "cyclic"
      else
        cell.toString
    case Some(cell) => cell.toString
  }
}
