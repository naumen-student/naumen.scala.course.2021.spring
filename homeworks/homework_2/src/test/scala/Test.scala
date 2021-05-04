import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        };
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
            assert(Exercises.sumOfDivBy3Or5(3, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 5) == 5)
            assert(Exercises.sumOfDivBy3Or5(15, 15) == 15)
            assert(Exercises.sumOfDivBy3Or5(4, 20) == 95)
        };
        'test_primeFactor - {
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(1) == Seq())
            assert(Exercises.primeFactor(882) == Seq(2, 3, 7))
            assert(Exercises.primeFactor(16) == Seq(2))
            assert(Exercises.primeFactor(-2) == Seq(2))
            assert(Exercises.primeFactor(0) == Seq())
        };
        'test_sumScalars - {
            val emptyVector = Exercises.Vector2D(0, 0)
            val vectorX1 = Exercises.Vector2D(4, 0)
            val vectorX2 = Exercises.Vector2D(8, 0)
            val vectorY1 = Exercises.Vector2D(0, 1)
            val vectorY2 = Exercises.Vector2D(0, 2)
            assert(Exercises.sumScalars(emptyVector, emptyVector, vectorX1, vectorX2) ==
              Exercises.scalar(vectorX1, vectorX2))
            assert(Exercises.sumScalars(vectorX1, vectorX2, emptyVector, emptyVector) ==
              Exercises.scalar(vectorX1, vectorX2))
            assert(Exercises.sumScalars(vectorX1, vectorX2, vectorY1, vectorY2) ==
              Exercises.scalar(vectorX1, vectorX2) + Exercises.scalar(vectorY1, vectorY2))
        }
        'test_sumCosines - {
            val vectorX = Exercises.Vector2D(1, 0)
            val vectorY = Exercises.Vector2D(0, 1)
            val vector1 = Exercises.Vector2D(1, 1)
            val vector2 = Exercises.Vector2D(2, 1)
            assert(Exercises.sumCosines(vector1, vector2, vectorY, vectorX) == Exercises.cosBetween(vector1, vector2))
            assert(Exercises.sumCosines(vectorX, vectorY, vector1, vector2) == Exercises.cosBetween(vector1, vector2))
            assert(Exercises.sumCosines(vectorX, vectorY, vector1, vectorX) ==
              Exercises.cosBetween(vectorX, vectorY) + Exercises.cosBetween(vector1, vectorX))
        }
        'test_sortByHeavyWeight - {
            assert(Exercises.sortByHeavyweight(Map("1"-> (1, 1))) == Seq("1"))
            assert(Exercises.sortByHeavyweight(Map("1"->(2, 2), "2"->(1, 1))) == Seq("2", "1"))
            assert(Exercises.sortByHeavyweight(Map("1"->(2, 1), "2"->(1, 7.9))) == Seq("2", "1"))
            assert(Exercises.sortByHeavyweight(Map("1"->(1, 8.1), "2"->(2, 1))) == Seq("2", "1"))
            assert(Exercises.sortByHeavyweight(Map("1"->(1, 8), "2"->(1, 1), "3"->(1, 4))) == Seq("2", "3", "1"))
        }
    }
}
