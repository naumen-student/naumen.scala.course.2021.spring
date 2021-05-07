package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(123) == "123")
            assert(Exercises.prettyBooleanFormatter1(1.0) == "1.0")
            assert(Exercises.prettyBooleanFormatter1(1 + 1) == "2")
        }
        'test_prettyBooleanFormatter2- {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(123) == "123")
            assert(Exercises.prettyBooleanFormatter2(1.0) == "1.0")
            assert(Exercises.prettyBooleanFormatter2(1 + 1) == "2")
        }
        'test_prettyBooleanFormatter3- {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(123) == "123")
            assert(Exercises.prettyBooleanFormatter3(1.0) == "1.0")
            assert(Exercises.prettyBooleanFormatter3(1 + 1) == "2")
        }
        'test_max1 - {
            assert(Exercises.max1(Seq()) == Int.MinValue)
            assert(Exercises.max1(Seq(2, 5, 1)) == 5)
            assert(Exercises.max1(Seq(-2, -5, 1)) == 1)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq()) == Seq.empty)
            assert(Exercises.max2(Seq(2, 5, 1)) == Seq(5))
            assert(Exercises.max2(Seq(-2, -5, 1)) == Seq(1))
        }
        'test_max3 - {
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(2, 5, 1)).contains(5))
            assert(Exercises.max3(Seq(-2, -5, 1)).contains(1))
        }
        'test_sum1 - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(0, -3) == -3)
            assert(Exercises.sum1(-5, 10) == 5)
        }
        'test_sum2 - {
            assert(Exercises.sum2(1, 2) == 3)
            assert(Exercises.sum2(0, -3) == -3)
            assert(Exercises.sum2(-5, 10) == 5)
        }
        'test_sum3 - {
            assert(Exercises.sum3(1, 2) == 3)
            assert(Exercises.sum3(0, -3) == -3)
            assert(Exercises.sum3(-5, 10) == 5)
        }
    }
}
