package example

object Main extends App {
  def greet( name:String ) : Unit = {
    for (greeting <- greetings)
      println(greeting + mainPart + name)
  }

  val name = "Sveta Semenova"
  val greetings = Array("Hello", "Hola", "Guten tag")
  val mainPart = " Scala! This is "

  greet(name)
  greet(name.reverse)

}