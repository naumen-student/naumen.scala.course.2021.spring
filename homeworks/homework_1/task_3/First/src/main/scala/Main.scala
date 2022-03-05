object Main extends App {
  def greet(greeting: String, name: String): Unit = { println(s"$greeting Scala! This is $name") }
  var name = "BigBird"
  var greeting = "Hello"
  greet(greeting, name)

  greeting = "Hola"
  greet(greeting, name)

  greeting = "Guten Tag"
  greet(greeting, name)

  name = name.reverse
  greet(greeting, name)

  greeting = "Hola"
  greet(greeting, name)

  greeting = "Hello"
  greet(greeting, name)
}
