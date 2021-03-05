object Main extends App {
  val greetings = "Hello" :: "Aloha" :: "Guten tag" :: Nil
  val name = "Nikita"
  val greet = (greeting: String, name: String) => println(s"$greeting Scala! This is $name")

  greetings.foreach(greet(_, name))
  greetings.foreach(greet(_, name.reverse))
}