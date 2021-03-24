import scala.collection.mutable.ArrayBuffer

class Table(width: Int, height: Int) {
  private val array = ArrayBuffer.fill[Cell](width * height)(new EmptyCell)

  private def checkIndex(ix: Int, iy: Int): Boolean = {
    0 <= ix && 0 <= iy && ix < width && iy < height
  }

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (checkIndex(ix, iy)) Some(array(ix + iy * width))
    else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (checkIndex(ix, iy)) array(ix + iy * width) = cell
  }
}