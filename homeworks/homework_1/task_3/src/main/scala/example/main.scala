package example

object main extends App{
  val name:String = "Masyutin Danil"
  val revname:String = name.reverse
  val greetings = Seq("Hello", "Guten tag", "Halo")

  def helloStr(h: String, n: String): Unit = {
  println(h + " Scala! This is " + n)
  }

  def hello(g: Seq[String]): Any = {
  if (g.nonEmpty) {
    val hi = g.head
    helloStr(hi, name)
    helloStr(hi, revname)
    hello(g.tail)
    }
  }

  hello(greetings)
}
