package example

object Main extends App {
  def greet(greeting: String, name: String): Unit = println(s"$greeting Scala! This is $name")

  val greetings = Array("Hello", "Hola", "Guten tag")
  val name = "Ilya Moskvin"

  greetings.foreach(greeting => greet(greeting, name))
  greetings.foreach(greeting => greet(greeting, name.reverse))
}
