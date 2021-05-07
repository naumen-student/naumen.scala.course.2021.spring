import scala.collection.mutable

case class Table(wight: Int, height: Int) {
  val cells: mutable.Seq[Cell] = mutable.ArrayBuffer.fill(wight + height * wight)(EmptyCell())
  def getCell(ix: Int, iy: Int): Option[Cell] =
    if (ix >= wight || iy >= height || ix < 0 || iy < 0) None else Some(cells(ix + iy * wight))
  def setCell(ix: Int, iy: Int, cell: Cell): Unit = { cells(ix + iy * wight) = cell }
}
