package example

object Main extends App {
  val name = "Daria Shemyakina"
  val greetings = Array("Hello", "Hola", "Guten Tag")

  def greet(greeting: String, name: String) = println(greeting + " Scala! This is " + name)

  def greetMany(greetings: Array[String], name: String) = for (greeting <- greetings) greet(greeting, name)

  greetMany(greetings, name)
  greetMany(greetings, name.reverse)
}
