package example

object Main extends App {
  var z = new Array[String](3)
  z = Array("Hello", "Hola", "Guten tag")
  var x = new Array[String](2)
  x = Array("Ann Ivanova", "avonavI nnA")
  for (i <- z;
       j <- x) println(i + " Scala! This is " + j)
}