package homework_3

import homework_3.Exercises.{max1, max2, max3, prettyBooleanFormatter1, prettyBooleanFormatter2, prettyBooleanFormatter3, sum1, sum2, sum3}
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBooleanFormating - {
            val trueStr = "правда"
            val falseStr = "ложь"

            assert(prettyBooleanFormatter1(true) == trueStr)
            assert(prettyBooleanFormatter1(false) == falseStr)
            assert(prettyBooleanFormatter1("Hi") == "Hi")

            assert(prettyBooleanFormatter2(true) == trueStr)
            assert(prettyBooleanFormatter2(false) == falseStr)
            assert(prettyBooleanFormatter2(3) == "3")

            assert(prettyBooleanFormatter3(true) == trueStr)
            assert(prettyBooleanFormatter3(false) == falseStr)
            assert(prettyBooleanFormatter3(Seq(1, 2)) == "List(1, 2)")
        }

        'test_max - {
            assert(max1(Seq(1, 2, 3)) == 3)
            assert(max1(Seq(-5, -4, -1)) == -1)
            assert(max1(Seq()) == Int.MinValue)

            assert(max2(Seq(1, 4, 6)) == Seq(6))
            assert(max2(Seq(-4, -2, 0)) == Seq(0))
            assert(max2(Seq()) == Seq())

            assert(max3(Seq(2, 3, 4)) == Option(4))
            assert(max3(Seq(-1, 2, 5)) == Option(5))
            assert(max3(Seq()) == None)
        }

        'test_sum - {
            assert(sum1(1, 2) == 3)
            assert(sum1(-1, 1) == 0)
            assert(sum1(100, 200) == 300)

            assert(sum2(0, 0) == 0)
            assert(sum2(1, 5) == 6)
            assert(sum2(6, 36) == 42)

            assert(sum3(-1, 2) == 1)
            assert(sum3(4, 3) == 7)
            assert(sum3(5, 5) == 10)
        }


    }
}
