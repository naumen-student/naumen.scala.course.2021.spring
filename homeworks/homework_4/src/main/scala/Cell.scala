import scala.collection.mutable

sealed trait Cell {
}

class EmptyCell extends Cell {
    override def toString: String = "empty"
}

class NumberCell(private val number: Number) extends Cell {
    override def toString: String = number.toString
}

class StringCell(private val string: String) extends Cell {
    override def toString: String = string

}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
    override def toString: String = {
        var nextCell = table.getCell(ix, iy).get
        val referenceCells = mutable.HashSet(this)
        while (nextCell.isInstanceOf[ReferenceCell]) {
            val nextReferenceCell = nextCell.asInstanceOf[ReferenceCell]
            if (referenceCells.contains(nextReferenceCell)) {
                return "cyclic"
            }
            nextCell = nextReferenceCell.table.getCell(nextReferenceCell.ix, nextReferenceCell.iy).get
            referenceCells += nextReferenceCell
        }
        nextCell.toString
    }
}