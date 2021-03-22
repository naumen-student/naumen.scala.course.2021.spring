package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'bool_formatter - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(100) == "100")

            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(100) == "100")

            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(100) == "100")
        }

        'max - {
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)
            assert(Exercises.max1(Seq(3)) == 3)
            assert(Exercises.max1(Seq()) == Int.MinValue)

            assert(Exercises.max2(Seq(1, 2, 3)) == Seq(3))
            assert(Exercises.max2(Seq(3)) == Seq(3))
            assert(Exercises.max2(Seq()) == Seq())

            assert(Exercises.max3(Seq(1, 2, 3)) == Option(3))
            assert(Exercises.max3(Seq(3)) == Option(3))
            assert(Exercises.max3(Seq()) == None)
        }


        'sum - {
            assert(Exercises.sum1(1, 3) == 4)
            assert(Exercises.sum1(-1, 2) == 1)
            assert(Exercises.sum1(0, 5) == 5)

            assert(Exercises.sum2(1, 3) == 4)
            assert(Exercises.sum2(-1, 2) == 1)
            assert(Exercises.sum2(0, 5) == 5)

            assert(Exercises.sum3(1, 3) == 4)
            assert(Exercises.sum3(-1, 2) == 1)
            assert(Exercises.sum3(0, 5) == 5)
        }
    }
}