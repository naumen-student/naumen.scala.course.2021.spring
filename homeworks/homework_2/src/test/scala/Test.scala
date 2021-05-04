import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
            assert(Exercises.sumOfDivBy3Or5(99, 100) == 199)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(4) == Seq(2))
            assert(Exercises.primeFactor(18) == Seq(2, 3))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }

        'test_sumByFunc - {
            assert(Exercises.sumScalars(Vector2D(1,1), Vector2D(1,1), Vector2D(2,2), Vector2D(2,2)) == 10)
            assert(Exercises.sumScalars(Vector2D(3,7), Vector2D(-5,-2), Vector2D(6,2), Vector2D(-8,-1)) == -79)

            assert(Exercises.sumCosines(Vector2D(1,1), Vector2D(1,1), Vector2D(2,2), Vector2D(2,2)) - 1.9 <= 0.1)
            assert(Exercises.sumCosines(Vector2D(3,7), Vector2D(-5,-2), Vector2D(6,14), Vector2D(5,2)) == 0)
        }

        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map("Iron" -> (10, 1), "Cotton" -> (10, 0.5), "Gold" -> (10, 1.5))) == Seq("Cotton", "Iron", "Gold"))
        }
    }
}
