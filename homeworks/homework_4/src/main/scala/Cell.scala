sealed trait Cell

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}
case class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}
case class StringCell(value: String) extends Cell{
  override def toString: String = value
}
case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  def getLinkedCellOption: Option[Cell] = table.getCell(ix, iy)

  override def toString: String = getLinkedCellOption match {
    case Some(value) => value match {
      case cell: ReferenceCell
        if cell.getLinkedCellOption.getOrElse(false) == this => "cyclic"
      case _ => value.toString
    }
    case _ => "outOfRange"
  }
}