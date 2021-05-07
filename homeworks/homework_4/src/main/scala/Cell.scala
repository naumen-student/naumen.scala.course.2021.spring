trait Cell {
   def toString: String
}

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
  def getRef: Option[Cell] = table.getCell(ix, iy)

  override def toString: String = {
    var currCell = getRef
    var hasRef = true
    while (hasRef) {
      currCell match {
        case Some(r: ReferenceCell) =>
          if (this == r) return "cyclic"
          currCell = r.getRef
        case _ => hasRef = false
      }
    }
    currCell match {
      case None => "outOfRange"
      case Some(value) => value.toString
    }
  }
}