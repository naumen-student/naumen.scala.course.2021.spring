package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1("текст") == "текст")
            assert(Exercises.prettyBooleanFormatter1(123) == "123")
        }
        'prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2("текст") == "текст")
            assert(Exercises.prettyBooleanFormatter2(123) == "123")
        }
        'prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3("текст") == "текст")
            assert(Exercises.prettyBooleanFormatter3(123) == "123")
        }
        'max1 - {
            intercept[IllegalArgumentException] {
                Exercises.max1(Seq())
            }
            assert(Exercises.max1(Seq(1,2,3)) == 3)
            assert(Exercises.max1(Seq(-1,-2,-3)) == -1)
            assert(Exercises.max1(Seq(0)) == 0)
        }
        'max2 - {
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(-1,-2,-3)) == Seq(-1))
            assert(Exercises.max2(Seq(1,2,3)) == Seq(3))
            assert(Exercises.max2(Seq(0)) == Seq(0))
        }
        'max3 - {
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(-1,-2,-3)) == Option(-1))
            assert(Exercises.max3(Seq(1,2,3)) == Option(3))
            assert(Exercises.max3(Seq(0)) == Option(0))
        }
        'sum1 - {
            assert(Exercises.sum1(0,0) == 0)
            assert(Exercises.sum1(-2,2) == 0)
            assert(Exercises.sum1(0,5) == 5)
            assert(Exercises.sum1(250,250) == 500)
        }
        'sum2 - {
            assert(Exercises.sum2(0,0) == 0)
            assert(Exercises.sum2(-2,2) == 0)
            assert(Exercises.sum2(0,5) == 5)
            assert(Exercises.sum2(250,250) == 500)
        }
        'sum3 - {
            assert(Exercises.sum3(0,0) == 0)
            assert(Exercises.sum3(-2,2) == 0)
            assert(Exercises.sum3(0,5) == 5)
            assert(Exercises.sum3(250,250) == 500)
        }



    }
}
