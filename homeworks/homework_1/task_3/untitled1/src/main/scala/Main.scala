object Main extends App {
  val text = "Hello, Scala! This is Anna Eleeva"
  val name = "Anna Eleeva"
  println(text)
  println(name)
  println(text.replace("Hello", "Hi"))
  val name_reversed = name.reverse
  println(text.replace(name, name_reversed))
  println(text.replace(name, name_reversed).replace("Hello", "Gutten Tag"))
}