import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
    'sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
      assert(Exercises.sumOfDivBy3Or5(3, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(5, 5) == 5)
      assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
      assert(Exercises.sumOfDivBy3Or5(-3, -3) == -3)
      assert(Exercises.sumOfDivBy3Or5(-5, -5) == -5)
      assert(Exercises.sumOfDivBy3Or5(-5, 0) == -8)
    }
    'primeFactor - {
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(98) == Seq(2, 7))
      assert(Exercises.primeFactor(0) == Seq())
      assert(Exercises.primeFactor(3) == Seq(3))
    }
    'sumScalars - {
      assert(Exercises.sumScalars(Exercises.Vector2D(1, 2), Exercises.Vector2D(3, 4), Exercises.Vector2D(5, 6), Exercises.Vector2D(7, 8)) == 94)
      assert(Exercises.sumScalars(Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0)) == 0)
      assert(Exercises.sumScalars(Exercises.Vector2D(1, -1), Exercises.Vector2D(-1, 1), Exercises.Vector2D(1, 1), Exercises.Vector2D(-1, -1)) == -4)
    }
    'sumCosines - {
      assert(Exercises.sumCosines(Exercises.Vector2D(-1, 1), Exercises.Vector2D(1, 0), Exercises.Vector2D(-1, 1), Exercises.Vector2D(1, 0)) + math.sqrt(2) < 0.0001)
      assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(-1, 0), Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1)) < 0.0001)
    }
    'sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(Exercises.balls) == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead",
        "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium",
        "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
    }
  }
}
