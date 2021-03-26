import collection.mutable

class Table(height: Int, width: Int) {
  private val tableValues: mutable.ArraySeq[Cell] = Array.fill[Cell](height * width)(EmptyCell())
  private def realIndex(ix: Int, iy: Int) = ix * width + iy

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || iy < 0 || ix >= height || iy >= width)
      None
    else
      Option(tableValues.apply(realIndex(ix, iy)))
  }

  def setCell(ix: Int, iy: Int, cell: Cell) = {
    tableValues.update(realIndex(ix, iy), cell)
  }
}