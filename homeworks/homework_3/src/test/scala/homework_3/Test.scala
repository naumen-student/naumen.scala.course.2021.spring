package homework_3

import utest._

object Test extends TestSuite{

    def testFormatter(formatter: Any => String) {
        assert(formatter(true) == "правда")
        assert(formatter(false) == "ложь")
        assert(formatter(0) == "0")
        assert(formatter(List(1, 2, 3)) == "List(1, 2, 3)")
    }

    def testSum(sum: (Int, Int) => Int) {
        assert(sum(0, 0) == 0)
        assert(sum(0, 1) == 1)
        assert(sum(-1, 1) == 0)
        assert(sum(50, 50) == 100)
    }

    val tests = Tests{
        'test_formatters - {
            testFormatter(Exercises.prettyBooleanFormatter1)
            testFormatter(Exercises.prettyBooleanFormatter2)
            testFormatter(Exercises.prettyBooleanFormatter3)
        }

        'test_max1 - {
            assert(Exercises.max1(Seq()) == -1)
            assert(Exercises.max1(Seq(0)) == 0)
            assert(Exercises.max1(Seq(1, 2)) == 2)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(0)) == Seq(0))
            assert(Exercises.max2(Seq(1, 2)) == Seq(2))
        }
        'test_max3 - {
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(0)).contains(0))
            assert(Exercises.max3(Seq(1, 2)).contains(2))
        }

        'test_sum - {
            testSum(Exercises.sum1)
            testSum(Exercises.sum2)
            testSum(Exercises.sum3)
        }
    }
}
