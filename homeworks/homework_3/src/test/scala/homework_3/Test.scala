package homework_3

import utest._

object Test extends TestSuite{

<<<<<<< HEAD
    val formatter1 : Any => String = Exercises.prettyBooleanFormatter1
    val formatter2 : Any => String = Exercises.prettyBooleanFormatter2
    val formatter3 : Any => String = Exercises.prettyBooleanFormatter3

=======
>>>>>>> 05024b7cb47dd237cde48b6fdb3613543bd475a2
    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
<<<<<<< HEAD

        'test_prettyBooleanFormatter1 - {
            assert(formatter1(true) == "правда")
            assert(formatter1(false) == "ложь")
            assert(formatter1("привет") == "привет")
        }
        'test_prettyBooleanFormatter2 - {
            assert(formatter2(true) == "правда")
            assert(formatter2(false) == "ложь")
            assert(formatter2("привет") == "привет")
        }
        'test_prettyBooleanFormatter3 - {
            assert(formatter3(true) == "правда")
            assert(formatter3(false) == "ложь")
            assert(formatter3("привет") == "привет")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(100)) == 100)
            assert(Exercises.max1(Seq(-100, 20, 4)) == 20)
            intercept[UnsupportedOperationException](Exercises.max1(Seq.empty[Int]))
        }

        'test_max2 - {
            assert(Exercises.max1(Seq(100)) == 100)
            assert(Exercises.max1(Seq(-100, 20, 4)) == 20)
            assert(Exercises.max2(Seq.empty[Int]) == Seq.empty[Int])
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(100)) == Option(100))
            assert(Exercises.max3(Seq(-100, 20, 4)) == Option(20))
            assert(Exercises.max3(Seq.empty[Int]) == None)
        }

        'test_sum1 - {
            assert(Exercises.sum1(11, 12) == 23)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-1, -2) == -3)
        }
        'test_sum2 - {
            assert(Exercises.sum2(11, 12) == 23)
            assert(Exercises.sum2(0, 0) == 0)
            assert(Exercises.sum2(-1, -2) == -3)
        }
        'test_sum3 - {
            assert(Exercises.sum3(11, 12) == 23)
            assert(Exercises.sum3(0, 0) == 0)
            assert(Exercises.sum3(-1, -2) == -3)
        }
=======
>>>>>>> 05024b7cb47dd237cde48b6fdb3613543bd475a2
    }
}
