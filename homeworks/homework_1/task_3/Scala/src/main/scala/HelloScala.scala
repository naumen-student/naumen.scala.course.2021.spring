object HelloScala extends App {
  def hello(
             name: String,
             greetings: Array[String]
           ): Unit = {
    greetings.foreach( greeting => println(greeting + " Scala! This is " + name))
  }

  val name = "Ars"
  val greetings = Array("Hello", "Halo", "Guten tag")

  hello(name, greetings)
  hello(name.reverse, greetings)
}
