import scala.collection.mutable

class Table(val width: Int, val length: Int) {
  private val table: mutable.ArraySeq[Cell] = mutable.ArraySeq.fill(width * length)(EmptyCell())

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    val index = ix + iy * width
    if (index >= 0 && index < width * length) Some(table(index)) else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = table.update(ix + iy * width, cell)
}