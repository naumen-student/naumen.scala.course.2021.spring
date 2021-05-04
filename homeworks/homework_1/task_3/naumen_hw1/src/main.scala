object main extends App {
  def sayHello(greeting: String, name: String): Unit = {
    println(s"$greeting Scala! This is $name")
  }

  val name = "Anastasia Antipenkova"
  sayHello("Hello", name)
  val greetings = Array("Hello", "Hola", "Guten tag")
  for (greeting <- greetings) sayHello(greeting, name)
  for (greeting <- greetings) sayHello(greeting, name.reverse)
}