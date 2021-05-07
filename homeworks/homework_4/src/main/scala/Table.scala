class Table(width: Int, height: Int){
  private val table: Array[Cell] = Array.fill(width * height)(EmptyCell())
  private val xyToIndex = (x: Int, y: Int) => y * width + x

  def getCell(ix: Int, iy: Int): Option[Cell] = xyToIndex(ix, iy) match {
    case index if index > table.length - 1 || index < 0 => None
    case index => Some(table(index))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = table.update(xyToIndex(ix, iy), cell)
}