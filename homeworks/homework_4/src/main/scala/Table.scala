import scala.collection.mutable

class Table(width: Int, height: Int) {
  val seq: mutable.Seq[Cell] = mutable.Seq.fill(width * height) {EmptyCell()}

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix >= 0 && iy >= 0 && ix <= width && iy <= height) Some(seq(ix + iy * width))
    else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    seq.update(ix + iy * width, cell)
  }
}