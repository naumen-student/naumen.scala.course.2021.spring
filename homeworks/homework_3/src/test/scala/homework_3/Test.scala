package homework_3

import utest._

object Test extends TestSuite{
    val trueStr = "правда"
    val falseStr = "ложь"

    val fullList = List(1, 3, 5, 2, 4)
    val emptyList = List()

    def testFormatterWithTrueBool(formatter: Function[Any, String]): Unit = {
        assert(formatter(true) == trueStr)
    }

    def testFormatterWithFalseBool(formatter: Function[Any, String]): Unit = {
        assert(formatter(false) == falseStr)
    }

    def testFormatterWithInt(formatter: Function[Any, String]): Unit = {
        assert(formatter(42) == "42")
    }

    def testFormatterWithList(formatter: Function[Any, String]): Unit = {
        assert(formatter(List(42, "foo", false)) == "List(42, foo, false)")
    }

    val tests: Tests = Tests {
        'test_formatters - {
            val formatters = List(Exercises.prettyBooleanFormatter1 _, Exercises.prettyBooleanFormatter2 _, Exercises.prettyBooleanFormatter3 _)
            formatters.foreach(formatter => {
                testFormatterWithFalseBool(formatter)
                testFormatterWithTrueBool(formatter)
                testFormatterWithInt(formatter)
                testFormatterWithList(formatter)
            })
        }
        'test_max1_function - {
            assert(Exercises.max1(fullList) == 5)
            intercept[UnsupportedOperationException] { Exercises.max1(Seq())}
        }

        'test_max2_function - {
            assert(Exercises.max2(fullList) == Seq[Int](5))
            assert(Exercises.max2(emptyList) == Seq[Int]())
        }

        'test_max3_function - {
            assert(Exercises.max3(fullList).get == 5)
            assert(Exercises.max3(emptyList).isEmpty)
        }

        'test_sum_functions - {
            val sumFunctions = List(Exercises.sum1 _, Exercises.sum2 _, Exercises.sum3 _)
            sumFunctions.foreach(sumFunction => {
                assert(sumFunction(4, 5) == 9)
                assert(sumFunction(-4, 2) == -2)
                assert(sumFunction(0, 0) == 0)
            })
        }
    }
}
