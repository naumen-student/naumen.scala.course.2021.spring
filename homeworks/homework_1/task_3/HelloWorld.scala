object HelloWorld extends App {
  val name = "Evgenii Alekseev"
  val phrase = "Scala! This is"
  val greetings = Array("Hello", "Guten tag", "Halo")
  greetings.foreach(x => println(s"$x $phrase $name"))
  greetings.foreach(x => println(s"$x $phrase ${name.reverse}"))
}
