object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {

    def + [TAnimal >: T <: Animal](animal: TAnimal): Shelter[TAnimal] = Shelter(animals :+ animal)

    def ++ [TShelter >: T <: Animal](shelter: Shelter[TShelter]): Shelter[TShelter] = Shelter(animals ++ shelter.animals)

    def getNames(): List[String] = animals.map(x => x.name)

    def feed(food: Food[T]): List[String] = animals.map(x => food.feed(x))
  }



  trait Food[-TAnimal <: Animal] {
    def feed(animal: TAnimal): String
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal): String = s"${animal.name} eats meat"
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat): String = s"${animal.name} eats milk"
  }

  case object Bread extends Food[Dog] {
    override def feed(animal: Dog): String = s"${animal.name} eats bread"
  }
}
