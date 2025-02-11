package Week2.Monday.PMTask

class Animal(val name: String, val age:Int) extends AnimalBiologicalTraits with Species
object Animal {
  def apply(name:String, age:Int): Animal = new Animal(name, age)
}
