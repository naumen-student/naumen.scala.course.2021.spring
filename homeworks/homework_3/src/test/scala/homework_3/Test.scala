package homework_3

import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_prettyBooleanFormatter1 - {
      assert(Exercises.prettyBooleanFormatter1(true) == "правда")
      assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter1(1) == "1")
    }
    'test_prettyBooleanFormatter2 - {
      assert(Exercises.prettyBooleanFormatter2(true) == "правда")
      assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter2(1) == "1")
    }
    'test_prettyBooleanFormatter3 - {
      assert(Exercises.prettyBooleanFormatter3(true) == "правда")
      assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter3(1) == "1")
    }
    'test_max1 - {
      assert(Exercises.max1(Nil) == 0)
      assert(Exercises.max1(1 :: 2 :: Nil) == 2)
      assert(Exercises.max1(2 :: 1 :: Nil) == 2)
    }
    'test_max2 - {
      assert(Exercises.max2(Nil) == Nil)
      assert(Exercises.max2(1 :: 2 :: Nil) == 2 :: Nil)
      assert(Exercises.max2(2 :: 1 :: Nil) == 2 :: Nil)
    }
    'test_max3 - {
      assert(Exercises.max3(Nil) == None)
      assert(Exercises.max3(1 :: 2 :: Nil) == Some(2))
      assert(Exercises.max3(2 :: 1 :: Nil) == Some(2))
    }
    'test_sum1 - {
      assert(Exercises.sum1(1, 2) == 3)
      assert(Exercises.sum1(-1, 1) == 0)
      assert(Exercises.sum1(Int.MaxValue, Int.MinValue) == -1)
    }
    'test_sum2 - {
      assert(Exercises.sum2(1, 2) == 3)
      assert(Exercises.sum2(-1, 1) == 0)
      assert(Exercises.sum2(Int.MaxValue, Int.MinValue) == -1)
    }
    'test_sum3 - {
      assert(Exercises.sum3(1, 2) == 3)
      assert(Exercises.sum3(-1, 1) == 0)
      assert(Exercises.sum3(Int.MaxValue, Int.MinValue) == -1)
    }
  }
}
