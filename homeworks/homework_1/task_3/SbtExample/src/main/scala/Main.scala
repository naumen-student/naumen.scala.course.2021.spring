object Main extends App{
  var name = "Ivashkin Roman"

  def hello(hi: String, name: String): Unit = println(s"$hi Scala! This is $name")
  hello("Hello", name)

  var helloList = List("Hello", "Hi", "Aloha", "Hola", "Good morning")
  helloList.foreach(hi => hello(hi, name))

  helloList.foreach(hi => hello(hi, name.reverse))
}
