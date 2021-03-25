import scala.collection.mutable

case class Table(width: Int, height: Int) {
  private val cells: mutable.ArraySeq[Cell] = mutable.ArraySeq.fill(width * height) {
    EmptyCell()
  }

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    val i = ix + iy * width
    if (ix > width || iy > height || ix < 0 || iy < 0) None else Option(cells(i))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells.update(ix + iy * width, cell)
}