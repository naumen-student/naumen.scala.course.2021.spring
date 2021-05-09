trait Cell

class EmptyCell extends Cell{ // для пустых ячеек
  override def toString: String = "empty"
}

class NumberCell(number:Int) extends Cell { // ячейка с 32-битным целым числом
  override def toString: String = number.toString
}

class StringCell(string: String) extends Cell { // ячейка с текстом
  override def toString: String = string
}

class ReferenceCell(val ix:Int, val iy:Int, val table:Table) extends Cell { // ячейка, содержащая ссылку на другую ячейку
  override def toString: String = table.getCell(ix, iy).get match {
    case ref: ReferenceCell => if (table.getCell(ref.ix, ref.iy).contains(this)) "cyclic" else ref.toString
    case value => value.toString
  }
}