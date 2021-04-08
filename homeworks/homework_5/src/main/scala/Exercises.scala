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

    def feed(food: Food[T]) = animals.map(a => food.feed(a))
  }



  trait Food[-T <: Animal] {
    protected val meal: String

    def feed(animal: T): String = s"${animal.name} eats $meal"
  }

  case object Meat extends Food[Animal] {
    override val meal: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override val meal: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override val meal: String = "bread"
  }
}
