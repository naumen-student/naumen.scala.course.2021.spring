package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBooleanFormatter - {
            val trueStr = "правда"
            val falseStr = "ложь"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(1) == "1")

            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(1) == "1")

            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(1) == "1")
        }

        'test_max - {
            val seq1 = Seq()
            val seq2 = Seq(42)
            val seq3 = Seq(5, 7, 9, 10, 11, 12, 45, 73, 1, 2, 5, 13)
            val seq4 = Seq(20, -89, 56, 76, 96, -23)

            intercept[UnsupportedOperationException]{
                Exercises.max1(seq1)
            }
            assert(Exercises.max1(seq2) == 42)
            assert(Exercises.max1(seq3) == 73)
            assert(Exercises.max1(seq4) == 96)

            assert(Exercises.max2(seq1) == Seq())
            assert(Exercises.max2(seq2) == Seq(42))
            assert(Exercises.max2(seq3) == Seq(73))
            assert(Exercises.max2(seq4) == Seq(96))

            assert(Exercises.max3(seq1).isEmpty)
            assert(Exercises.max3(seq2).get == 42)
            assert(Exercises.max3(seq3).get == 73)
            assert(Exercises.max3(seq4).get == 96)
        }
    }
}
