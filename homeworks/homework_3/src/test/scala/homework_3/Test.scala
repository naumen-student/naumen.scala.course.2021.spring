package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        val trueStr = "правда"
        val falseStr = "ложь"
        val testStr = "тест"
        val emptyList = List()

        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(testStr) == testStr)
            assert(Exercises.prettyBooleanFormatter1(emptyList) == "List()")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(testStr) == testStr)
            assert(Exercises.prettyBooleanFormatter2(emptyList) == "List()")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(testStr) == testStr)
            assert(Exercises.prettyBooleanFormatter3(emptyList) == "List()")
        }

        'test_max1 - {
            assert(Exercises.max1(emptyList) == -1)
            assert(Exercises.max1(List(1,2,3)) == 3)
            assert(Exercises.max1(List(8,9,9,9,9,8)) == 9)
        }

        'test_max2 - {
            assert(Exercises.max2(emptyList) == List())
            assert(Exercises.max2(List(1,2,3)) == List(3))
            assert(Exercises.max2(List(8,9,9,9,9,8)) == List(9))
        }

        'test_max3 - {
            assert(Exercises.max3(emptyList).isEmpty)
            assert(Exercises.max3(List(1, 2, 3)) == Option(3))
            assert(Exercises.max3(List(8,9,9,9,9,8)) == Option(9))
        }

        'test_sum1 - {
            assert(Exercises.sum1(1,2) == 3)
            assert(Exercises.sum1(5, -5) == 0)
            assert(Exercises.sum1(8,9) == 17)
        }

        'test_sum2 - {
            assert(Exercises.sum2(1,2) == 3)
            assert(Exercises.sum2(5, -5) == 0)
            assert(Exercises.sum2(8,9) == 17)
        }

        'test_sum3 - {
            assert(Exercises.sum3(1,2) == 3)
            assert(Exercises.sum3(5, -5) == 0)
            assert(Exercises.sum3(8,9) == 17)
        }
    }
}
