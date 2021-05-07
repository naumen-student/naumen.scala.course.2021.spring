import scala.collection.mutable

trait Cell{
  def toString: String
}

class EmptyCell extends Cell{
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell{
  override def toString: String = number.toString
}

class StringCell(string: String) extends Cell{
  override def toString: String = string
}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
  override def toString: String = {
    getString(mutable.HashSet[ReferenceCell](), this)
  }

  private def getString(way: mutable.HashSet[ReferenceCell], current: ReferenceCell): String = {
    if (way contains current)
      return "cyclic"
    way += current
    current.table.getCell(current.ix, current.iy) match {
      case None => "outOfRange"
      case Some(cell: ReferenceCell) => getString(way, cell)
      case Some(cell) => cell.toString
    }
  }
}
