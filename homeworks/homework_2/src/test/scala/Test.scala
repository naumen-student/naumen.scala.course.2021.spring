import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(1, 6) == 14)
            assert(Exercises.sumOfDivBy3Or5(1, 8) == 14)
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(6) == Seq(2, 3))
            assert(Exercises.primeFactor(20) == Seq(2, 5))
            assert(Exercises.primeFactor(31) == Seq(31))
            assert(Exercises.primeFactor(65) == Seq(5, 13))
        }

        'test_sumByFunc - {
            val leftVec0 = Exercises.Vector2D(3, 4)
            val leftVec1 = Exercises.Vector2D(8, 6)
            val rightVec0 = Exercises.Vector2D(5, 13)
            val rightVec1 = Exercises.Vector2D(24, 7)

            assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == 259)
            assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) < 2)
        }

        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight() == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium",
                "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt",
                "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
        }
    }
}
