import utest._
import Exercises.Vector2D

object Test extends TestSuite{

    val vector1 = Vector2D(1, 1)
    val vector2 = Vector2D(2, 2)
    val vector3 = Vector2D(-1, -2)
    val vector4 = Vector2D(-2, 0)
    val vector5 = Vector2D(1, 0)
    val vector6 = Vector2D(0, 1)
    val vector7 = Vector2D(1, 1)

    val ballsMap1 = Map("Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874))
    val ballsMap2 = Map( "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90))

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
            assert(Exercises.sumOfDivBy3Or5(2, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(1, 20) == 98)
            assert(Exercises.sumOfDivBy3Or5(99, 100) == 199)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(83006) == Seq(2, 7, 11))
        }
        'test_sumScalars - {
            assert((Exercises.sumScalars(vector1, vector2, vector3, vector4)) == 6)
            assert((Exercises.sumScalars(vector1, vector2, vector1, vector2)) == 8)
            assert((Exercises.sumScalars(vector3, vector3, vector4, vector4)) == 9)
        }
        'test_sumCosines - {
            assert((Exercises.sumCosines(vector5, vector6, vector5, vector6)) == 0)
            assert((Exercises.sumCosines(vector5, vector5, vector5, vector6)) == 1)
            assert((Exercises.sumCosines(vector6, vector6, vector6, vector6)) == 2)
        }
        'test_sortByHeavyweight - {
            assert((Exercises.sortByHeavyweight(ballsMap1)) == Seq("Aluminum", "Tungsten", "Iron", "Graphite"))
            assert((Exercises.sortByHeavyweight(ballsMap2)) == Seq("Gold", "Cobalt", "Calcium", "Potassium"))
        }
    }
}
