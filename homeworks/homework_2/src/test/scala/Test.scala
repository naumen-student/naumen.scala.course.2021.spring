import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0,3) == 3)
            assert(Exercises.sumOfDivBy3Or5(3,9) == 23)
            assert(Exercises.sumOfDivBy3Or5(125,900) == 185907)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(210) == Seq(2,3,5,7))
            assert(Exercises.primeFactor(8) == Seq(2))
            assert(Exercises.primeFactor(98) == Seq(2,7))
            assert(Exercises.primeFactor(111) == Seq(3,37))
            assert(Exercises.primeFactor(1024) == Seq(2))
            assert(Exercises.primeFactor(125) == Seq(5))
        }

        'test_sumScalars -{
            assert(Exercises.sumScalars(Vector2D(0,0), Vector2D(1,1), Vector2D(1,2), Vector2D(2,1)) == 4)
            assert(Exercises.sumScalars(Vector2D(7,2), Vector2D(1,1), Vector2D(4,2), Vector2D(2,1)) == 19)
            assert(Exercises.sumScalars(Vector2D(5,0), Vector2D(1,6), Vector2D(1,2), Vector2D(4,1)) == 11)
        }

        'test_sumCosines - {
            assert(Exercises.sumScalars(Vector2D(0,0), Vector2D(1,1), Vector2D(1,2), Vector2D(2,1)) == 4)
            assert(Exercises.sumScalars(Vector2D(5,0), Vector2D(1,6), Vector2D(1,2), Vector2D(4,1)) == 11)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight() == Seq("Sodium","Lithium","Tin",
                "Aluminum","Potassium","Calcium","Cesium","Magnesium","Nickel","Silver",
                "Zirconium","Titanium","Platinum","Chrome","Lead","Iron","Graphite","Copper",
                "Cobalt","Uranium","Gold","Tungsten","Plutonium"))

            assert(Exercises.sortByHeavyweight(Map(
                "Aluminum" -> (3, 2.6889),"Tin" -> (1, 7.29),
                "Silver" -> (4, 4.505), "Uranium" -> (2, 19.04),
                "Cesium" -> (7,   1.873)
            )) == Seq("Tin","Aluminum","Cesium","Silver","Uranium"))
        }
    }
}
