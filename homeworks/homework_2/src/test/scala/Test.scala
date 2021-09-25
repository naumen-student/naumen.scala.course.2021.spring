import utest._

object Test extends TestSuite {

  val tests: Tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }

    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(0, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(0, 5) == 8)
      assert(Exercises.sumOfDivBy3Or5(0, 25) == 168)
    }

    'test_primeFactor - {
      assert(Exercises.primeFactor(80).equals(Seq(2, 5)))
      assert(Exercises.primeFactor(98).equals(Seq(2, 7)))
    }

    'test_sumScalars - {
      val vector1 = Exercises.Vector2D(2, 0)
      val vector2 = Exercises.Vector2D(0, 2)
      assert(Exercises.sumScalars(vector1, vector2, vector2, vector1) == 0)
    }

    'test_sumCosines - {
      val vector1 = Exercises.Vector2D(2, 0)
      val vector2 = Exercises.Vector2D(0, 2)
      assert(Exercises.sumCosines(vector2, vector1, vector2, vector2) == 1)
    }

    'test_sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(Exercises.balls)
        .equals(Seq("Graphite",
          "Potassium",
          "Magnesium",
          "Lithium",
          "Calcium",
          "Cesium",
          "Cobalt",
          "Plutonium",
          "Silver",
          "Copper",
          "Iron",
          "Chrome",
          "Zirconium",
          "Tungsten",
          "Gold",
          "Uranium",
          "Sodium",
          "Lead",
          "Titanium",
          "Aluminum",
          "Nickel",
          "Platinum",
          "Tin")))
    }
  }
}
