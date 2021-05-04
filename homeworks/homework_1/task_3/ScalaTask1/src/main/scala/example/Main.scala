package example

object Main extends App {
  def greet(greeting: String, name: String): Unit = {
    println(greeting + ", Scala! This is " + name)
  }

  val name = "Kirill Turyshev"
  val greetings = Array("Hello", "Hola", "Guten tag")

  greet(greetings(0), name)

  greet(greetings(1), name)

  greet(greetings(2), name)

  greet(greetings(0), name.reverse)

  greet(greetings(1), name.reverse)

  greet(greetings(2), name.reverse)
}
