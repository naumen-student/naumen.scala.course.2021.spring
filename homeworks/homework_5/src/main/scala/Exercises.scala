object Exercises {

  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal
  case class Dog(override val name: String) extends Animal

  case class Shelter[+A <: Animal](animals: List[A]) {
    def +[B >: A <: Animal](animal: B): Shelter[B] =
      Shelter(animal :: animals)

    def ++[B >: A <: Animal](otherShelter: Shelter[B]): Shelter[B] =
      Shelter(animals ::: otherShelter.animals)

    def getNames: List[String] =
      animals.map(_.name)

    def feed(food: Food[A]): List[String] =
      animals.map(food.feed)
  }

  trait Food[-A <: Animal] {
    def feed(animal: A): String
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal): String =
      s"${animal.name} eats meat"
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat): String =
      s"${animal.name} eats milk"
  }

  case object Bread extends Food[Dog] {
    override def feed(animal: Dog): String =
      s"${animal.name} eats bread"
  }
}
