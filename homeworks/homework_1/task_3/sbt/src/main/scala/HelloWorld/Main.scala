package HelloWorld

object Main extends App{
  def greet(greeter: String, name: String): Unit = {
    println(s"$greeter Scala! This is $name")
  }

  def greetReverseName(greeter: String, name: String): Unit = {
    greet(greeter, name.reverse)
  }


  val myName = "Alexander"
  val enGreeter = "Hello"
  val esGreeter = "Hola"
  val deGreeter = "Guten tag"

  greet(enGreeter, myName)
  greet(esGreeter, myName)
  greet(deGreeter, myName)

  greetReverseName(enGreeter, myName)
  greetReverseName(esGreeter, myName)
  greetReverseName(deGreeter, myName)
}
