package homework1

object Main extends App {
  val name = "Petrov Sergiy"
  val greetings = Array("Hello", "Hola", "Guten tag")
  def message(greeting: String, name: String): String = s"$greeting Scala! This is $name"

  greetings.map(greeting => message(greeting, name)).foreach(message => println(message))
  greetings.map(greeting => message(greeting, name.reverse)).foreach(message => println(message))
}
