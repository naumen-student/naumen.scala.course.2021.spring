package homework_3

import utest._

import scala.collection.immutable.{ListMap, ListSet}

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")

            assert(Exercises.prettyBooleanFormatter1(0) == "0")
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter1('0') == "0")
            assert(Exercises.prettyBooleanFormatter1("some string") == "some string")


            val emptySet = new ListSet[Int]()
            assert(Exercises.prettyBooleanFormatter1(emptySet) == "ListSet()")

            val map = new ListMap[String, ListSet[Int]]().+(("oo", new ListSet[Int]().+(9999)))
            assert(Exercises.prettyBooleanFormatter1(map) == "ListMap(oo -> ListSet(9999))")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")

            assert(Exercises.prettyBooleanFormatter2(0) == "0")
            assert(Exercises.prettyBooleanFormatter2(1) == "1")
            assert(Exercises.prettyBooleanFormatter2('0') == "0")
            assert(Exercises.prettyBooleanFormatter2("some string") == "some string")


            val emptySet = new ListSet[Int]()
            assert(Exercises.prettyBooleanFormatter2(emptySet) == "ListSet()")

            val map = new ListMap[String, ListSet[Int]]().+(("oo", new ListSet[Int]().+(9999)))
            assert(Exercises.prettyBooleanFormatter2(map) == "ListMap(oo -> ListSet(9999))")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")

            assert(Exercises.prettyBooleanFormatter3(0) == "0")
            assert(Exercises.prettyBooleanFormatter3(1) == "1")
            assert(Exercises.prettyBooleanFormatter3('0') == "0")
            assert(Exercises.prettyBooleanFormatter3("some string") == "some string")


            val emptySet = new ListSet[Int]()
            assert(Exercises.prettyBooleanFormatter3(emptySet) == "ListSet()")

            val map = new ListMap[String, ListSet[Int]]().+(("oo", new ListSet[Int]().+(9999)))
            assert(Exercises.prettyBooleanFormatter3(map) == "ListMap(oo -> ListSet(9999))")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(1, 99, 3, -10, 22)) == 99)
            assert(Exercises.max1(Seq(-1, -99, -3, -10, -22)) == -1)

            assert(Exercises.max1(Seq()) == Int.MinValue)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq(1, 99, 3, -10, 22)) == Seq(99))
            assert(Exercises.max2(Seq(-1, -99, -3, -10, -22)) == Seq(-1))

            assert(Exercises.max2(Seq()) == Seq())
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(1, 99, 3, -10, 22)).get == 99)
            assert(Exercises.max3(Seq(-1, -99, -3, -10, -22)).get == -1)

            assert(Exercises.max3(Seq()).isEmpty)
        }

        'test_sum1 - {
            assert(Exercises.sum1(9, 5) == 14)
            assert(Exercises.sum1(-99, 5) == -94)
        }

        'test_sum2 - {
            assert(Exercises.sum2(9, 5) == 14)
            assert(Exercises.sum2(-99, 5) == -94)
        }

        'test_sum3 - {
            assert(Exercises.sum3(9, 5) == 14)
            assert(Exercises.sum3(-99, 5) == -94)
        }
    }
}
