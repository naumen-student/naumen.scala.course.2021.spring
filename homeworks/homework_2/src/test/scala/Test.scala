import utest._

object Test extends TestSuite{

    val tests = Tests {
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33,
                35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93,
                96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
            assert(Exercises.sumOfDivBy3Or5(-10, 0) == -33)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(97) == Seq(97))
            assert(Exercises.primeFactor(264) == Seq(2, 3, 11))
        }
        val v1  = Exercises.Vector2D(1, 2)
        val v2  = Exercises.Vector2D(2, 3)
        val v3  = Exercises.Vector2D(3, 5)
        val v4  = Exercises.Vector2D(4, 1)
        'test_sumScalars - {
            assert(Exercises.sumScalars(v1, v2, v3, v4) == 25)
            assert(Exercises.sumScalars(v1, v3, v2, v4) == 24)
            assert(Exercises.sumScalars(v4, v1, v3, v2) == 27)
            assert(Exercises.sumScalars(v3, v1, v3, v2) == 34)
        }
        'test_sumCosines - {
            assert(Exercises.sumCosines(v1, v2, v3, v4) == 1.699384657900215)
            assert(Exercises.sumCosines(v1, v3, v2, v4) == 1.7369945588975253)
            assert(Exercises.sumCosines(v4, v1, v3, v2) == 1.649659511180406)
            assert(Exercises.sumCosines(v3, v1, v3, v2) == 1.995922623226019)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight() == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead",
                "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium",
                "Cobalt", "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
        }
    }
}
