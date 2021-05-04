import utest._
import Exercises._
object Test extends TestSuite {
  val tests: Tests = Tests {
    Symbol("test_divBy3Or7") {
      assert(divBy3Or7(1, 3) == Seq(3))
      assert(divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
    Symbol("test_sumOfDivBy3Or5") {
      assert(sumOfDivBy3Or5(1, 2) == 0)
      assert(sumOfDivBy3Or5(-3, 3) == 0)
      assert(sumOfDivBy3Or5(0, 10) == 33)
      assert(sumOfDivBy3Or5(-9, -4) == -20)
      assert(sumOfDivBy3Or5(-10, 5) == -25)
    }
    Symbol("test_primeFactor") {
      assert(primeFactor(80) == Seq(2, 5))
      assert(primeFactor(98) == Seq(2, 7))
      assert(primeFactor(1) == Seq())
    }
    Symbol("test_sumScalars") {
      assert(sumScalars(Vector2D(2, 5), Vector2D(3, 2), Vector2D(-2, 15), Vector2D(30, 0.3)) == -39.5)
      assert(sumScalars(Vector2D(1, 0), Vector2D(0, 1), Vector2D(1, 1), Vector2D(0, 0)) == 0)
      assert(sumScalars(Vector2D(-1, 5), Vector2D(2, 3), Vector2D(3, 3), Vector2D(2, 1)) == 22)

    }
    Symbol("test_sumCosines") {
      assert(sumCosines(Vector2D(-5, 3), Vector2D(5, -3), Vector2D(2, 0), Vector2D(-2, 0)) < 1e-9)
      assert(sumCosines(Vector2D(-1, 0), Vector2D(1, 0), Vector2D(0, 1), Vector2D(0, -1)) + 2 < 1e-9)
    }
    Symbol("test_sortByHeavyweight") {
      assert(sortByHeavyweight(Map("MediumBall" -> (3, 12.43), "LargeBall" -> (4, 15.9), "LightBall" -> (2, 5.65))) == Seq[String]("LightBall", "MediumBall", "LargeBall"))
      assert(sortByHeavyweight(balls) == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead",
        "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium",
        "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
    }
  }
}
