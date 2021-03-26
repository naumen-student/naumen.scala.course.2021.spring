import scala.collection.mutable.MutableList

case class Table(width: Int, height: Int) {
  private var field = MutableList.fill[Cell](width, height)(new EmptyCell)

  def getCell(x: Int, y: Int): Option[Cell] =
    if (x >= 0 && x < width && y >= 0 && y < height) Some(field(x)(y))
    else None

  def setCell(x: Int, y: Int, cell: Cell) = field(x)(y) = cell
}
