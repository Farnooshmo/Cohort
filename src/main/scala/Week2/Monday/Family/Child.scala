package Week2.Monday.Family

class Child (val forename: String) {//() - class parameters { - body of the class. All the logic goes in the body,
  val under18: Boolean = true
  private def idPlease: String = "Can I see your Id?"
//   private def idPlease: String = "Can I see your Id?" private - reduce the scope access. you can check the FamilyLogic
// only van ve called within the class body.
}

//Companion object  **** Access the companion classes private methods
object Child {
  def apply(forename: String): Child = new Child(forename)//short hand it make new instances of your class.
  //Access the companion classes private methods: you can see it in below that, idPlease is accessible however it is private in line 5!

  val bob = Child.apply("Bob")
  println(bob.idPlease)
}