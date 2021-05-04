package ru.anisimov_d.naumen.scala2021.task1

object Main extends App {
  def hello(name: String, greeting: String): Unit = println(s"$greeting Scala! This is $name")

  val MAIN_NAME = "Danil"
  val KEK_NAME = "Kek"

  val HELLO_GREETING = "Hello"
  val HOLA_GREETING = "Hola"
  val GUTEN_TAG_GREETING = "Guten tag"

  val names = Array(MAIN_NAME, KEK_NAME)
  val greetings = Array(HELLO_GREETING, HOLA_GREETING, GUTEN_TAG_GREETING)

  greetings.foreach(e => hello(
    name = MAIN_NAME,
    greeting = e,
  ))
  println()

  greetings.flatMap(u => names.map(v => (u, v))).foreach{
    case (greeting, name) => hello(
      name = name.reverse,
      greeting = greeting,
    )
  }
}
