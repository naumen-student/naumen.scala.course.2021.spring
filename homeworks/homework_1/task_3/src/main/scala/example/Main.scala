package example

object Main extends App {
  val defaultGreeting = "Hello"
  val defaultName = "Yegor Druzhinin"

  def say(
           greeting: String = defaultGreeting,
           name: String = defaultName
         ): Unit = {
    println(s"$greeting Scala! This is $name")
  }

  say()

  val otherGreetings = Array("Hola", "Guten tag", "Ciao");
  for (greeting <- otherGreetings) say(greeting)
  for (greeting <- otherGreetings) say(greeting, defaultName.reverse)
}
