object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal
  

  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[S >: T <: Animal](animal: S): Shelter[S] = Shelter(animals :+ animal)

    def ++[S >: T <: Animal](other: Shelter[S]): Shelter[S] = Shelter(animals ++ other.animals)

    def getNames: List[String] = animals.map(_.name)

    def feed(food: Food[T]): List[String] = animals.map(food.feed)
  }


  trait Food[-T <: Animal] {
    def feed(animal: T): String

    protected def getStrFood(name: String, food: String) = s"$name eats $food"
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal): String = getStrFood(animal.name, "meat")
  }

  case object Milk extends Food[Cat] {
    override def feed(cat: Cat): String = getStrFood(cat.name, "milk")
  }

  case object Bread extends Food[Dog] {
    override def feed(dog: Dog): String = getStrFood(dog.name, "bread")
  }
}
