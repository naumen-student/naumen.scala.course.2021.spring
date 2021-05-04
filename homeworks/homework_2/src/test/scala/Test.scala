import utest._
import Exercises.{Vector2D, balls}

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_divBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(3, 8) == 14)
        }

        'test_primeFactor - {
	      assert(Exercises.primeFactor(4) == Seq(2))
	      assert(Exercises.primeFactor(13) == Seq(13))
	      assert(Exercises.primeFactor(45) == Seq(3, 5))
	    }

	    'test_sumScalars - {
	      assert(Exercises.sumScalars(Vector2D(0, 1), Vector2D(1, 0), Vector2D(0, 2), Vector2D(2, 0)) == 0)
	      assert(Exercises.sumScalars(Vector2D(3, 0), Vector2D(6, 5), Vector2D(1, 2), Vector2D(8, 2)) == 30)
	    }

	    'test_sumCosines - {
	      assert(Exercises.sumCosines(Vector2D(0, 1), Vector2D(1, 0), Vector2D(0, 2), Vector2D(2, 0)) == 0)
	    }

	    'test_sortByHeavyweight - {
	      assert(Exercises.sortByHeavyweight(balls) ==
	        Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten",
	          "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium",
	          "Magnesium", "Potassium", "Graphite"))
	    }

    }
}
