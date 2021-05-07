package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        def testPrettyBooleanFormatter(formatter: (Any) => String): Unit = {
            testPrettyBooleanFormatterOnTrueCase(formatter)
            testPrettyBooleanFormatterOnFalseCase(formatter)
            testPrettyBooleanFormatterOnNotBooleanCase(formatter)
        }

        def testPrettyBooleanFormatterOnTrueCase(formatter: (Any) => String): Unit = {
            val trueStr = "правда"
            assert(formatter(true) == trueStr)
        }

        def testPrettyBooleanFormatterOnFalseCase(formatter: (Any) => String): Unit = {
            val falseStr = "ложь"
            assert(formatter(false) == falseStr)
        }

        def testPrettyBooleanFormatterOnNotBooleanCase(formatter: (Any) => String): Unit = {
            assert(formatter(2) == 2.toString)
        }

        def testSum(sum: (Int, Int) => Int, x: Int, y: Int): Unit = {
            assert(sum(x, y) == x + y)
        }

        'test_prettyBooleanFormatter1 - {
            testPrettyBooleanFormatter(Exercises.prettyBooleanFormatter1)
        }

        'test_prettyBooleanFormatter2 - {
            testPrettyBooleanFormatter(Exercises.prettyBooleanFormatter2)
        }

        'test_prettyBooleanFormatter3 - {
            testPrettyBooleanFormatter(Exercises.prettyBooleanFormatter3)
        }

        'test_max1ShouldThrowExceptionOnEmptySeq - {
            intercept[UnsupportedOperationException] { Exercises.max1(Seq())}
        }

        'test_max1ShouldReturnMaxNumberInNotEmptySeq - {
            assert(Exercises.max1(Seq(1, 2, -1)) == 2)
        }

        'test_max2ShouldReturnEmptySeqOnEmptySeq - {
            assert(Exercises.max2(Seq()) == Seq())
        }

        'test_max2ShouldReturnSeqWithMaxNumberInNotEmptySeq - {
            assert(Exercises.max2(Seq(1, 2, -1)) == Seq(2))
        }

        'test_max3ShouldReturnNoneOnEmptySeq - {
            assert(Exercises.max3(Seq()).isEmpty)
        }

        'test_max3ShouldReturnSomeWithMaxNumberInNotEmptySeq - {
            assert(Exercises.max3(Seq(1, 2, -1)).contains(2))
        }

        'test_sum1ShouldReturnSumOfNumbers - {
            testSum(Exercises.sum1, 1, -8)
        }

        'test_sum2ShouldReturnSumOfNumbers - {
            testSum(Exercises.sum2, 1, -8)
        }

        'test_sum3ShouldReturnSumOfNumbers - {
            testSum(Exercises.sum3, 1, -8)
        }
    }
}
