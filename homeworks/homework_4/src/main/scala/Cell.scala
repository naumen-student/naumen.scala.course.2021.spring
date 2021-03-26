trait Cell {
  def toString(): String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}

case class StringCell(text: String) extends Cell {
  override def toString: String = text
}

case class ReferenceCell(x: Int, y: Int, table: Table) extends Cell {
  override def toString: String = {
    table.getCell(x, y) match {
      case None => "outOfRange"
      case Some(cell: ReferenceCell) =>
        if (cell.table.getCell(cell.x, cell.y) == Option(this)) "cyclic"
        else cell.toString
      case Some(x) => x.toString
    }
  }
}
