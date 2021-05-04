package example

object Main extends App {
  val name = "Irina Mochalova"
  val phrase = "Hello Scala! This is"
  val greetingWorlds = List("Hola", "Guten tag", "Ciao")

  def say(phrase: String, name: String): Unit = {
    println(s"$phrase $name.")
  }

  def sayHello (name: String): Unit = {
    greetingWorlds.foreach(hello => say(phrase.replace("Hello", hello), name))
  }

  say(phrase, name)
  sayHello(name)
  sayHello(name.reverse)
}