case class Table(n: Int, m: Int){
  private val matrix = Array.ofDim[Cell](n,m)
  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if(ix >= 0 && iy >= 0 && ix <= n-1 && iy <= m-1) {
      if(matrix(ix)(iy) != null) {
        Some(matrix(ix)(iy))
      }
      else{
        Some(new EmptyCell())
      }
    }
    else{
      None
    }
  }
  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if(ix >= 0 && iy >= 0 && ix <= n-1 && iy <= m-1) {
      matrix(ix)(iy) = cell
    }
  }
}