import Exercises.{Vector2D, cosBetween, scalar}
import utest._

object Test extends TestSuite {

  val tests = Tests {
    'divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }

    'sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(9, 1) == 0)
      assert(Exercises.sumOfDivBy3Or5(-1, -10) == 0)

      assert(Exercises.sumOfDivBy3Or5(13, 14) == 0)
      assert(Exercises.sumOfDivBy3Or5(-14, -13) == 0)

      assert(Exercises.sumOfDivBy3Or5(3, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(3, 10) == 3 + 5 + 6 + 9 + 10)
      assert(Exercises.sumOfDivBy3Or5(-10, -3) == -3 - 5 - 6 - 9 - 10)
    }

    'primeFactor - {
      assert(Exercises.primeFactor(7) == Seq(7))
      assert(Exercises.primeFactor(13) == Seq(13))

      assert(Exercises.primeFactor(9) == Seq(3))
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(98) == Seq(2, 7))
    }

    'sumScalars - {
      val left1 = Vector2D(6, 8)
      val left2 = Vector2D(5, 3)
      val right1 = Vector2D(1, 2)
      val right2 = Vector2D(3, 7)

      val expected = scalar(left1, left2) + scalar(right1, right2)

      assert(Exercises.sumScalars(left1, left2, right1, right2) == expected)
    }

    'sumCosines - {
      val left1 = Vector2D(6, 8)
      val left2 = Vector2D(5, 3)
      val right1 = Vector2D(1, 2)
      val right2 = Vector2D(3, 7)

      val expected = cosBetween(left1, left2) + cosBetween(right1, right2)

      assert(Exercises.sumCosines(left1, left2, right1, right2) == expected)
    }

    'sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(Map.empty[String, (Int, Double)]) == Seq.empty[String])

      assert(Exercises.sortByHeavyweight(Map("Silver" -> (12, 0.023))) == Seq("Silver"))

      val testMap = Map("Heavy" -> (1, 65.0), "Medium" -> (4, 1.0), "Light" -> (1, 1.0))
      assert(Exercises.sortByHeavyweight(testMap) == Seq("Light", "Medium", "Heavy"))

      assert(Exercises.sortByHeavyweight().head == "Tin")
      assert(Exercises.sortByHeavyweight().last == "Graphite")
    }
  }
}
