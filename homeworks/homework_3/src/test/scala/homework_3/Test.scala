package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBoolean - {
          val trueStr = "правда"
          val falseStr = "ложь"

          assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
          assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
          assert(Exercises.prettyBooleanFormatter1(1) == "1")

          assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
          assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
          assert(Exercises.prettyBooleanFormatter2("hello") == "hello")

          assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
          assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
          assert(Exercises.prettyBooleanFormatter3(List(1, 2, 3)) == "List(1, 2, 3)")
        }

        'test_max - {
          assert(Exercises.max1(List()) == Int.MinValue)
          assert(Exercises.max1(List(1, 2 , 3, 4)) == 4)

          assert(Exercises.max2(List()) == Seq.empty)
          assert(Exercises.max2(List(1, 2, 4, 4, 3, 1)) == List(4, 4))

          assert(Exercises.max3(List()) == None)
          assert(Exercises.max3(List(3, 4, 1, 4, 8, 3)) == Some(8))
        }

        'test_sum - {
          assert(Exercises.sum1(5, 6) == 11)
          assert(Exercises.sum2(5, 6) == 11)
          assert(Exercises.sum3(5, 6) == 11)
        }
    }
}
