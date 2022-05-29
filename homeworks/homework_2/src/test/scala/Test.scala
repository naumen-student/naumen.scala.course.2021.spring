import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(0, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(4, 19) == 75)
        }

        'primeFactor - {
            assert(Exercises.primeFactor(4) == Seq(2))
            assert(Exercises.primeFactor(28) == Seq(2,7))
            assert(Exercises.primeFactor(175993) == Seq(175993))
        }

        'sumByFunc - {
            val a = Vector2D(3, 3)
            val b = Vector2D(4, 4)
            val c = Vector2D(1, 3)
            val d = Vector2D(3, 1)
            assert(Exercises.sumScalars(a, b, a, b) == 48)
            assert(Exercises.sumCosines(c, d, c, d) == 1.2)
            assert(Exercises.sumScalars(a, b, c, d) == 30)
        }

        'sortByHeavyweight - {
            val balls_1: Map[String, (Int, Double)] =
                Map(
                    "red" -> (1,   2.54), "blue" -> (1,   2.54)
                )

            val balls_2: Map[String, (Int, Double)] =
                Map(
                    "a" -> (1,   2), "nice" ->  (2,   3), "day" ->  (3,  4),   "have" ->      (1,  1),
                )

            val balls_3: Map[String, (Int, Double)] =
                Map(
                    "white" -> (1,   0.2), "pink" ->  (2,   0.03), "blue" ->  (3,  0.04),   "red" ->      (33,  1),
                )

            assert(Exercises.sortByHeavyweight(balls_1) == Seq("red","blue"))
            assert(Exercises.sortByHeavyweight(balls_2) == Seq("have", "a", "nice", "day"))
            assert(Exercises.sortByHeavyweight(balls_3) == Seq("white", "pink", "blue", "red"))
        }
    }
}
