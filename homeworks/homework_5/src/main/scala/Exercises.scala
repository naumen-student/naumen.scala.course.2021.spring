object Exercises  {

  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter [+T <: Animal](pets: List[Animal]){

    def + [A<:Animal](value2: A):Shelter[A] = {
      Shelter (value2 +: pets)
    }

    def ++ [A<:Animal] (value2: Shelter[A]):Shelter[A] = {
      Shelter (pets:::value2.pets)
    }

    def getNames: List[String] = pets.map(_.name)

    def feed[B >: T <: Animal](food: Food[B]): List[String] = {
      pets.map(x => s"${x.name} eats ${food.toString.toLowerCase()}")
    }
  }

  trait Food [-eater<:Animal]

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]

}