object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {

    def +[A >: T <: Animal](animal: A): Shelter[A] = Shelter(animals :+ animal)

    def ++[A >: T <: Animal](shelter: Shelter[A]): Shelter[A] = Shelter(animals ++ shelter.animals)

    def getNames: List[String] = animals.map(animal => animal.name)

    def feed(food: Food[T]): List[String] = animals.map(animal => food.feed(animal))
  }



  trait Food[-T <: Animal] {
    def name: String

    def feed(animal: T): String = String.format("%s eats %s", animal.name, this.name.toLowerCase)
  }

  case object Meat extends Food[Animal] {
    override def name: String = "Meat"
  }

  case object Milk extends Food[Cat] {
    override def name: String = "Milk"
  }

  case object Bread extends Food[Dog] {
    override def name: String = "Bread"
  }
}
