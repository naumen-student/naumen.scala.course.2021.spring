object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+T <: Animal](list_animals: List[T]){
    def +[A >: T <: Animal](new_animal: A): Shelter[A] = Shelter[A](list_animals:+new_animal)
    def ++[A >: T <: Animal](new_animals: Shelter[A]): Shelter[A] = Shelter[A](list_animals++:new_animals.list_animals)
    def getNames: List[String] = list_animals.map(animal => animal.name)
    def feed(food: Food[T]): List[String] = list_animals.map(animal => food.feed(animal))
  }



  trait Food[-T <: Animal] {
    def name: String
    def feed(animal: T): String = s"${animal.name} eats ${this.name}"
  }

  case object Meat extends Food[Animal]{
    override def name: String = "meat"
  }

  case object Milk extends Food[Cat]{
    override def name: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override def name: String = "bread"
  }
}
