package homework_1

object Main extends App {
  val name = "Danil Kormiltsev"
  val messages = Array("Hello", "Hola", "Guten tag")

  def printMessage(name: String, message: String): Unit = {
    println(s"$message, Scala! This is $name")
  }

  messages.foreach(message => printMessage(name, message))
  messages.foreach(message => printMessage(name.reverse, message))
}
