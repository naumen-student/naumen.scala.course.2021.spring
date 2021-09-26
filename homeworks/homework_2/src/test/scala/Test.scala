import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
            assert(Exercises.sumOfDivBy3Or5(-1, -1) == 0)
            assert(Exercises.sumOfDivBy3Or5(1, 1) == 0)
            assert(Exercises.sumOfDivBy3Or5(-4, 0) == -3)
            assert(Exercises.sumOfDivBy3Or5(0, 4) == 3)
            assert(Exercises.sumOfDivBy3Or5(-3333, 3333) == 0)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(-1) == Seq())
            assert(Exercises.primeFactor(-80) == Seq(2, 5))
            assert(Exercises.primeFactor(0) == Seq())
            assert(Exercises.primeFactor(1) == Seq())
            assert(Exercises.primeFactor(3) == Seq(3))
            assert(Exercises.primeFactor(7) == Seq(7))
            assert(Exercises.primeFactor(10) == Seq(2, 5))
            assert(Exercises.primeFactor(15) == Seq(3, 5))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(236246) == Seq(2, 19, 6217))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(0, 1), Vector2D(2, 3), Vector2D(4, 5), Vector2D(6, 7)) == 62)
            assert(Exercises.sumScalars(Vector2D(0, 0), Vector2D(444, 24224), Vector2D(1, 1), Vector2D(23, 77)) == 100)
        }
        'test_sumCosines - {
            assert((Exercises.sumCosines(Vector2D(-6, -8), Vector2D(6, 8), Vector2D(-3, -5), Vector2D(3, 5)) + 2).abs <= 1e-10)
        }
        'test_sortByHeavyweight - {
            assert(
                Exercises.sortByHeavyweight() == Seq(
                    "Tin",
                    "Platinum",
                    "Nickel",
                    "Aluminum",
                    "Titanium",
                    "Lead",
                    "Sodium",
                    "Uranium",
                    "Gold",
                    "Tungsten",
                    "Zirconium",
                    "Chrome",
                    "Iron",
                    "Copper",
                    "Silver",
                    "Plutonium",
                    "Cobalt",
                    "Cesium",
                    "Calcium",
                    "Lithium",
                    "Magnesium",
                    "Potassium",
                    "Graphite",
                )
            )
        }
    }
}
