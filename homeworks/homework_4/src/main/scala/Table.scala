import scala.collection.mutable.ArrayBuffer

class Table (val x:Int, val y:Int) {
  private val array = ArrayBuffer.fill[Cell](x * y)(new EmptyCell)

  private def inBounds(ix: Int, iy: Int): Boolean = 0 <= ix && 0 <= iy && ix < x && iy < y

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (inBounds(ix, iy)) {
      Some(array(ix + iy * x))
    } else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (inBounds(ix, iy)) {
      array(ix + iy * x) = cell
    }
  }
}