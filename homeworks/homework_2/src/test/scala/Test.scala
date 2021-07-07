import Exercises._
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(divBy3Or7(1, 3) == Seq(3))
            assert(divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(sumOfDivBy3Or5(2, 10) == 3 + 5 + 6 + 9 + 10)
            assert(sumOfDivBy3Or5(3, 3) == 3)
            assert(sumOfDivBy3Or5(101, 110) == 102 + 105 + 108 + 110)
            assert(sumOfDivBy3Or5(50, 28) == 0)
            assert(sumOfDivBy3Or5(-6, 2) == -6 -5 -3)
        }
        'test_primeFactor - {
            assert(primeFactor(80) == Seq(2, 5))
            assert(primeFactor(98) == Seq(2, 7))
            assert(primeFactor(25289) == Seq(11, 19))
            assert(primeFactor(1) == Seq())
        }
        'test_sumScalars - {
            assert(sumScalars(Vector2D(2, 5), Vector2D(3, 2), Vector2D(-2, 15), Vector2D(30, 0.3)) == 16 + (-55.5))
            assert(sumScalars(Vector2D(1, 0), Vector2D(0, 1), Vector2D(1, 1), Vector2D(0, 0)) == 0 + 0)
            assert(sumScalars(Vector2D(-1, 5), Vector2D(2, 3), Vector2D(3, 3), Vector2D(2, 1)) == 13 + 9)

        }
        'test_sumCosines - {
            assert(sumCosines(Vector2D(1, 2), Vector2D(4, 7), Vector2D(-5, 6), Vector2D(5, 4)) - 0.97846 < 0.001)
            assert(sumCosines(Vector2D(-1, 0), Vector2D(1, 0), Vector2D(0, 1), Vector2D(0, -1)) - (-2) < 0.000001)
        }
        'test_sortByHeavyweight - {
            assert(sortByHeavyweight(Map("MediumBall" -> (3, 12.43), "LargeBall" -> (4, 15.9), "LightBall" -> (2, 5.65))) == Seq[String]("LightBall", "MediumBall", "LargeBall"))
            assert(sortByHeavyweight().indexOf("Sodium") == 0)
            assert(sortByHeavyweight().indexOf("Plutonium") == balls.size - 1)
        }
    }
}
