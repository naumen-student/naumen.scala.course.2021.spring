import scala.collection.immutable.List


object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](list : List[T])
  {
    def +[U >: T <: Animal](animal: U): Shelter[U] = {
      Shelter(animal :: list)
    }

    def ++[U >: T <: Animal](shelter: Shelter[U]): Shelter[U] = {
      Shelter(list ::: shelter.list)
    }

    def getNames: List[String] = {
      list.map(_.name)
    }

    def feed(food: Food[T]): List[String] = list.map(food.feed)
  }



  trait Food[-T]{
      def feed(animal: T): String
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal): String =
    {
      animal.name + " eats meat"
    }
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat): String =
    {
      animal.name + " eats milk"
    }
  }

  case object Bread extends Food[Dog] {
    override def feed(animal: Dog): String =
    {
      animal.name + " eats bread"
    }
  }
}
