package example

object Main extends App{
  var s = " Scala! This is ";
  var names = Array("Konstantin","nitnatsnoK");
  var hiWords = Array("Hi","Guten tag","Hola");

  hiWords.foreach(x => names.foreach(y => println(x + s + y)));
}
