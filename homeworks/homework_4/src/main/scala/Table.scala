
import scala.collection.mutable

class Table(width: Int, height: Int) {
    private val table = new mutable.MutableList[mutable.MutableList[Cell]]()
    for (_ <- 1 to width) {
        var line = new mutable.MutableList[Cell]()
        for (_ <- 1 to height) {
            line += new EmptyCell()
        }
        table += line
    }

    def getCell(ix: Int, iy: Int): Option[Cell] = {
        if (isOutsideTable(ix, iy)) None else Some(table(ix)(iy))
    }

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
        if (!isOutsideTable(ix, iy)) table(ix)(iy) = cell
    }

    private def isOutsideTable(ix: Int, iy: Int): Boolean = {
        ix < 0 || ix >= width || iy < 0 || iy >= width
    }
}