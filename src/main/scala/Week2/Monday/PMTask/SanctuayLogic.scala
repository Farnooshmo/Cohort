package Week2.Monday.PMTask

object SanctuayLogic extends App {

  val goat: Animal = new Animal("goat", 4) with furColour with Mammal with Bird with Insect
  println(goat.name)
  println(goat.age)

}


