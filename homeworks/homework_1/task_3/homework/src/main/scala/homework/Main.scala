package homework

object Main extends App {
  def printHello(helloWord: String, name: String) : Unit = {
    println(s"$helloWord Scala! This is $name")
  }
  val helloWords = List("Hello", "Hi", "Bonjour")
  val myName = "Anisa"
  val names = List(myName, myName.reverse)
  for (name <- names)
    for (helloWord <- helloWords)
      printHello(helloWord, name)
}
