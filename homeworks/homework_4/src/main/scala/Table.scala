import scala.Array.ofDim

class Table(val width: Int, val height: Int) {
  private val cells = ofDim[Cell](width, height)

  def getCell(ix: Int, iy: Int): Option[Cell] = if (cellInRange(ix, iy)) Some(cells(ix)(iy)) else None

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells(ix)(iy) = cell

  private def cellInRange(ix: Int, iy: Int) = (0 <= ix && ix < width) && (0 <= iy && iy <= height)

  for (i <- 0 until width; j <- 0 until height) cells(i)(j) = new EmptyCell
}