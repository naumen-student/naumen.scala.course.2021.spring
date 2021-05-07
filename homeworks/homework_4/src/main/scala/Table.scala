class Table(width: Int, height: Int) {
  val array: Array[Cell] = Array.fill[Cell](width * height)(new EmptyCell)

  def getIndex(ix: Int, iy: Int): Int = iy * width + ix

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    val i = getIndex(ix, iy)
    if (i < 0 || i >= array.length)
      None
    else
      Some(array(i))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    array(getIndex(ix, iy)) = cell
  }
}