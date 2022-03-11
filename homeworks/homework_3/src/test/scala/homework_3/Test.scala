package homework_3

import utest._

object Test extends TestSuite{
    val tests = Tests{
        'test_prettyBooleanFormatter - {
            val trueStr = "правда"
            val falseStr = "ложь"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1("abc") == "abc")

            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2("abc") == "abc")

            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3("abc") == "abc")
        }

        'test_max - {
            intercept[java.lang.UnsupportedOperationException]{Exercises.max1(Seq())}
            assert(Exercises.max1(Seq(1)) == 1)
            assert(Exercises.max1(Seq(1, 100)) == 100)

            assert(Exercises.max2(Seq()).isEmpty)
            assert(Exercises.max2(Seq(1)) == Seq(1))
            assert(Exercises.max2(Seq(1, 100)) == Seq(100))

            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(1)).get == 1)
            assert(Exercises.max3(Seq(1, 100)).get == 100)
        }

        'test_sum - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-2, 2) == 0)

            assert(Exercises.sum2(1, 2) == 3)
            assert(Exercises.sum2(0, 0) == 0)
            assert(Exercises.sum2(-2, 2) == 0)

            assert(Exercises.sum3(1, 2) == 3)
            assert(Exercises.sum3(0, 0) == 0)
            assert(Exercises.sum3(-2, 2) == 0)

        }
    }
}
