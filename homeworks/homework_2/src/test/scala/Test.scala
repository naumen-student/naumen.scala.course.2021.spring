import Exercises.Vector2D
import utest._

import scala.math.abs

object Test extends TestSuite{
    private val EPS: Double = 10e-5

    private def test_case_divBy3Or7(iFrom: Int, iTo: Int, result: Seq[Int]): Unit = {
        assert(Exercises.divBy3Or7(iFrom, iTo) == result)
    }

    private def test_case_sumOfDivBy3Or5(iFrom: Int, iTo: Int, result: Int): Unit = {
        assert(Exercises.sumOfDivBy3Or5(iFrom, iTo) == result)
    }

    private def test_case_sortByHeavyweight(ballsArray: Map[String, (Int, Double)], result: Seq[String]): Unit = {
        assert(Exercises.sortByHeavyweight(ballsArray) == result)
    }

    private def test_case_primeFactor(number: Int, result: Seq[Int]): Unit = {
        assert(Exercises.primeFactor(number) == result)
    }

    private def test_case_sumScalars(leftVec0: Vector2D, leftVec1: Vector2D,
                                     rightVec0: Vector2D, rightVec1: Vector2D, result: Double): Unit = {
        assert(math.abs(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) - result) < EPS)
    }

    private def test_case_sumCosines(leftVec0: Vector2D, leftVec1: Vector2D,
                                     rightVec0: Vector2D, rightVec1: Vector2D, result: Double): Unit = {
        val actualResult = Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1)
        assert((actualResult.isNaN && result.isNaN) ||  abs(actualResult - result) < EPS)
    }


    val tests = Tests{
        'test_divBy3Or7 - {
            test_case_divBy3Or7(1, 3, Seq(3))
            test_case_divBy3Or7(5, 9, Seq(6, 7, 9))
            test_case_divBy3Or7(0, 100,
                Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33,
                    35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66,
                    69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99)
                )
        }
        'test_sumOfDivBy3Or5 - {
            test_case_sumOfDivBy3Or5(10, 1, 0)
            test_case_sumOfDivBy3Or5(0, 0, 0)
            test_case_sumOfDivBy3Or5(1, 2, 0)
            test_case_sumOfDivBy3Or5(1, 3, 3)
            test_case_sumOfDivBy3Or5(3, 5, 8)
            test_case_sumOfDivBy3Or5(3, 15, 60)
        }
        'test_primeFactor - {
            test_case_primeFactor(80, Seq(2, 5))
            test_case_primeFactor(98, Seq(2, 7))
            test_case_primeFactor(1, Seq())
            test_case_primeFactor(3, Seq(3))
            test_case_primeFactor(42, Seq(2, 3, 7))
        }
        'test_Vector2D_sumScalars - {
            test_case_sumScalars(Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), 4)
            test_case_sumScalars(Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0), 0)
            test_case_sumScalars(Vector2D(2, 1), Vector2D(1, 3), Vector2D(1, 1), Vector2D(1, 1), 7)
            test_case_sumScalars(Vector2D(1, 1), Vector2D(1, 1), Vector2D(2, 1), Vector2D(1, 3), 7)

        }
        'test_Vector2D_sumCosines - {
            test_case_sumCosines(Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), 2)
            test_case_sumCosines(Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0), Double.NaN)
            test_case_sumCosines(Vector2D(2, 1), Vector2D(1, 3), Vector2D(1, 1), Vector2D(1, 1), 1.7071)
            test_case_sumCosines(Vector2D(1, 1), Vector2D(1, 1), Vector2D(2, 1), Vector2D(1, 3), 1.7071)
        }
        'test_sortByHeavyweight - {
            test_case_sortByHeavyweight(Map("A" -> (1, 2)), Seq("A"))
            test_case_sortByHeavyweight(Map("A" -> (1, 1), "B" -> (2, 2)), Seq("A", "B"))
            test_case_sortByHeavyweight(Map(), Seq())
            test_case_sortByHeavyweight(Map("A" -> (2, 1),"B" -> (1, 2)), Seq("B", "A"))
        }
    }
}
