object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {

    def getNames: List[String] = animals.map(animal => animal.name)

    def +[R >: T <: Animal](otherAnimal: R): Shelter[R] = new Shelter[R](otherAnimal :: animals)

    def ++[R >: T <: Animal](otherShelter: Shelter[R]): Shelter[R] = new Shelter[R](animals ::: otherShelter.animals)

    def feed[R >: T <: Animal](food: Food[R]) : List[String] = animals.map(animal => food.feed(animal))
  }



  trait Food[T <: Animal] {
    def foodName: String

    def feed[R >: T <: Animal](animal: R) : String = animal.name + " eats " + foodName
  }

  case object Meat extends Food[Animal] {
    override def foodName: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override def foodName: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override def foodName: String = "bread"
  }
}
