import scala.collection.mutable

class Table(x: Int, y: Int, cell: Cell = new EmptyCell){
  private val seqOfCells = new mutable.ArraySeq[Cell](x + y * x) map (_ => cell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if(seqOfCells.isDefinedAt(ix + iy * x)) Some(seqOfCells(ix + iy * x)) else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if(seqOfCells.isDefinedAt(ix + iy * x)) seqOfCells.update(ix + iy * x, cell)
  }
}