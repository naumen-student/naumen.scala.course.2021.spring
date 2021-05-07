object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[T1 >: T <: Animal](animal: T1): Shelter[T1] = {
      ++(Shelter(List(animal)))
    }

    def ++[T1 >: T <: Animal](newShelter: Shelter[T1]): Shelter[T1] = {
      Shelter(animals ++ newShelter.animals)
    }

    def getNames: List[String] = {
      animals.map(animal => animal.name)
    }

    def feed[T1 >: T <: Animal](food: Food[T1]): List[String] = {
      animals.map(animal => food.feed(animal))
    }
  }



  trait Food[T <: Animal] {
    def name: String
    def feed[T1 >: T <: Animal](animal: T1): String = {
      val animalName = animal.name
      s"$animalName eats $name"
    }
  }

  case object Meat extends Food[Animal] {
    def name = "meat"
  }

  case object Milk extends Food[Cat] {
    def name = "milk"

  }

  case object Bread extends Food[Dog] {
    def name = "bread"
  }
}
