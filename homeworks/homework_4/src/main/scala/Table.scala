import scala.collection.mutable

class Table(width: Int, height: Int)
{
  private val table : Array[Array[Cell]] = Array.ofDim[Cell](width, height)
  for {j <- 0 until height}{
    for {i <- 0 until width}
    {
      table(i)(j) = new EmptyCell
    }
  }

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix >= width || iy < 0 || iy >= height) None
    else Some(table(ix)(iy))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    table(ix)(iy) = cell
  }
}