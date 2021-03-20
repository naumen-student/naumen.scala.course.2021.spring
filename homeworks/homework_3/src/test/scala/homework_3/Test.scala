package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_boolean_formatter - {
            val trueStr = "правда"
            val falseStr = "ложь"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)

            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)

            assert(Exercises.prettyBooleanFormatter1(0) == "0")
            assert(Exercises.prettyBooleanFormatter2(0) == "0")
            assert(Exercises.prettyBooleanFormatter3(0) == "0")
        }

        'test_max - {
            assert(Exercises.max1(Seq()) == Int.MinValue)
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max3(Seq()) == None)

            assert(Exercises.max1(Seq(1, 2, -5, 100)) == 100)
            assert(Exercises.max2(Seq(1, 2, -5, 100)) == Seq(100))
            assert(Exercises.max3(Seq(1, 2, -5, 100)) == Some(100))
        }

        'test_sum - {
            assert(Exercises.sum1(-100, 100) == 0)
            assert(Exercises.sum2(-100, 100) == 0)
            assert(Exercises.sum3(-100, 100) == 0)

            assert(Exercises.sum1(1, 1) == 2)
            assert(Exercises.sum2(1, 1) == 2)
            assert(Exercises.sum3(1, 1) == 2)
        }
    }
}
