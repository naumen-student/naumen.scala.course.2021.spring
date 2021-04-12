object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[A >: T <: Animal] (animal: A): Shelter[A] = Shelter(animals :+ animal)
    def ++[A >: T <: Animal](anotherShelter: Shelter[A]): Shelter[A] = Shelter(animals ++ anotherShelter.animals)
    def getNames: List[String] = animals.map(animal => animal.name)
    def feed(food: Food[T]): List[String] = animals.map(animal => food.feed(animal))
  }



  trait Food[-T <: Animal] {
    val name: String
    def feed(animal: T): String = s"${animal.name} eats $name"
  }

  case object Meat extends Food[Animal] {
    override val name: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override val name: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override val name: String = "bread"
  }
}
