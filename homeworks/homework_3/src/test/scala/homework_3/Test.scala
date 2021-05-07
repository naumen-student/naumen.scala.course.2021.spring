package homework_3

import utest._

object Test extends TestSuite{

    val trueStr = "правда"
    val falseStr = "ложь"

    val tests: Tests = Tests{
        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter1(0) == "0")
            assert(Exercises.prettyBooleanFormatter1(2.3) == "2.3")
            assert(Exercises.prettyBooleanFormatter1("Hello") == "Hello")
            assert(Exercises.prettyBooleanFormatter1(List(1, 2, 3)) == "List(1, 2, 3)")
        }

        'prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter1(0) == "0")
            assert(Exercises.prettyBooleanFormatter2(2.3) == "2.3")
            assert(Exercises.prettyBooleanFormatter2("Hello") == "Hello")
            assert(Exercises.prettyBooleanFormatter2(List(1, 2, 3)) == "List(1, 2, 3)")
        }

        'prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter1(0) == "0")
            assert(Exercises.prettyBooleanFormatter3(2.3) == "2.3")
            assert(Exercises.prettyBooleanFormatter3("Hello") == "Hello")
            assert(Exercises.prettyBooleanFormatter3(List(1, 2, 3)) == "List(1, 2, 3)")
        }

        'max1 - {
            intercept[java.lang.UnsupportedOperationException]{Exercises.max1(Seq())}
            assert(Exercises.max1(Seq(-1, -2, -3)) == -1)
            assert(Exercises.max1(Seq(-1, 1, 2, 3, 3)) == 3)
            assert(Exercises.max1(Seq(-1, 5, 2, 3, -3)) == 5)
        }

        'max2 - {
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(-1, -2, -3)) == Seq(-1))
            assert(Exercises.max2(Seq(-1, 1, 2, 3, 3)) == Seq(3))
            assert(Exercises.max2(Seq(-1, 5, 2, 3, -3)) == Seq(5))
        }

        'max3 - {
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(-1, -2, -3)) == Option(-1))
            assert(Exercises.max3(Seq(-1, 1, 2, 3, 3)) == Option(3))
            assert(Exercises.max3(Seq(-1, 5, 2, 3, -3)) == Option(5))
        }

        'sum1 - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(-5, 3) == -2)
            assert(Exercises.sum1(0, 10) == 10)
        }

        'sum2 - {
            assert(Exercises.sum2(1, 2) == 3)
            assert(Exercises.sum2(-5, 3) == -2)
            assert(Exercises.sum2(0, 10) == 10)
        }

        'sum3 - {
            assert(Exercises.sum3(1, 2) == 3)
            assert(Exercises.sum3(-5, 3) == -2)
            assert(Exercises.sum3(0, 10) == 10)
        }
    }
}
