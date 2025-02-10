package Week2.Monday.Family

class Name(val name: String)
class Breed(val breed: String)
class Age(val age: Int)
// (val forename: Forename, val surname: Surname)
class Dog (val name: Name, val breed: Breed, val age: Age) {
val hasFur: Boolean = true
}
object Dog {
  def apply(name: Name, breed: Breed, age: Age) : Dog = new Dog(name, breed, age)
}