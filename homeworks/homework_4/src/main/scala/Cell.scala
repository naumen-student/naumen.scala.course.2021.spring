import scala.collection.mutable

trait Cell {}

class EmptyCell() extends Cell {
    override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
    override def toString: String = number.toString
}

class StringCell(string: String) extends Cell {
    override def toString: String = string
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
    override def toString: String = toStringWithoutCycle(mutable.HashSet[ReferenceCell]())

    private def toStringWithoutCycle(viewed: mutable.HashSet[ReferenceCell]): String = {
        if (viewed.contains(this))
            return "cyclic"
        viewed += this
        val result = table.getCell(ix, iy)
        if (result.isEmpty)
            return "outOfRange"
        val cell = result.get
        if (!cell.isInstanceOf[ReferenceCell])
            return cell.toString
        cell.asInstanceOf[ReferenceCell].toStringWithoutCycle(viewed)
    }
}