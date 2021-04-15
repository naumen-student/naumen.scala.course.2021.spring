object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+TCurrentAnimal <: Animal](animals: List[TCurrentAnimal] = List[TCurrentAnimal]()) {
    def +[TNewAnimal >: TCurrentAnimal <: Animal](animal: TNewAnimal): Shelter[TNewAnimal] = {
      Shelter(animals :+ animal)
    }

    def ++[TNewAnimal >: TCurrentAnimal <: Animal](shelter: Shelter[TNewAnimal]): Shelter[TNewAnimal] = {
      Shelter(animals ::: shelter.animals)
    }

    def getNames: List[String] = {
      animals.map(_.name)
    }

    def feed(food: Food[TCurrentAnimal]): List[String] = {
      animals.map(food.feed)
    }
  }

  trait Food[-TAnimal <: Animal] {
    val foodName: String

    def feed(animal: TAnimal): String = {
      s"${animal.name} eats $foodName"
    }
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
