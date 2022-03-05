import Exercises._
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1,3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5,9) == 20)
            assert(Exercises.sumOfDivBy3Or5(0,100) == 2418)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(6) == Seq(2, 3))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }
        'test_sumByFunc - {
            val a = Exercises.Vector2D(1, 5)
            val b = Exercises.Vector2D(5, 1)
            val c = Exercises.Vector2D(7, 6)
            val d = Exercises.Vector2D(-1, 1)
            assert(Exercises.sumScalars(a,b,c,d) == 9.0)
            assert(Exercises.sumCosines(a,b,c,d) - 0.3079 <= 0.001)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(balls) ==
              Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten",
                  "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium",
                  "Magnesium", "Potassium", "Graphite"))
        }
    }
}
