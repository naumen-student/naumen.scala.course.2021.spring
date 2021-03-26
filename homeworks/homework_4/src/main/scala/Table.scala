import scala.collection.mutable

class Table(x: Int, y: Int){

  val table: mutable.Map[(Int, Int), Cell] = mutable.Map()

  for {
    ix <- 0 to x
    iy <- 0 to y
  } table((ix, iy)) = new EmptyCell

  def getCell(ix: Int, iy: Int) : Option[Cell] = if (inRange(ix, iy)) Option(table((ix, iy))) else None

  def setCell(ix: Int, iy: Int, cell: Cell) : Unit = if (inRange(ix, iy)) table((ix, iy)) = cell else None

  def inRange(ix: Int, iy: Int): Boolean = ix < x && iy < y && ix >= 0 && iy >= 0
}