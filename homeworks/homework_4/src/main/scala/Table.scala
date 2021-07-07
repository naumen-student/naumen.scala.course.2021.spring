import scala.collection.mutable

class Table(private val width: Int, private val height: Int) {
  private val DEFAULT = new EmptyCell
  private val Cells: mutable.Map[(Int, Int), Cell] = mutable.Map[(Int, Int), Cell]()

  def getCell(x: Int, y: Int): Option[Cell] = {
    if (!positionInTable(x, y))
      return None
    if (Cells.contains((x, y)))
      Cells.get((x, y))
    else
      Option(DEFAULT)
  }

  def setCell(x: Int, y: Int, cell: Cell): Unit = {
    if (positionInTable(x, y))
      Cells.put((x, y), cell)
  }

  private def positionInTable(x: Int, y: Int): Boolean = x < width && y < height && x > -1 && y > -1
}