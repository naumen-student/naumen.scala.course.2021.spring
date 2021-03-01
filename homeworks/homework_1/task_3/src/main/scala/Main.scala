 object Main extends App {
   val name = "Aleksey"
   val greeting = List("Hello","Hola","Guten tag")

   println("Hello Scala! This is " + name)

   def printGreeting(greeting: List[String], name: String) : Unit = {
     greeting.foreach(a => println(a + " Scala! This is " + name))
   }

   printGreeting(greeting, name)
   printGreeting(greeting, name.reverse)
 }