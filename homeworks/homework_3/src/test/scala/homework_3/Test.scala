package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter_forTrue - {
            val trueStr = "правда"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
        }
        'test_prettyBooleanFormatter_forFalse - {
            val falseStr = "ложь"

            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
        }
        'test_prettyBooleanFormatter_forNotBoolean - {
            val notBoolean = 10

            assert(Exercises.prettyBooleanFormatter1(notBoolean) == notBoolean.toString)
            assert(Exercises.prettyBooleanFormatter2(notBoolean) == notBoolean.toString)
            assert(Exercises.prettyBooleanFormatter3(notBoolean) == notBoolean.toString)
        }
        'test_max_manyElementsSeq - {
            val sequence = Seq(0, 10, 20, 30)

            assert(Exercises.max1(sequence) == 30)
            assert(Exercises.max2(sequence) == Seq(30))
            assert(Exercises.max3(sequence) == Option(30))
        }
        'test_max_oneElementSeq - {
            val sequence = Seq(1)

            assert(Exercises.max1(sequence) == 1)
            assert(Exercises.max2(sequence) == Seq(1))
            assert(Exercises.max3(sequence) == Option(1))
        }
        'test_max_emptySeq - {
            val sequence = Seq()

            intercept[IllegalArgumentException] {
                Exercises.max1(sequence)
            }
            assert(Exercises.max2(sequence) == Seq())
            assert(Exercises.max3(sequence).isEmpty)
        }
        'test_sum - {
            val cases = Seq((1, 1, 2), (-1, 1, 0), (100, 50, 150))

            cases.foreach(c => {
                assert(Exercises.sum1(c._1, c._2) == c._3)
                assert(Exercises.sum2(c._1, c._2) == c._3)
                assert(Exercises.sum3(c._1, c._2) == c._3)
            })
        }
    }
}
