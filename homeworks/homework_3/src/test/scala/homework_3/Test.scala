package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
        }
        'test_prettyBooleanFormatter_1 - {
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
        }
        'test_prettyBooleanFormatter_2 - {
            assert(Exercises.prettyBooleanFormatter1(42) == "42")
            assert(Exercises.prettyBooleanFormatter2(42) == "42")
            assert(Exercises.prettyBooleanFormatter3(42) == "42")
        }

        'test_maxWithNotEmptyCollections - {
            assert(Exercises.max1(Seq(1,2,42)) == 42)
            assert(Exercises.max2(Seq(1,2,42)) == Seq(42))
            assert(Exercises.max3(Seq(1, 2, 42)).contains(42))
        }
        'test_maxWithEmptyCollections - {
            var caught = false
            try{
                Exercises.max1(Seq())
            }
            catch{
                case _: NoSuchElementException => caught = true
            }
            assert(caught)
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max3(Seq()).isEmpty)
        }
        'test_sum - {
            assert(Exercises.sum1(1,2) == 3)
            assert(Exercises.sum2(1,2) == 3)
            assert(Exercises.sum3(1,2) == 3)
        }
    }
}
