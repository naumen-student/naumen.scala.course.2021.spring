package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        'test_booleanFormatters - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(2) == "2")
            assert(Exercises.prettyBooleanFormatter2(2.5f) == "2.5")
            assert(Exercises.prettyBooleanFormatter3('c') == "c")

        }
        'test_maxIntInCollection - {
            assert(Exercises.max1(Seq(1, 2, 3, 5)) == 5)
            assert(Exercises.max1(Seq()) == 0)
            assert(Exercises.max2(Seq(10, 29, 49)) == Seq(49))
            assert(Exercises.max2(Seq()) == Seq())

            assert(Exercises.max3(Seq(28, 12, 2)) match {
                case Some(28) => true
                case _ => false
            })

            assert(Exercises.max3(Seq()) match {
                case None => true
                case _ => false
            })
        }

        'test_sumIntegers - {
            assert(Exercises.sum1(10, 20) == 30)
            assert(Exercises.sum2(-10, 20) == 10)
            assert(Exercises.sum3(10, 0) == 10)
        }
    }
}
