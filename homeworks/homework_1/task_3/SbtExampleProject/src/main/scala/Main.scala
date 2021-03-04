object Main extends App {
  val name = "Vitaly Vertikov"

  val words = List("Hello", "Hola", "Guten tag")

  def print(hello : String, name : String) : String = hello + " Scala! This is " + name

  for (n <- List(name, name.reverse)) {
    for (w <- words) {
      println(print(w, n))
    }
  }

}
