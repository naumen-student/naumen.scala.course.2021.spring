package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)

            assert(Exercises.prettyBooleanFormatter1(3) == "3")
            assert(Exercises.prettyBooleanFormatter1(List(1, 3, 4)) == "List(1, 3, 4)")
            assert(Exercises.prettyBooleanFormatter1("test") == "test")
            assert(Exercises.prettyBooleanFormatter1(None) == "None")

            assert(Exercises.prettyBooleanFormatter2(3) == "3")
            assert(Exercises.prettyBooleanFormatter2(List(1, 3, 4)) == "List(1, 3, 4)")
            assert(Exercises.prettyBooleanFormatter2("test") == "test")
            assert(Exercises.prettyBooleanFormatter2(None) == "None")

            assert(Exercises.prettyBooleanFormatter3(3) == "3")
            assert(Exercises.prettyBooleanFormatter3(List(1, 3, 4)) == "List(1, 3, 4)")
            assert(Exercises.prettyBooleanFormatter3("test") == "test")
            assert(Exercises.prettyBooleanFormatter3(None) == "None")
        }
        'test_max - {
            assert(Exercises.max1(Seq()) == Int.MinValue)
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max3(Seq()) == None)

            assert(Exercises.max1(Seq(5, 32, 4, 102, -23, 43)) == 102)
            assert(Exercises.max2(Seq(5, 32, 4, 102, -23, 43)) == Seq(102))
            assert(Exercises.max3(Seq(5, 32, 4, 102, -23, 43)) == Some(102))

            assert(Exercises.max1(Seq(11, 11, 11, 11)) == 11)
            assert(Exercises.max2(Seq(11, 11, 11, 11)) == Seq(11))
            assert(Exercises.max3(Seq(11, 11, 11, 11)) == Some(11))
        }
        'test_sum - {
            assert(Exercises.sum1(1, 3) == 4)
            assert(Exercises.sum2(-23, 100) == 77)
            assert(Exercises.sum3(14, 32) == 46)
        }

    }
}
