import utest._

object MyTest extends TestSuite {
    val tests = Tests {
        'test_referenceCell_deepRecursion - {
            val table = new Table(3, 3)
            val cellRef01 = new ReferenceCell(0, 2, table)
            val cellRef02 = new ReferenceCell(1, 1, table)
            val cellRef11 = new ReferenceCell(0, 1, table)
            table.setCell(0, 1, cellRef01)
            table.setCell(0, 2, cellRef02)
            table.setCell(1, 1, cellRef11)
            assert(table.getCell(0, 1).get.toString == "cyclic")
            assert(table.getCell(0, 2).get.toString == "cyclic")
            assert(table.getCell(1, 1).get.toString == "cyclic")
        }
    }
}
