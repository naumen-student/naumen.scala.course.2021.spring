import Exercises.{Vector2D, balls}
import utest._

object Test extends TestSuite{

  val tests = Tests{
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }

    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
      assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
      assert(Exercises.sumOfDivBy3Or5(0, 50) == 593)
    }

    'test_primeFactor - {
      assert(Exercises.primeFactor(1) == Seq())
      assert(Exercises.primeFactor(5) == Seq(5))
      assert(Exercises.primeFactor(8) == Seq(2))
      assert(Exercises.primeFactor(63) == Seq(3, 7))
    }

    'test_sumScalars - {
      assert(Exercises.sumScalars(Vector2D(0, 1), Vector2D(1, 0), Vector2D(0, 2), Vector2D(2, 0)) == 0)
      assert(Exercises.sumScalars(Vector2D(0, 0), Vector2D(3, 2), Vector2D(4, 6), Vector2D(0, 0)) == 0)
      assert(Exercises.sumScalars(Vector2D(-4, -4), Vector2D(2, 2), Vector2D(3, 3), Vector2D(-1, -1)) == -22)
      assert(Exercises.sumScalars(Vector2D(-1, -2), Vector2D(-3, -4), Vector2D(4, 3), Vector2D(2, 1)) == 22)
      assert(Exercises.sumScalars(Vector2D(0.5, 2.5), Vector2D(0.3, 0.2), Vector2D(2.1, 3.3), Vector2D(0.8, 1.2)) == 6.29)
    }

    'test_sumCosines - {
      assert(Exercises.sumCosines(Vector2D(0, 1), Vector2D(1, 0), Vector2D(0, 2), Vector2D(2, 0)) == 0)
      assert(Exercises.sumCosines(Vector2D(-4, -4), Vector2D(2, 2), Vector2D(3, 3), Vector2D(-1, -1)) == -2)
      assert(java.lang.Math.abs(Exercises.sumCosines(Vector2D(-1, -2), Vector2D(-3, -4), Vector2D(4, 3), Vector2D(2, 1)) - 1.9) <= 0.1)
      assert(java.lang.Math.abs(Exercises.sumCosines(Vector2D(1, 1), Vector2D(2, 2), Vector2D(2, 2), Vector2D(1, 1)) - 2) <= 0.1)
    }

    'test_sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(balls) ==
        Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten",
          "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium",
          "Magnesium", "Potassium", "Graphite"))
    }
  }
}