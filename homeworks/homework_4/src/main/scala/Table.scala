import scala.collection.mutable

case class Table(width: Int, height: Int) {
  private val cells: mutable.ArraySeq[Cell] = mutable.ArraySeq.fill(width * height)(EmptyCell())

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    val index = ix + iy * width
    if (index >= 0 && index < width * height) Some(cells(index)) else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells.update(ix + iy * width, cell)

}