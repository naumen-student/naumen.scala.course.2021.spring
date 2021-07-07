package example

object Main extends App {
  val name = "Alexander Mogilnikov"
  val hellos = List("Hello", "Hola", "Guten tag")

  PrintHellos(hellos,name)
  PrintHellos(hellos,name.reverse)


  def PrintHellos(hellos: List[String], name: String) = {
    hellos.foreach(hello => println(hello + " Scala! This is " + name))
  }
}
