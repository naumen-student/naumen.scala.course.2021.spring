import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_divBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 14) == 42)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
        }
        'test_primeFactor- {
             assert(Exercises.primeFactor(4) == Seq(2))
             assert(Exercises.primeFactor(17) == Seq(17))
             assert(Exercises.primeFactor(1024) == Seq(2))
             assert(Exercises.primeFactor(1782) == Seq(2, 3, 11))
        }
      'test_sumScalars- {
        assert(Exercises.sumScalars(Vector2D(0, 0), Vector2D(3, 2), Vector2D(4, 6), Vector2D(0, 0)) == 0)
        assert(Exercises.sumScalars(Vector2D(-1, -2), Vector2D(-3, -4), Vector2D(4, 3), Vector2D(2, 1)) == 22)

      }
      'test_sumCosines - {
        assert(Exercises.sumCosines(Vector2D(-4, -4), Vector2D(2, 2), Vector2D(3, 3), Vector2D(-1, -1)) == -2)
        assert(Exercises.sumCosines(Vector2D(0, 1), Vector2D(1, 0), Vector2D(0, 2), Vector2D(2, 0)) == 0)
      }
      'test_sortByHeavyweight - {
        assert(Exercises.sortByHeavyweight( Map(
          "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874),
          "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90),
          "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
          "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25),
          "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04),
          "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)
        )) ==
          Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten",
            "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium",
            "Magnesium", "Potassium", "Graphite"))
      }
    }
}
