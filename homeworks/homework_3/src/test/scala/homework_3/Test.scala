package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter1(1.01) == "1.01")
            assert(Exercises.prettyBooleanFormatter1("привет") == "привет")
        }

        'prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(1) == "1")
            assert(Exercises.prettyBooleanFormatter2(1.01) == "1.01")
            assert(Exercises.prettyBooleanFormatter2("привет") == "привет")
        }

        'prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(1) == "1")
            assert(Exercises.prettyBooleanFormatter3(1.01) == "1.01")
            assert(Exercises.prettyBooleanFormatter3("привет") == "привет")
        }

        'max1 - {
            assert(Exercises.max1(Seq(1, 20, 5)) == 20)
            assert(Exercises.max1(Seq()) == Int.MinValue)
            assert(Exercises.max1(Seq(1, 20, 25)) == 25)
        }

        'max2 - {
            assert(Exercises.max2(Seq(1, 20, 5)) == Seq(20))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(1, 20, 25)) == Seq(25))
        }

        'max3 - {
            assert(Exercises.max3(Seq(1, 20, 5)).contains(20))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(1, 20, 25)).contains(25))
        }

        'sum1 - {
            assert(Exercises.sum1(20, 5) == 25)
            assert(Exercises.sum1(11, 6) == 17)
            assert(Exercises.sum1(12, 25) == 37)
        }

        'sum2 - {
            assert(Exercises.sum2(20, 5) == 25)
            assert(Exercises.sum2(11, 6) == 17)
            assert(Exercises.sum2(12, 25) == 37)
        }

        'sum3 - {
            assert(Exercises.sum3(20, 5) == 25)
            assert(Exercises.sum3(11, 6) == 17)
            assert(Exercises.sum3(12, 25) == 37)
        }
    }
}
