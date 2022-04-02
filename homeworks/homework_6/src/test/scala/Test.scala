import utest._


object Test extends TestSuite{

  val tests = Tests{
    'reverse - {
      assert(Exercises.reverse(Seq(1, 2, 3)) == Seq(3, 2, 1))
      assert(Exercises.reverse(Seq(-1, -2, -3)) == Seq(-3, -2, -1))
      assert(Exercises.reverse(Seq.empty[Double]) == Seq.empty[Double])
      assert(Exercises.reverse(Seq('d', 's', 'a')) == Seq('a', 's', 'd'))
    }

    'fibonacci4Index - {
      assert(Exercises.fibonacci4Index(-132) == -1)
      assert(Exercises.fibonacci4Index(2) == 1)
      assert(Exercises.fibonacci4Index(5) == 5)
      assert(Exercises.fibonacci4Index(6) == 8)
    }

    'fibonacci - {
      assert(Exercises.fibonacci(0) == Seq(0))
      assert(Exercises.fibonacci(1) == Seq(0, 1))
      assert(Exercises.fibonacci(2) == Seq(0, 1, 1))
      assert(Exercises.fibonacci(5) == Seq(0, 1, 1, 2, 3, 5))
      assert(Exercises.fibonacci(6) == Seq(0, 1, 1, 2, 3, 5, 8))

    }

    'morse - {
      assert(Exercises.morse("") == "")
      assert(Exercises.morse("SOS") == "... --- ...")
      assert(Exercises.morse("Hello world!") == ".... . .-.. .-.. ---   .-- --- .-. .-.. -.. !") // ошибка в тесте была изнчально
    }

    'wordReverse - {
      assert(Exercises.wordReverse("") == "")
      assert(Exercises.wordReverse("!&?") == "!&?")
      assert(Exercises.wordReverse("Hello world!") == "Olleh dlrow!")
      assert(Exercises.wordReverse("USSR") == "RSSu") // какое поведение должно быть тут???
      assert(Exercises.wordReverse("Зима!.. Крестьянин, торжествуя...") == "Амиз!.. Ниняьтсерк, яувтсежрот...")
    }


  }
}
