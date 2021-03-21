import scala.collection.mutable

class Table(width: Int, height: Int) {
    private val table = mutable.Map[(Int, Int), Cell]()
    for (i <- 0 to width; j <- 0 to height) table += (i, j) -> EmptyCell()
    
    def getCell(ix: Int, iy: Int): Option[Cell] = {
        table.get((ix, iy))
    }
    
    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
        table((ix, iy)) = cell
    }
}
