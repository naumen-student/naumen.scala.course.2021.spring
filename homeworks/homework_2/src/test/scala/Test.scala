import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 2) == Seq())
      assert(Exercises.divBy3Or7(0, 2) == Seq(0))
      assert(Exercises.divBy3Or7(4, 5) == Seq())
      assert(Exercises.divBy3Or7(3, 3) == Seq(3))
      assert(Exercises.divBy3Or7(4, 6) == Seq(6))
      assert(Exercises.divBy3Or7(7, 7) == Seq(7))
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42,
        45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
    'test_divBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
      assert(Exercises.sumOfDivBy3Or5(0, 2) == 0)
      assert(Exercises.sumOfDivBy3Or5(4, 5) == 5)
      assert(Exercises.sumOfDivBy3Or5(7, 8) == 0)
      assert(Exercises.sumOfDivBy3Or5(3, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(5, 5) == 5)
      assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
      assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
      assert(Exercises.sumOfDivBy3Or5(0, 1000000) == 233334166668L)
    }
    'test_primeFactor - {
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(98) == Seq(2, 7))
      assert(Exercises.primeFactor(43) == Seq(43))
      assert(Exercises.primeFactor(1) == Seq(1))
      assert(Exercises.primeFactor(0) == Seq(0))
      assert(Exercises.primeFactor(6) == Seq(2, 3))
      assert(Exercises.primeFactor(32) == Seq(2))
      assert(Exercises.primeFactor(121) == Seq(11))
      assert(Exercises.primeFactor(187) == Seq(11, 17))
      assert(Exercises.primeFactor(34969) == Seq(11, 17))
    }
    'test_sumScalars - {
      assert(Exercises.sumScalars(
        Exercises.Vector2D(0, 0),
        Exercises.Vector2D(1, 1),
        Exercises.Vector2D(2, 2),
        Exercises.Vector2D(0, 0)
      ) == 0)
      assert(Exercises.sumScalars(
        Exercises.Vector2D(1, 1),
        Exercises.Vector2D(-3, -3),
        Exercises.Vector2D(-2, -2),
        Exercises.Vector2D(1, 1)
      ) == -10)
      assert(Exercises.sumScalars(
        Exercises.Vector2D(-1, 5),
        Exercises.Vector2D(2, 3),
        Exercises.Vector2D(3, 3),
        Exercises.Vector2D(2, 1)
      ) == 22)
      assert(Exercises.sumScalars(
        Exercises.Vector2D(5, -4),
        Exercises.Vector2D(2, 1),
        Exercises.Vector2D(0, 3),
        Exercises.Vector2D(7, -1)
      ) == 3)
      assert(Exercises.sumScalars(
        Exercises.Vector2D(2, 3),
        Exercises.Vector2D(3, 2),
        Exercises.Vector2D(4, 5),
        Exercises.Vector2D(5, 4)
      ) == 52)
    }
    'test_sumCosines - {
      assert(Exercises.sumCosines(
        Exercises.Vector2D(0, 1),
        Exercises.Vector2D(1, 0),
        Exercises.Vector2D(-1, 0),
        Exercises.Vector2D(0, -1)
      ) == 0)
      assert(Exercises.sumCosines(
        Exercises.Vector2D(1, 0),
        Exercises.Vector2D(3, 4),
        Exercises.Vector2D(4, 3),
        Exercises.Vector2D(1, 0)
      ) - 1.4 <= 0.1)
      assert(Exercises.sumCosines(
        Exercises.Vector2D(1, 0),
        Exercises.Vector2D(-1, 0),
        Exercises.Vector2D(0, 1),
        Exercises.Vector2D(0, -1)
      ) == -2)
      assert(Exercises.sumCosines(
        Exercises.Vector2D(0, 1),
        Exercises.Vector2D(3, 4),
        Exercises.Vector2D(6, 8),
        Exercises.Vector2D(0, 5)
      ) == 1.6)
    }
    'test_sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(Exercises.balls) == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium",
        "Lead", "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium",
        "Cobalt", "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
    }
  }
}
