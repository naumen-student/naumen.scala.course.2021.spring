package homework_3

import utest.{intercept, _}

object Test extends TestSuite{

    val tests = Tests{
        'prettyBooleanFormatter - {
            val trueStr = "правда"
            val falseStr = "ложь"
            val numberStr = "5"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter4(true) == trueStr)


            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter4(false) == falseStr)

            assert(Exercises.prettyBooleanFormatter1(5) == numberStr)
            assert(Exercises.prettyBooleanFormatter2(5) == numberStr)
            assert(Exercises.prettyBooleanFormatter3(5) == numberStr)
            assert(Exercises.prettyBooleanFormatter4(5) == numberStr)
        }


        'max - {
            val seq1 = Seq(1,2,3,4)
            val seq2 = Seq()
            val seq3 = Seq(15, 20, 28,
                           16, 30, 29,
                           123, 120, 8,
                           110, 249) //посвящаю этот стих тому, кто проверяет мой код
            'max1 - {
                val exc_max1 = intercept[Exception] {
                    Exercises.max1(seq2)
                }
                assert(Exercises.max1(seq1) == 4)
                assert(exc_max1.getMessage == "try again")
                assert(Exercises.max1(seq3) == 249)
            }

            'max2 - {
                assert(Exercises.max2(seq1) == Seq(4))
                assert(Exercises.max2(seq2) == seq2)
                assert(Exercises.max2(seq3) == Seq(249))
            }

            'max3 - {
                assert(Exercises.max3(seq1) == Some(4))
                assert(Exercises.max3(seq2) == None)
                assert(Exercises.max3(seq3) == Some(249))
            }
        }

        'sumIntegers - {
            'sum1 - {
                assert(Exercises.sum1(1, 2) == 3)
                assert(Exercises.sum1(0, 0) == 0)
                assert(Exercises.sum1(-12, 2) == -10)
            }

            'sum2 - {
                assert(Exercises.sum2(1, 2) == 3)
                assert(Exercises.sum2(0, 0) == 0)
                assert(Exercises.sum2(-12, 2) == -10)

            }

            'sum3 - {
                assert(Exercises.sum3(1, 2) == 3)
                assert(Exercises.sum3(0, 0) == 0)
                assert(Exercises.sum3(-12, 2) == -10)
            }
        }
    }
    print("Не работаеть!")
}
