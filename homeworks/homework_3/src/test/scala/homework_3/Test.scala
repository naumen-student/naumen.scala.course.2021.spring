package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        val prettyBooleanFormatters = Seq(
            Exercises.prettyBooleanFormatter1 _,
            Exercises.prettyBooleanFormatter2 _,
            Exercises.prettyBooleanFormatter3 _,
        )

        val prettyBooleanFormattersTestCases = Seq(
            (true, "правда"),
            ("true", "true"),
            (false, "ложь"),
            (1, "1"),
            (List(), "List()"),
            ("someStr", "someStr"),
        )

        'prettyBooleanFormatter - {
            for (f <- prettyBooleanFormatters)
                for ((value, result) <- prettyBooleanFormattersTestCases)
                    assert(f(value) == result)
        }

        val maxTestCases = Seq(
            (Seq(1, 2, 3), 3),
            (Seq(3, 2, 1), 3),
            (Seq(2, 3, 1), 3),
            (Seq(1, 2, 2, 1, 2, 2), 2),
            (Seq(-1, 0, 1), 1),
            (Seq(-1, -2, -3), -1),
            (Seq(0, 0, 0), 0),
            (Seq(1, 5, 123, 7), 123),
        )

        val maxs = Seq(
            (Exercises.max1 _, (x: Int) => x),
            (Exercises.max2 _, (x: Int) => Seq(x)),
            (Exercises.max3 _, (x: Int) => Option(x)),
        )

        'test_max - {
            for ((f, resFunc) <- maxs)
                for ((param, result) <- maxTestCases)
                    assert(f(param) == resFunc(result))
        }

        'test_max_empty - {
            assert(Exercises.max1(Seq()) == Int.MinValue)
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max3(Seq()) == None)
        }

        val sums = Seq(
            Exercises.sum1 _,
            Exercises.sum2 _,
            Exercises.sum3 _,
        )

        val sumTestCases = Seq(
            (1, 1, 2),
            (1, 0, 1),
            (0, 0, 0),
            (-1, 1, 0),
            (-5, 2, -3),
            (11, 12, 23),
            (100, 1, 101),
        )

        'test_sum - {
            for (f <- sums)
                for ((x, y, result) <- sumTestCases)
                    assert(f(x, y) == result)
        }

    }
}
