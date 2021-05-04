package hello

object Main extends App{
  val myName = "Avdeyeva Yuliya"
  def greet(greeting: String, name: String): Unit = {
    println(s"$greeting Scala! This is $name")
  }
  val greetings: List[String] = List("Hello", "Hola", "Guten tag")
  greetings.foreach(x => greet(x, myName))
  greetings.foreach(x => greet(x, myName.reverse))
}
