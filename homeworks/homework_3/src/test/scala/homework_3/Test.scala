package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter - {
            val trueStr = "правда"
            val falseStr = "ложь"
            val intStr = "1"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(1) == intStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(1) == intStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(1) == intStr)
        }
        'test_max1 - {
            val first = 0
            val second = 1
            val empty = -1
            assert(Exercises.max1(Seq()) == empty)
            assert(Exercises.max1(Seq(1,2)) == second)
            assert(Exercises.max1(Seq(-1)) == first)
        }
        'test_max2 - {
            val first = Seq(-1)
            val second = Seq(2)
            val empty = Seq()
            assert(Exercises.max2(Seq()) == empty)
            assert(Exercises.max2(Seq(1,2)) == second)
            assert(Exercises.max2(Seq(-1)) == first)
        }
        'test_max3 - {
            val first = Some(-1)
            val second = Some(2)
            val empty = None
            assert(Exercises.max3(Seq()) == empty)
            assert(Exercises.max3(Seq(1,2)) == second)
            assert(Exercises.max3(Seq(-1)) == first)
        }
        'test_sums - {
            val empty = 0
            val first = 1
            val second = 10
            assert(Exercises.sum1(-1,1) == empty)
            assert(Exercises.sum1(5,-4) == first)
            assert(Exercises.sum1(10,0) == second)
            assert(Exercises.sum2(-1,1) == empty)
            assert(Exercises.sum2(5,-4) == first)
            assert(Exercises.sum2(10,0) == second)
            assert(Exercises.sum3(-1,1) == empty)
            assert(Exercises.sum3(5,-4) == first)
            assert(Exercises.sum3(10,0) == second)
        }
    }
}
