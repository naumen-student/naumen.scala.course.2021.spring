object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[A >: T <: Animal](animal: A): Shelter[A] = Shelter(animals :+ animal)

    def ++[A >: T <: Animal](shelter: Shelter[A]): Shelter[A] = Shelter(animals ++ shelter.animals)

    def getNames: List[String] = animals.map(_.name)

    def feed(food: Food[T]): List[String] = animals.map(animal => food.feed(animal))
  }
  
  trait Food[-T <: Animal] {
    val foodName: String
    def feed(animal: T) = s"${animal.name} eats ${foodName}"
  }

  case object Meat extends Food[Animal] {
    override val foodName: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override val foodName: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override val foodName: String = "bread"
  }
}

