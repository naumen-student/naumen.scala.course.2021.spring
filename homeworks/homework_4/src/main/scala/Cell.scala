sealed trait Cell {
    override def toString: String = this match {
        case EmptyCell() => "empty"
        case NumberCell(n) => n.toString
        case StringCell(s) => s
        case cell@ReferenceCell(ix, iy, table) =>
            var current = cell
            var cells: Set[Cell] = Set(current)
            var next = table.getCell(current.ix, current.iy)
            while (!cells.contains(next.get)) {
                next match {
                    case Some(refCell: ReferenceCell) =>
                        cells = cells + refCell
                        current = refCell
                    case Some(_) => return next.get.toString
                    case None => return "outOfRange"
                }
                next = table.getCell(current.ix, current.iy)
            }
        "cyclic"
    }
}

case class EmptyCell() extends Cell
case class NumberCell(number: Int) extends Cell
case class StringCell(string: String) extends Cell
case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell

