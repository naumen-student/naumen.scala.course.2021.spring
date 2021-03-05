package example

object Main extends App {
  val name = "Liza Golysheva"
  val constStr = " Scala! This is "
  val greeting = List("Hello", "Hola", "Guten tag")

  def f(x1: String): Unit = greeting.foreach(i => println(i + constStr + x1))

  f(name)
  f(name.reverse)
}
