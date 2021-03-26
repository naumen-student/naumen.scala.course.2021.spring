sealed trait Cell

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

case class StringCell(string: String) extends Cell {
  override def toString: String = string.toString
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = table.getCell(ix, iy) match {
    case None => "outOfRange"
    case Some(cell: ReferenceCell) =>
      if (cell.table.getCell(cell.ix, cell.iy) == Option(this)) "cyclic" else cell.toString
    case Some(cell) => cell.toString
  }
}