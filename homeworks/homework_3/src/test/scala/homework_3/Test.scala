package homework_3

import utest._

object Test extends TestSuite {

    val tests = Tests {
        'test_booleanFormatter - {
            val trueStr = "правда"
            val falseStr = "ложь"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)

            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)

            assert(Exercises.prettyBooleanFormatter1(5) == "5")
            assert(Exercises.prettyBooleanFormatter2(5) == "5")
            assert(Exercises.prettyBooleanFormatter3(5) == "5")

            assert(Exercises.prettyBooleanFormatter1("true") == "true")
            assert(Exercises.prettyBooleanFormatter2("true") == "true")
            assert(Exercises.prettyBooleanFormatter3("true") == "true")
        }
        'test_max - {
            val seq = Seq(1, 2, 3, 4, 5)

            assert(Exercises.max1(seq) == 5)
            assert(Exercises.max1(Seq()) == Int.MinValue)

            assert(Exercises.max2(seq) == Seq(5))
            assert(Exercises.max2(Seq()) == Seq())

            assert(Exercises.max3(seq) == Some(5))
            assert(Exercises.max3(Seq()) == None)
        }
        'test_sum - {
            assert(Exercises.sum1(2, 5) == 7)
            assert(Exercises.sum2(2, 5) == 7)
            assert(Exercises.sum3(2, 5) == 7)
        }
    }
}
