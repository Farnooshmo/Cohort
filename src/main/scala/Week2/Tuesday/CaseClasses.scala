package Week2.Tuesday

object CaseClasses extends App {
  //Standard Class
  //  class SuperHero(val realName : String, val heroName:String, val weakness: String)
  //new SuperHero("Clark Kent", "Superman", "Kryptonite")// made a new SuperHero object from the SuperHero class.
  // Case class
  case class SuperHero(realName: String, heroName: String, weakness: String)

  //each parameter is val by default
  val superMan = SuperHero.apply("Clark Kent", "Superman", "Kryptonite") // the .apply method is built in. this is an Object made using the SuperHero case class..
  val superMan2 = SuperHero("Clark Kent", "Superman", "Kryptonite")// scala is clever enough to know ti use  .app;y without us telling it to.
  println(superMan == superMan2) // true - compares the field values not the object reference/memory location(like classes)

  //.copy methods
  val copiedSuperman = superMan.copy(weakness = "gravity") // make a new val, it is not the original
  println(copiedSuperman.weakness)
  println(superMan.weakness) //original is not being reassigned.
  val updatedName = superMan.copy(realName = "Andy Probert", weakness = "pints")
  println(updatedName.realName + updatedName.weakness)

  //task
  println("\n Task \n")

  case class Dog(name:String, breed: String, age:Int)
  val dog1 = Dog.apply("Ster", "Golden retriever", 7)
  val dog2 = Dog.apply("Rafi", "Golden retriever", 7)
  val dog3 = Dog.apply("Louna", "Chow Chow", 6)
  val dog4 = Dog.apply("Sib", "Border Collie", 2)
  println(dog4.age)
  println(dog3.breed)

  case class Kennel(name:String, dogs: List[Dog])


// not completed!!!!!!!!!!!!!!!

}
