object Exercises {

  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+A <: Animal](animals: List[A]) {
    def +[B >: A <: Animal](animal: B): Shelter[B] = Shelter[B](animal +: animals)

    def ++[B >: A <: Animal](shelter: Shelter[B]): Shelter[B] = Shelter[B](animals ::: shelter.animals)

    def getNames: List[String] = animals.map(_.name)

    def feed(food: Food[A]): List[String] = animals.map(food.feed)
  }


  trait Food[-A <: Animal] {
    def feed(animal: A): String = s"${animal.name} eats "
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal): String = super.feed(animal) + "meat"
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat): String = super.feed(animal) + "milk"
  }

  case object Bread extends Food[Dog] {
    override def feed(animal: Dog): String = super.feed(animal) + "bread"
  }

}
