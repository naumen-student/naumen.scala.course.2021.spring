import utest._
import java.lang.Math.abs
import java.lang.Math.sqrt

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(5, 15) == 57)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(8) == Seq(2))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(101) == Seq(101))
            assert(Exercises.primeFactor(3) == Seq(3))
        }

        'test_vectors - {
            val v1 = Exercises.Vector2D(5, -4)
            val v2 = Exercises.Vector2D(2, 1)
            val v3 = Exercises.Vector2D(0, 3)
            val v4 = Exercises.Vector2D(7, -1)

            assert(abs(Exercises.sumScalars(v1, v2, v3, v4) - 3.0) < 1e-5)
            assert(abs(Exercises.sumScalars(v1, v3, v2, v4) - 1.0) < 1e-5)
            assert(abs(Exercises.sumScalars(v1, v4, v2, v3) - 42.0) < 1e-5)

            val sumCos1 = (6 * sqrt(10) - sqrt(41)) / (5 * sqrt(82))
            val sumCos2 = (13 * sqrt(41) - 20 * sqrt(10)) / (5 * sqrt(410))
            val sumCos3 = (39 + sqrt(410)) / (5 * sqrt(82))

            assert(abs(Exercises.sumCosines(v1, v2, v3, v4) - sumCos1) < 1e-5)
            assert(abs(Exercises.sumCosines(v1, v3, v2, v4) - sumCos2) < 1e-5)
            assert(abs(Exercises.sumCosines(v1, v4, v2, v3) - sumCos3) < 1e-5)
        }
    }
}
