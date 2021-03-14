object Main extends App {
  val greetings = List("Hello", "Hola", "Guten tag")

  val student = "Ivan Perepelkin"
  val students = student :: student.reverse :: Nil

  def combine[A, B](xs: List[A], ys: List[B]): List[(A, B)] =
    for {
      x <- xs
      y <- ys
    } yield (x, y)

  combine(greetings, students)
    .foreach { case (greeting, student) =>
      println(s"$greeting Scala! This is $student")
    }
}