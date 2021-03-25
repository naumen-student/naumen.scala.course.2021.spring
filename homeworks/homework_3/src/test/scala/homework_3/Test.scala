package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(25.6) == "25.6")
            assert(Exercises.prettyBooleanFormatter2(25) == "25")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(25.6) == "25.6")
            assert(Exercises.prettyBooleanFormatter2(25) == "25")
        }
        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(25.6) == "25.6")
            assert(Exercises.prettyBooleanFormatter3(25) == "25")
        }

        'test_max1- {
            assert(Exercises.max1(Seq(1,5,7,3,4,2,2)) == 7)
            intercept[Exception] {
                Exercises.max1(Seq())
            }
            assert(Exercises.max1(Seq(67)) == 67)


        }
        'test_max2- {
            assert(Exercises.max2(Seq(1,5,7,3,4,2,2)) == Seq(7))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(67)) == Seq(67))
        }
        'test_max3- {
            assert(Exercises.max3(Seq(1,5,7,3,4,2)) == Option(7))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(67)) == Option(67))
        }
        'test_sum1- {
            assert(Exercises.sum1(6,1) == 7)
            assert(Exercises.sum1(0,0) == 0)
        }
        'test_sum2- {
            assert(Exercises.sum2(6,1) == 7)
            assert(Exercises.sum2(0,0) == 0)
        }
        'test_sum3- {
            assert(Exercises.sum2(6,1) == 7)
            assert(Exercises.sum2(0,0) == 0)
        }
    }
}
