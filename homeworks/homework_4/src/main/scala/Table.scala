import scala.collection.mutable

class Table(width: Int, height: Int) {
  private val table = mutable.Map[(Int, Int), Cell]()

  for {x <- 0 to width
       y <- 0 to height}
    table((x, y)) = new EmptyCell

  def getCell(ix: Int, iy: Int): Option[Cell] =
    if(inRange(ix, iy)) Option(table((ix, iy)))
    else None

  def setCell(ix: Int, iy: Int, cell: Cell): Unit =
    if(inRange(ix, iy)) table((ix, iy)) = cell

  private def inRange(ix: Int, iy: Int): Boolean =
    ix >= 0 && ix < width && iy >= 0 && iy < height
}
