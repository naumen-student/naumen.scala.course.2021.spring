trait Cell

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
  override def toString: String = table.getCell(ix, iy) match {
    // case Some(cell: ReferenceCell) => if (cell.table.getCell(cell.ix, cell.iy) == Some(this)) "cyclic" else cell.toString
    // what's about deep recursion???
    case Some(cell: ReferenceCell) => {
      var cyclic = false
      //var not_reference = false
      var new_cell = cell.table.getCell(cell.ix, cell.iy)
      while (new_cell.isInstanceOf[Option[ReferenceCell]] && !cyclic) {
        val new_ref_cell = new_cell.asInstanceOf[Option[ReferenceCell]].get
        if (new_ref_cell.table == this.table && new_ref_cell.ix == this.ix && new_ref_cell.iy == this.iy)
          cyclic = true
        new_cell = new_ref_cell.table.getCell(new_ref_cell.ix, new_ref_cell.iy)
      }
      if (cyclic) "cyclic" else new_cell.toString
    }
    case Some(cell) => cell.toString
    case None => "outOfRange"
  }
}