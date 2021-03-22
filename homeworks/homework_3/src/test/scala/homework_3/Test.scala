package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'boolean_formatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(15) == "15")

            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(15) == "15")

            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(15) == "15")
        }

        'max - {
            assert(Exercises.max1(Seq(1, 10, 3)) == 10)
            assert(Exercises.max1(Seq(1)) == 1)
            assert(Exercises.max1(Seq()) == 0)

            assert(Exercises.max2(Seq(1, 10, 3)) == Seq(10))
            assert(Exercises.max2(Seq(1)) == Seq(1))
            assert(Exercises.max2(Seq()) == Seq())

            assert(Exercises.max3(Seq(1, 10, 3)) == Some(10))
            assert(Exercises.max3(Seq(1)) == Some(1))
            assert(Exercises.max3(Seq()) == None)
        }


        'sum - {
            assert(Exercises.sum1(1, 6) == 7)
            assert(Exercises.sum1(0, 20) == 20)
            assert(Exercises.sum1(-4, 9) == 5)

            assert(Exercises.sum2(1, 6) == 7)
            assert(Exercises.sum2(0, 20) == 20)
            assert(Exercises.sum2(-4, 9) == 5)

            assert(Exercises.sum3(1, 6) == 7)
            assert(Exercises.sum3(0, 20) == 20)
            assert(Exercises.sum3(-4, 9) == 5)
        }
    }
}
