package example

object Main extends App {
  val meetings = List("Hello", "Hola", "Guten tag")
  val name = "Margarita Levinskikh"
  val middle = " Scala! This is "


  def buildMeeting(meeting : String, name : String) : String = meeting + " Scala! This is " + name

  def main() : Unit ={
    for (name <- List(name, name.reverse)) {
      for (meeting <- meetings)  {
        println(buildMeeting(meeting, name))
      }
    }
  }

  main()
}