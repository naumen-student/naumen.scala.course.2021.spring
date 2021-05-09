import scala.util.{Failure, Success, Try}

class Table (val x:Int, val y:Int) {
  val vectorCells = scala.collection.mutable.ArraySeq.fill[Cell](x + x * y)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    Try(vectorCells(ix + x * iy))
    match {
      case Success(_) => Some(vectorCells(ix + x * iy))
      case Failure(_) => None
    }
//    (возвращает ячейку по индексам строки и столбца)
  }
    def setCell(ix: Int, iy: Int, cell:Cell):Unit = {
      Try(vectorCells(ix + x * iy))
      match {
        case Success(_) => vectorCells.update(ix + x * iy, cell)
        case Failure(_) => None
      }
//      (устанавливает ячейку cell в указанные столбец и строку),
  }
}