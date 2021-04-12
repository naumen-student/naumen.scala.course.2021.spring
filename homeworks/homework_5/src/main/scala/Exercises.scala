object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+T <: Animal](list : List[T]) {
    val animals : List[T] = list

    def getNames: List[String] = {
      for (animal <- animals)
        yield animal.name
    }

     def +[A >: T <: Animal](animal: A) : Shelter[A] = {
        Shelter(animal :: animals)
    }

    def ++[A >: T <: Animal](other: Shelter[A]) : Shelter[A] = {
      Shelter(animals ::: other.animals)
    }

    def feed[F >: T <: Animal](food : Food[F]) : List[String] = {
      for (animal <- animals)
        yield food.feed(animal)
    }

  }



  trait Food[T <: Animal] {
    def foodName: String

    def feed(animal: T): String = {
     animal.name + " eats " +  this.foodName
    }
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
