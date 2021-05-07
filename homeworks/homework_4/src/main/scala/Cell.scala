import scala.annotation.tailrec
import scala.collection.immutable.HashSet

trait Cell{
   def toString:String
}

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

case class StringCell(string: String) extends Cell{
  override def toString: String = string
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell{
  override def toString: String = refToString(HashSet.empty)

  @tailrec
  private def refToString(hash: HashSet[Cell]): String ={
    val cell = table.getCell(ix,iy)
    cell match {
      case None => "outOfRange"
      case Some(cell) => cell match {
        case refCel: ReferenceCell => {
          if (hash.contains(refCel)) "cyclic" else refCel.refToString(hash+refCel)
        }
        case someCell => someCell.toString
      }
    }
  }
}

