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
    //def +[U <: Animal](animal: U): Shelter[U] = {
      //if (animal.isInstanceOf[T])
      Shelter(animal :: list)
      //else
        //Shelter(animal.asInstanceOf[Animal] :: list.asInstanceOf[List[Animal]])
    }

    def ++[U >: T <: Animal](shelter: Shelter[U]): Shelter[U] = {
    //def ++[U <: Animal](shelter: Shelter[U]): Shelter[U] = {
      /*if (shelter.isInstanceOf[Shelter[T]])
        Shelter(list ::: shelter.list)
      else
        Shelter(shelter.list.asInstanceOf[List[Animal]] ::: list.asInstanceOf[List[Animal]])*/
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
