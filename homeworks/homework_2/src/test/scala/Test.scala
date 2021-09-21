import Exercises.Vector2D
import utest._

object Test extends TestSuite {
    val epsilon = 0.000001
    val tests: Tests = Tests {
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 2) == 0)
            assert(Exercises.sumOfDivBy3Or5(0, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(3, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(0, 10) == 33)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(7) == Seq(7))
            assert(Exercises.primeFactor(1) == Seq())
            assert(Exercises.primeFactor(17) == Seq(17))
            assert(Exercises.primeFactor(4) == Seq(2))
            assert(Exercises.primeFactor(36) == Seq(2, 3))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }

        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(0, 0), Vector2D(1, 1), Vector2D(2, 2), Vector2D(0, 0)) == 0)
            assert(Exercises.sumScalars(Vector2D(1, 1), Vector2D(3, 3), Vector2D(2, 2), Vector2D(1, 1)) == 10)
            assert(Exercises.sumScalars(Vector2D(1, 1), Vector2D(-3, -3), Vector2D(-2, -2), Vector2D(1, 1)) == -10)
            assert(Exercises.sumScalars(Vector2D(0.5, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1.25)) == 3.75)
        }

        'test_sumCosines - {
            assert(Math.abs(Exercises.sumCosines(Vector2D(-1, -1), Vector2D(2, 2), Vector2D(-2, -2), Vector2D(1, 1)) + 2) < epsilon)
            assert(Math.abs(Exercises.sumCosines(Vector2D(1, 1), Vector2D(2, 2), Vector2D(2, 2), Vector2D(1, 1)) - 2) < epsilon)
            assert(Math.abs(Exercises.sumCosines(Vector2D(-1, -1), Vector2D(-2, -2), Vector2D(-2, -2), Vector2D(-1, -1)) - 2) < epsilon)
        }

        'test_sortByHeavyweight - {

            val balls_1: Map[String, (Int, Double)] = {
                Map(
                    "Aluminum" -> (3, 2.6889), "Tungsten" -> (2, 19.35), "Graphite" -> (12, 2.1), "Iron" -> (3, 7.874),
                )
            }
            assert(Exercises.sortByHeavyweight(balls_1) == Seq("Aluminum", "Tungsten", "Iron", "Graphite"))

            val balls_2: Map[String, (Int, Double)] = {
                Map(
                    "Chrome" -> (3, 7.18), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45)
                )
            }
            assert(Exercises.sortByHeavyweight(balls_2) == Seq("Zirconium", "Chrome", "Cesium"))

            val balls_3: Map[String, (Int, Double)] = {
                Map(
                    "Nickel" -> (2, 8.91), "Tin" -> (1, 7.29)
                )
            }
            assert(Exercises.sortByHeavyweight(balls_3) == Seq("Tin", "Nickel"))
        }
    }
}