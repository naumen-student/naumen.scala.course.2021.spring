sealed trait Cell

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
    def getCell: Option[Cell] = table.getCell(ix, iy)

    override def toString: String = getCell match {
        case Some(value) => value match {
            case cell: ReferenceCell if (cell.getCell.getOrElse() == this) => "cyclic"
            case value => value.toString
        }
        case _ => "outOfRange"
    }
}