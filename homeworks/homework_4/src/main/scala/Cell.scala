trait Cell {
  protected def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(val arg: Int) extends Cell {
  override def toString: String = arg.toString
}

class StringCell(val arg: String) extends Cell {
  override def toString: String = arg
}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
  private def recStr(cell: Option[Cell], visited: Seq[ReferenceCell]): String = cell match {
    case Some(x) => x match {
      case currentCell: ReferenceCell =>
        if (!visited.contains(x)) recStr(table.getCell(currentCell.ix, currentCell.iy), visited :+ currentCell)
        else "cyclic"
      case _ => x.toString
    }
    case None => "outOfRange"
  }

  override def toString: String = recStr(table.getCell(ix, iy), Seq(this))
}