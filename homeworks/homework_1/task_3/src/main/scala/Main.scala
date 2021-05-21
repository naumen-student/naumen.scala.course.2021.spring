object Main extends  App {
  val greetings: List[String] = List("Hello", "Aloha", "Guten Abend")
  val names: List[String] = List("Evgeniy", "Evgeniy".reverse)
  for{
    name <- names
    greeting <- greetings
  } println(greeting + " Scala! This is " + name)
}
