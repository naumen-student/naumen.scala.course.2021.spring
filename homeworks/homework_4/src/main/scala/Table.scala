class Table(width: Int, height: Int) {
    private val table: Array[Cell] = Array.fill[Cell](width * height) { new EmptyCell() }
    def getCell(ix: Int, iy: Int): Option[Cell] = {
        if (ix < 0 || ix >= height || iy < 0 || iy >= width)
            return None
        Option(table(ix + iy * width))
    }
    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
        table(ix + iy * width) = cell
    }
}