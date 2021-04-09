object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+A <: Animal](animals: List[A]){
      def +[B >: A <: Animal](addAnimal: B): Shelter[B] = Shelter(addAnimal :: animals)
      def ++[B >: A <: Animal](addShelter: Shelter[B]): Shelter[B] = Shelter(addShelter.animals ::: animals)
      def getNames: List[String] = animals.map(_.name)
      def feed[FoodType <: Food[A]](food: Food[A]): List[String] = animals.map(food.feed)
  }



  trait Food[-A <: Animal] {
    val FoodName: String
    def feed(animal: A): String = animal.name + " eats " + FoodName
  }

  case object Meat extends Food[Animal] {
    val FoodName: String = "meat"
  }

  case object Milk extends Food[Cat] {
    val FoodName: String = "milk"
  }

  case object Bread extends Food[Dog] {
    val FoodName: String = "bread"
  }
}
