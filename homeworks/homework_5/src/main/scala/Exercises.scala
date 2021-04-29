object Exercises {

    trait Animal {
        def name: String
    }

    trait Food[-T <: Animal] {
        def feed(animal: T): String = s"${animal.name} eats $name"

        def name: String
    }

    case class Cat(override val name: String) extends Animal

    case class Dog(override val name: String) extends Animal

    case class Shelter[+T <: Animal](animals: List[T]) {

        def +[TOther >: T <: Animal](animal: TOther): Shelter[TOther] = Shelter(animals.:+(animal))

        def ++[TOther >: T <: Animal](shelter: Shelter[TOther]): Shelter[TOther] = Shelter(animals.++(shelter.animals))

        def getNames: List[String] = animals.map(x => x.name)

        def feed(food: Food[T]): List[String] = animals.map(x => food.feed(x))
    }

    case object Meat extends Food[Animal] {
        override def name: String = "meat"
    }

    case object Milk extends Food[Cat] {
        override def name: String = "milk"
    }

    case object Bread extends Food[Dog] {
        override def name: String = "bread"
    }
}
