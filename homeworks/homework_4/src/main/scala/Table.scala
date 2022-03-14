import scala.collection.mutable

class Table(width: Int, height: Int) {
    private val table = mutable.Map[(Int, Int), Cell]()

    for (x <- 0 to width; y <- 0 to height) table += (x, y) -> EmptyCell()

    def getCell(x: Int, y: Int): Option[Cell] = table.get((x, y))

    def setCell(x: Int, y: Int, cell: Cell): Unit = table((x, y)) = cell
}