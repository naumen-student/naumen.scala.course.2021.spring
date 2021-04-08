object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[A >: T <: Animal](animal: A) = Shelter(animals :+ animal)

    def ++[A >: T <: Animal](shelter: Shelter[A]) = Shelter(animals ++ shelter.animals)

    def getNames: List[String] = animals.map(a => a.name)
  }



  trait Food ...

  case object Meat extends Food[Animal] ...

  case object Milk extends Food[Cat] ...

  case object Bread extends Food[Dog] ...
}
