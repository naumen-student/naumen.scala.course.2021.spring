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
          assert(Exercises.sumOfDivBy3Or5(0, 3) == 3)
          assert(Exercises.sumOfDivBy3Or5(0, 5) == 8)
          assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
        }

      'test_primeFactor - {
        assert(Exercises.primeFactor(8) == Seq(2))
        assert(Exercises.primeFactor(13) == Seq(13))
        assert(Exercises.primeFactor(54) == Seq(2, 3))
        assert(Exercises.primeFactor(2163) == Seq(3, 7, 103))
      }

      'test_sumScalars - {
        assert(Exercises.sumScalars(Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0)) == 0)
        assert(Exercises.sumScalars(Vector2D(-1, 0), Vector2D(0, 1), Vector2D(0, 262), Vector2D(32, 0)) == 0)
        assert(Exercises.sumScalars(Vector2D(2, 3), Vector2D(3, 2), Vector2D(4, 5), Vector2D(5, 4)) == 52)
      }

      'test_sumCosines - {
        val sumNear1d76 = Exercises.sumCosines(Vector2D(3, 4), Vector2D(4, 3), Vector2D(7, 1), Vector2D(5, 5))
        assert(1.75 < sumNear1d76 && sumNear1d76 <= 1.76)
        assert(Exercises.sumCosines(Vector2D(-1, 0), Vector2D(0, 1), Vector2D(0, 262), Vector2D(32, 0)) == 0)
      }

      'test_sortByHeavyweight - {
        assert(Exercises.sortByHeavyweight(Map("Big" -> (10, 24), "Small" -> (1, 3), "Heavy" -> (5, 500))) ==
        Seq("Small", "Big", "Heavy"))

        assert(Exercises.sortByHeavyweight(Exercises.balls) == Seq(
          "Tin", "Platinum", "Aluminum", "Sodium",
          "Nickel", "Titanium", "Lead", "Zirconium",
          "Chrome", "Iron", "Silver", "Uranium",
          "Lithium", "Gold", "Tungsten", "Copper",
          "Cesium", "Calcium", "Cobalt", "Potassium",
          "Plutonium", "Magnesium", "Graphite"))
      }

    }
}
