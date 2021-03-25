class Table(width: Int, height: Int) {
    private val arr: Array[Cell] = new Array[Cell](width * height).map(_ => new EmptyCell)

    def getCell(ix: Int, iy: Int): Option[Cell] = {
        val index = iy * this.width + ix
        if (index >= 0 && index < arr.length) Some(arr(index)) else None
    }

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
        val index = iy * this.width + ix
        if (index >= 0 && index < arr.length) arr(index) = cell
    }
}