object Main extends App {
  val name = "Eugene";
  val mes = List("Hola", "Guten tag");

  def helloPrint(mes: List[String], name: String): Unit = {
    mes.foreach(x => println(s"$x, Scala! This is $name"));
  }

  helloPrint(List("Hello"), name)
  println()
  helloPrint(mes, name)
  println()
  helloPrint(mes, name.reverse)
}

