import scala.annotation.tailrec

trait Cell
{
    def toString: String
}

class EmptyCell extends Cell{
    override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell
{
    override def toString: String = number.toString
}

class StringCell(str: String) extends Cell
{
    override def toString: String = str
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {

    private var visited = false

    @tailrec
    private def removeVisits(): Unit = {
        if (visited)
            return
        visited = false
        table.getCell(ix, iy) match {
            case None =>
            case Some(cell) =>
                cell match {
                    case cell1: ReferenceCell => cell1.removeVisits()
                    case _ =>
                }
        }
    }
    override def toString: String = {
        table.getCell(ix, iy) match {
            case None => "outOfRange"
            case Some(cell) =>
                cell match {
                    case cel: ReferenceCell =>
                        if (cel.visited) { //если несколько раз вызвать для незацикленной, все равно цикл выдаст
                            //removeVisits() //чтоб несколько раз использовать зацикленные
                            "cyclic"
                        } else {
                            visited = true
                            cel.toString
                        }
                    case cel => cel.toString
                }
        }
    }
}