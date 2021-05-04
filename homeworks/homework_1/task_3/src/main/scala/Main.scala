object Main extends App {
    val name = " Niktia"
    val greetings = List("Hello", "Hola", "Guten tag")

    def greet(greetings: List[String], name: String): Unit = {
        greetings.foreach(greeting => println(greeting + " Scala! This is " + name))
    }

    greet(greetings, name)
    println()
    greet(greetings, name.reverse)
}
