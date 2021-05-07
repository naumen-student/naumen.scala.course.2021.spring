import scala.collection.mutable

class Table(height: Int, width: Int) {
  private val _data: mutable.ArraySeq[Cell] = mutable.ArraySeq.fill(height * width)(EmptyCell())
  private def _dataIdx(ix: Int, iy: Int) = iy + ix * width

  def getCell(ix: Int, iy: Int): Option[Cell] =
    if (ix < 0 || iy < 0 || ix >= height || iy >= width) None
    else Option(_data(_dataIdx(ix, iy)))

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = _data(_dataIdx(ix, iy)) = cell
}
