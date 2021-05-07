package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter - {
            def formatterTest (testFunc: Any => String) : Unit = {
                assert(testFunc(true) == "правда")
                assert(testFunc(false) == "ложь")
                assert(testFunc(2) == "2")
                assert(testFunc("строка") == "строка")
                assert(testFunc(List(2)) == "List(2)")
            }

            'test_prettyBooleanFormatter1 - {
                formatterTest(Exercises.prettyBooleanFormatter1)
            }
            'test_prettyBooleanFormatter2 - {
                formatterTest(Exercises.prettyBooleanFormatter2)
            }
            'test_prettyBooleanFormatter2 - {
                formatterTest(Exercises.prettyBooleanFormatter2)
            }
        }

        'test_max - {
            'test_max1 - {
                assert(Exercises.max1(Seq()) == Int.MinValue)
                assert(Exercises.max1(Seq(2)) == 2)
                assert(Exercises.max1(Seq(-3, -1, -1)) == -1)
            }
            'test_max2 - {
                assert(Exercises.max2(Seq()) == Seq())
                assert(Exercises.max2(Seq(2)) == Seq(2))
                assert(Exercises.max2(Seq(-3, -1, -1)) == Seq(-1))
            }
            'test_max3 - {
                assert(Exercises.max3(Seq()).isEmpty)
                assert(Exercises.max3(Seq(2)).contains(2))
                assert(Exercises.max3(Seq(-3, -1, -1)).contains(-1))
            }
        }

        'test_sum - {
            def sumTest (testFunc: (Int, Int) => Int) : Unit = {
                assert(testFunc(2, 3) == 5)
                assert(testFunc(-5, 5) == 0)
                assert(testFunc(-5, 0) == -5)
            }

            'test_sum1 - {
                sumTest(Exercises.sum1)
            }
            'test_sum2 - {
                sumTest(Exercises.sum2)
            }
            'test_sum2 - {
                sumTest(Exercises.sum2)
            }
        }
    }
}
