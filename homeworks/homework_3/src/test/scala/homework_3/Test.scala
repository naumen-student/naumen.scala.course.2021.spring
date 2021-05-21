package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'prettyBooleanFormatter1_test - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(0) == "0")
            assert(Exercises.prettyBooleanFormatter1(List(1, 2)) == "List(1, 2)")
        }
        'prettyBooleanFormatter2_test - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(0) == "0")
            assert(Exercises.prettyBooleanFormatter2(List(1, 2)) == "List(1, 2)")
        }
        'prettyBooleanFormatter3_test - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(0) == "0")
            assert(Exercises.prettyBooleanFormatter3(List(1, 2)) == "List(1, 2)")
        }
        'max1_test - {
            assert(Exercises.max1(Seq(3, 4, 5, 2, 1)) == 5)
            assert(Exercises.max1(Seq()) == Int.MinValue)
            assert(Exercises.max1(Seq(-1, -2, -3, -4, -5)) == -1)
        }
        'max2_test - {
            assert(Exercises.max2(Seq(3, 4, 5, 2, 1)) == Seq(5))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(-1, -2, -3, -4, -5)) == Seq(-1))
        }
        'max3_test - {
            assert(Exercises.max3(Seq(3, 4, 5, 2, 1)) == Option(5))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(-1, -2, -3, -4, -5)) == Option(-1))
        }
        'sum1_test - {
            assert(Exercises.sum1(10, 2) == 12)
            assert(Exercises.sum1(10, -2) == 8)
            assert(Exercises.sum1(-10, -2) == -12)
        }
        'sum2_test - {
            assert(Exercises.sum2(10, 2) == 12)
            assert(Exercises.sum2(10, -2) == 8)
            assert(Exercises.sum2(-10, -2) == -12)
        }
        'sum3_test - {
            assert(Exercises.sum3(10, 2) == 12)
            assert(Exercises.sum3(10, -2) == 8)
            assert(Exercises.sum3(-10, -2) == -12)
        }
    }
}
