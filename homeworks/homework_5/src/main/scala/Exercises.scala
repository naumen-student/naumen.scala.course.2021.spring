object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+A <: Animal] (animals: List[A]) {
    def +[B >: A <: Animal](animal: B): Shelter[B] = Shelter(animal :: animals)
    def ++[B >: A <: Animal](other: Shelter[B]): Shelter[B] = Shelter(animals ::: other.animals)
    def getNames: List[String] = animals.map(animal => animal.name)
    def feed[B >: A <: Animal](food: Food[B]): List[String] = animals.map(animal => food.feed(animal))
  }

  trait Food[A <: Animal] {
    def feed[B <: A](animal: B): String = s"${animal.name} eats ${this.toString.toLowerCase}"
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]
}