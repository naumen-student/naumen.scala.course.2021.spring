package homework_3

import utest._

object Test extends TestSuite {

    val tests = Tests {
        'test_prettyBooleanFormatter1 - {
            var trueStr = "правда"
            var falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(123) == "123")
        }
        'test_prettyBooleanFormatter2 - {
            var trueStr = "правда"
            var falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(123) == "123")
        }
        'test_prettyBooleanFormatter3 - {
            var trueStr = "правда"
            var falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(123) == "123")
        }
        'test_max1 - {
            assert(Exercises.max1(List()) == 0)
            assert(Exercises.max1(List(3)) == 3)
            assert(Exercises.max1(List(1, 9, 8)) == 9)
        }
        'test_max2 - {
            assert(Exercises.max2(List()).isEmpty)
            assert(Exercises.max2(List(1)) == List(1))
            assert(Exercises.max2(List(1, 9, 8)) == List(9))
        }
        'test_max3 - {
            assert(Exercises.max3(List()).isEmpty)
            assert(Exercises.max3(List(3)) == Option(3))
            assert(Exercises.max3(List(1, 9, 8)) == Option(9))
        }
        'test_sum1 - {
            assert(Exercises.sum1(10, 0) == 10)
            assert(Exercises.sum1(0, 10) == 10)
            assert(Exercises.sum1(10, 15) == 25)
        }
        'test_sum2 - {
            assert(Exercises.sum2(10, 0) == 10)
            assert(Exercises.sum2(0, 10) == 10)
            assert(Exercises.sum2(10, 15) == 25)
        }
        'test_sum3 - {
            assert(Exercises.sum3(10, 0) == 10)
            assert(Exercises.sum3(0, 10) == 10)
            assert(Exercises.sum3(10, 15) == 25)
        }
    }
}