trait Cell
class EmptyCell extends Cell {
  override def toString: String = "empty"
}
class NumberCell(number: Int) extends Cell{
  override def toString: String = number.toString
}
class StringCell(string: String) extends Cell{
  override def toString: String = string
}
class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell{
  override def toString: String = table.getCell(ix, iy) match {
    case Some(r: ReferenceCell) => if (r.table.getCell(r.ix, r.iy).contains(this)) "cyclic" else r.toString
    case Some(value) => value.toString
    case None => "outOfRange"
  }
}