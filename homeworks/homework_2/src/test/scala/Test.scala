import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(6, 15) == Seq(6, 9, 10, 12, 15).sum)
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
            assert(Exercises.sumOfDivBy3Or5(3, 3) == 3)
            assert(
                Exercises.sumOfDivBy3Or5(2000000000, 2000000005) ==
                    Seq(2000000000, 2000000001, 2000000004, 2000000005).sum)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(256) == Seq(2))
            assert(Exercises.primeFactor(30) == Seq(2, 3, 5))
            assert(Exercises.primeFactor(100) == Seq(2, 5))
            assert(Exercises.primeFactor(113) == Seq(113))
            assert(Exercises.primeFactor(30030) == Seq(2, 3, 5, 7, 11, 13))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(VectorsTestCases.leftVec0, VectorsTestCases.leftVec1,
                VectorsTestCases.rightVec0, VectorsTestCases.rightVec1) == 17)
            assert(Exercises.sumScalars(VectorsTestCases.leftVec0, VectorsTestCases.rightVec0,
                VectorsTestCases.leftVec1, VectorsTestCases.rightVec1) == 14)
            assert(Exercises.sumScalars(VectorsTestCases.leftVec0, VectorsTestCases.leftVec0,
                VectorsTestCases.leftVec0, VectorsTestCases.leftVec0) == 4)
        }
        'test_sumCosines - {
            assert(Math.abs(Exercises.sumCosines(VectorsTestCases.leftVec0, VectorsTestCases.leftVec1,
                VectorsTestCases.rightVec0, VectorsTestCases.rightVec1) - 1.93) < 0.01)
            assert(Math.abs(Exercises.sumCosines(VectorsTestCases.leftVec0, VectorsTestCases.rightVec0,
                VectorsTestCases.leftVec1, VectorsTestCases.rightVec1) - 1.89) < 0.01)
            println(Exercises.sumCosines(VectorsTestCases.leftVec0, VectorsTestCases.leftVec0,
                VectorsTestCases.leftVec0, VectorsTestCases.leftVec0))
            assert(Math.abs(Exercises.sumCosines(VectorsTestCases.leftVec0, VectorsTestCases.leftVec0,
                VectorsTestCases.leftVec0, VectorsTestCases.leftVec0) - 2) < 0.1)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map("Hard" -> (2, 2), "Light" -> (1, 1))) == Seq("Light", "Hard"))
            assert(Exercises.sortByHeavyweight(Map("Hard" -> (1, 1.1), "Light" -> (1, 1))) == Seq("Light", "Hard"))
            assert(Exercises.sortByHeavyweight() == Seq(
                "Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold",
                "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt",
                "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
        }
    }

    object VectorsTestCases {
        val leftVec0 = Vector2D(1, 1)
        val leftVec1 = Vector2D(2, 1)
        val rightVec0 = Vector2D(2, 2)
        val rightVec1 = Vector2D(3, 4)
    }
}
