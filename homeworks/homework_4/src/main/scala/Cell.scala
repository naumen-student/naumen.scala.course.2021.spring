import scala.collection.mutable

trait Cell {
}

class EmptyCell extends Cell {
    override def toString = "empty"
}

class NumberCell(number: Int) extends Cell {
    override def toString: String = number.toString
}

class StringCell(string: String) extends Cell {
    override def toString: String = string
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell {
    override def toString: String = {
        val visitedCells = mutable.HashSet[ReferenceCell]()
        var nextCell = table.getCell(ix, iy).getOrElse("outOfRange")

        while (nextCell.isInstanceOf[ReferenceCell]) {
            val nexCellAsReferenced = nextCell.asInstanceOf[ReferenceCell]
            if (visitedCells.contains(nexCellAsReferenced)) {
                return "cyclic"
            }

            visitedCells += nexCellAsReferenced
            nextCell = table.getCell(nexCellAsReferenced.ix, nexCellAsReferenced.iy).getOrElse("outOfRange")
        }
        nextCell.toString
    }
}