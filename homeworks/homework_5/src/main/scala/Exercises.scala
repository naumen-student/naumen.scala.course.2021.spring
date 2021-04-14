object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+TAnimal <: Animal](val animals: List[TAnimal]) {
    def +[TOther >: TAnimal <: Animal](animal: TOther): Shelter[TOther] =
      Shelter(animals :+ animal)

    def ++[TOther >: TAnimal <: Animal](other: Shelter[TOther]): Shelter[TOther] =
      Shelter(animals ++ other.animals)

    def getNames: List[String] = animals.map(_.name)



    def feed(food: Food[TAnimal]): List[String] = animals.map(food.feed)
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
