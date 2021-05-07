object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal
  case class Dog(override val name: String) extends Animal

  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[A >: T <: Animal](animal: A): Shelter[A] = this.copy(animals :+ animal)
    def ++[A >: T <: Animal](shelter: Shelter[A]): Shelter[A] = this.copy(animals ++ shelter.animals)
    def getNames: List[String] = animals.map(e => e.name)
    def feed[A >: T <: Animal](food: Food[A]): List[String] = animals.map(food.feed)
  }

  trait Food[-T <: Animal] {
    def feed(animal: T): String = s"${animal.name} eats ${this.toString.toLowerCase()}"
  }

  case object Meat extends Food[Animal]
  case object Milk extends Food[Cat]
  case object Bread extends Food[Dog]
}
