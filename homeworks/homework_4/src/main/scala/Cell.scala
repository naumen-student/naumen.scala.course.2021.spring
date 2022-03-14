trait Cell {
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(num: Int) extends Cell {
  override def toString: String = num.toString
}

class StringCell(str: String) extends Cell {
  override def toString: String = str
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  def getRefCell: Option[Cell] = {
    table.getCell(ix, iy)
  }

  override def toString: String = {
    var currCell = getRefCell
    var terminal = false
    while (!terminal) {
      currCell match {
        case Some(ref: ReferenceCell) =>
          if (ref != this) currCell = ref.getRefCell
          else return "cyclic"
        case _ => terminal = true
      }
    }
    currCell match {
      case Some(t) => t.toString
      case None => "outOfRange"
    }
  }
}