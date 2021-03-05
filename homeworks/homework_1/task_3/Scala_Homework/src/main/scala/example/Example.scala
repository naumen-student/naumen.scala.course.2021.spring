package example

object Main extends App {
  val full_name = "Stepan Koksharov"
  val greetings = Array("Hello", "Hola", "Guten tag")
  val middle = " Scala! This is "

  def hello(name : String): Unit =
  {
    for (greeting <- greetings) println(greeting + middle + name)
  }

  hello(full_name)
  println()
  hello(full_name.reverse)

}
