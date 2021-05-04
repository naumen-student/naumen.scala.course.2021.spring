import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == 3+5+6+9+10+12+15+18+20+21+24+25+27+30+33+35+36+39+40+42+45+48+50+51+54+55+57+60+63+65+66+69+70+72+75+78+80+81+84+85+87+90+93+95+96+99+100)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(10) == Seq(2, 5))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 2), Exercises.Vector2D(0, 1), Exercises.Vector2D(2, 1)) ==
              Exercises.scalar(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 2)) + Exercises.scalar(Exercises.Vector2D(0, 1), Exercises.Vector2D(2, 1)))
            }
        'test_sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 2), Exercises.Vector2D(0, 1), Exercises.Vector2D(2, 1)) ==
              Exercises.cosBetween(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 2)) + Exercises.cosBetween(Exercises.Vector2D(0, 1), Exercises.Vector2D(2, 1)))
        }

        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Exercises.balls) == List("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
        }
    }
}
