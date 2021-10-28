package example

object Main extends App {
  var hello = "Hello Scala! This is Alexander Shuxtoff"

  def replaceHello(newHello : String) : Unit = {
    println(hello.replace(hello.split(" ")(0), newHello))
  }


  def reverseName() : Unit = {
    val splittedHello = hello.split(" ")
    val firstName = splittedHello(splittedHello.length - 2)
    val secondName = splittedHello.last
    println(hello.replace(firstName + " " + secondName, firstName.reverse + " " + secondName.reverse))
  }

  replaceHello("Hola")
  reverseName()

}
