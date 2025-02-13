package Week2.Monday.PMTask

class Animal (name:String, age:Int) {
def read: String = s"$name is $age years old."
}
object Animal {
  def apply(name:String, age:Int):Animal = new Animal (name, age)
}
