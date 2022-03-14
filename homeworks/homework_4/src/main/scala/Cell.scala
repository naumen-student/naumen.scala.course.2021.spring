sealed trait Cell {
  def toString(): String
}

class EmptyCell extends Cell {
  override def toString(): String = "empty"
}

case class NumberCell(value: Int) extends Cell {
  override def toString(): String = value.toString()
}

case class StringCell(value: String) extends Cell {
  override def toString(): String = value
}

case class ReferenceCell(x: Int, y: Int, table: Table) extends Cell {
  override def toString(): String =
    table.getCell(x, y) match {
      case None                       => "outOfRange"
      case Some(other: ReferenceCell) =>
        if (other.table.getCell(other.x, other.y).contains(this)) "cyclic"
        else other.toString
      case Some(cell: Cell)           => cell.toString
    }
}
