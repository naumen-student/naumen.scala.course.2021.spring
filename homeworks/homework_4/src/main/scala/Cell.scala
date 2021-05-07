import scala.collection.mutable

trait Cell {
}

case class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

case class StringCell(value: String) extends Cell {
  override def toString: String = value
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = {
    val visitedCells = mutable.HashSet[Cell]()
    var currentCell = table.getCell(ix, iy)
    var result: String = null
    while(result == null) {
      currentCell match {
        case None => result = "outOfRange"
        case Some(cell: ReferenceCell) => {
          if (visitedCells.contains(cell)) {
            result = "cyclic"
          }
          else {
            currentCell = table.getCell(cell.ix, cell.iy)
            visitedCells.add(cell)
          }
        }
        case Some(cell: Cell) => result = cell.toString
      }
    }
    result
  }
}

