import scala.collection.mutable

class Table(private val width: Int, private val height: Int) {
  private val Cells: mutable.Map[(Int, Int), Cell] = mutable.Map[(Int, Int), Cell]()

  def getCell(x: Int, y: Int): Option[Cell] = {
    if (!(x < width && y < height && x > -1 && y > -1))
      return None
    if (Cells.contains((x, y)))
      Cells.get((x, y))
    else
      Option(new EmptyCell)
  }

  def setCell(x: Int, y: Int, cell: Cell): Unit = {
    if (x < width && y < height && x > -1 && y > -1)
      Cells.put((x, y), cell)
  }
}