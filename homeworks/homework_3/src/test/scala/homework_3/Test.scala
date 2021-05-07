package homework_3

import utest._

object Test extends TestSuite{

    val t = "правда"
    val f = "ложь"

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == t)
            assert(Exercises.prettyBooleanFormatter1(false) == f)
            assert(Exercises.prettyBooleanFormatter1("true") == "true")
            assert(Exercises.prettyBooleanFormatter1(1234) == "1234")
        }
        'prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == t)
            assert(Exercises.prettyBooleanFormatter2(false) == f)
            assert(Exercises.prettyBooleanFormatter2("true") == "true")
            assert(Exercises.prettyBooleanFormatter2(1234) == "1234")
        }
        'prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == t)
            assert(Exercises.prettyBooleanFormatter3(false) == f)
            assert(Exercises.prettyBooleanFormatter3("true") == "true")
            assert(Exercises.prettyBooleanFormatter3(1234) == "1234")
        }
        'max1 - {
            intercept[IllegalArgumentException] {
                Exercises.max1(Seq())
            }
            assert(Exercises.max1(Seq(1,5)) == 5)
            assert(Exercises.max1(Seq(0,-12,-666)) == 0)
            assert(Exercises.max1(Seq(-2123)) == -2123)
        }
        'max2 - {
            assert(Exercises.max2(Seq(1,5)) == Seq(5))
            assert(Exercises.max2(Seq(0,-12,-666)) == Seq(0))
            assert(Exercises.max2(Seq(-2123)) == Seq(-2123))
            assert(Exercises.max2(Seq()) == Seq())
        }
        'max3 - {
            assert(Exercises.max3(Seq(1,5)) == Option(5))
            assert(Exercises.max3(Seq(0,-12,-666)) == Option(0))
            assert(Exercises.max3(Seq(-2123)) == Option(-2123))
            assert(Exercises.max3(Seq()).isEmpty)
        }
        'sum1 - {
            assert(Exercises.sum1(1,5) == 6)
            assert(Exercises.sum1(0,-666) == -666)
            assert(Exercises.sum1(0,0) == 0)
        }
        'sum2 - {
            assert(Exercises.sum2(1,5) == 6)
            assert(Exercises.sum2(0,-666) == -666)
            assert(Exercises.sum2(0,0) == 0)
        }
        'sum3 - {
            assert(Exercises.sum3(1,5) == 6)
            assert(Exercises.sum3(0,-666) == -666)
            assert(Exercises.sum3(0,0) == 0)
        }
    }
}
