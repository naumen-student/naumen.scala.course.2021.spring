package example

object Main extends App {
  val name = "Anna Kiselyova"
  val names = List(name, name.reverse)
  val greetings = List("Hello", "Hi", "Hola")

  def say_hello(greeting: String, name: String): Unit = println(greeting + " Scala! This is " + name)

  for (name <- names)
    for (greeting <- greetings)
      say_hello(greeting, name)
}
