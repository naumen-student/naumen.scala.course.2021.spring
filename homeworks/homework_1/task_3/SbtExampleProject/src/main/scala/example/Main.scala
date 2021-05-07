object Main extends App {
  def hello(greetings: Array[String], name: String): Unit = {
    for (greeting <- greetings) println(greeting + " Scala! This is " + name)
  }

  val name = "Marina Konovalova"

  val greetings = Array("Hello", "Hola", "Guten tag")

  hello(greetings, name)

  hello(greetings, name.reverse)

}