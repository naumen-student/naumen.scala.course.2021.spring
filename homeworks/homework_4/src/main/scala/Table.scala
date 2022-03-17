case class Table(width: Int, height: Int) {
  private val cells = Array.fill[Cell](width * height)(new EmptyCell)

  def isValidPoint(x: Int, y: Int): Boolean = {
    if (x >= width || x < 0 || y >= height || y < 0) false
    else true
  }

  def getCell(x: Int, y: Int): Option[Cell] = {
    if (isValidPoint(x, y)) Some(cells(x + width*y))
    else None
  }

  def setCell(x: Int, y: Int, cell: Cell): Unit = {
    if (isValidPoint(x, y))
      cells(x + width*y) = cell
  }
}
