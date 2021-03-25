import scala.Array.ofDim

case class Table(width: Int, height: Int) {
  val cells = ofDim[Cell](width, height)
  for (i <- 0 until width; j <- 0 until height) cells(i)(j) = EmptyCell()

  private def isIndexInTable(ix: Int, iy: Int): Boolean =
    ix < width && ix >= 0 && iy < height && iy >= 0

  def getCell(ix: Int, iy: Int): Option[Cell] =
    if (isIndexInTable(ix, iy)) Some(cells(ix)(iy)) else None

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    cells(ix)(iy) = cell
  }
}