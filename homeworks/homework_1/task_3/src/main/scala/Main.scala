object Main extends App{
  val name = "Igor'"
  val greetings = List("Hello","Hola","Guten tag")

  def welcomeMessage(personName: String) = {
    greetings.foreach(x=>println(s"$x Scala! This is $personName"))
  }

  welcomeMessage(name)
  welcomeMessage(name.reverse)
}
