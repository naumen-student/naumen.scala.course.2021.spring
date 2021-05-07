import scala.collection.mutable.ArraySeq


case class Table(width: Int, height: Int) {
  private val cells: ArraySeq[Cell] = ArraySeq.fill(width * height)(EmptyCell())

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    val i = ix + iy * width
    if ( ix < width && ix >= 0 && iy < height && iy >= 0) Option(cells(i)) else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells.update(ix + iy * width, cell)

}
