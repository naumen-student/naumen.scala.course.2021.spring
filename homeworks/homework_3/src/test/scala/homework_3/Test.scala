package homework_3

import utest._

object Test extends TestSuite {
    val trueStr = "правда"
    val falseStr = "ложь"

    def testFormatter_WorksWithTrueBool(formatter: Function[Any, String]): Unit = {
        assert(formatter(true) == trueStr)
    }

    def testFormatter_WorksWithFalseBool(formatter: Function[Any, String]): Unit = {
        assert(formatter(false) == falseStr)
    }

    def testFormatter_WorksWithInt(formatter: Function[Any, String]): Unit = {
        assert(formatter(1) == "1")
    }

    def testFormatter_WorksWithList(formatter: Function[Any, String]): Unit = {
        assert(formatter(List(1, 2.5, true, "abc")) == "List(1, 2.5, true, abc)")
    }

    val tests: Tests = Tests {
        'test_formatters - {
            val formatters = List(Exercises.prettyBooleanFormatter1 _, Exercises.prettyBooleanFormatter2 _, Exercises.prettyBooleanFormatter3 _)
            formatters.foreach(formatter => {
                testFormatter_WorksWithFalseBool(formatter)
                testFormatter_WorksWithTrueBool(formatter)
                testFormatter_WorksWithInt(formatter)
                testFormatter_WorksWithList(formatter)
            })
        }
        'test_max_functions - {
            val fullList = List(1, 3, 5, 2, 4)
            val emptyList = List()

            assert(Exercises.max1(fullList) == 5)
            assert(Exercises.max1(emptyList) == 0)

            assert(Exercises.max2(fullList) == Seq[Int](5))
            assert(Exercises.max2(emptyList) == Seq[Int]())

            assert(Exercises.max3(fullList).get == 5)
            assert(Exercises.max3(emptyList).isEmpty)
        }

        'test_sum_functions - {
            val sumFunctions = List(Exercises.sum1 _, Exercises.sum2 _, Exercises.sum3 _)
            sumFunctions.foreach(sumFunction => {
                assert(sumFunction(1, 2) == 3)
                assert(sumFunction(-2, 2) == 0)
                assert(sumFunction(0, 0) == 0)
            })
        }

    }
}
