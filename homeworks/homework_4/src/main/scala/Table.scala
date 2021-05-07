import collection.mutable.ListBuffer

class Table(width:Int, length:Int){
  private val buffer = ListBuffer.fill[Cell](width*length)(new EmptyCell)

  private def getIndex(ix: Int, iy: Int): Int = ix + iy * width

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix >= width || iy < 0 || iy >= length) None else Some(buffer(getIndex(ix, iy)))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    buffer(getIndex(ix, iy)) = cell
  }
}
