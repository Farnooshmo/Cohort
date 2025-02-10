package Week2.Monday.Family

object FamilyLogic extends App {

  //Everytime we make a new instance of a class using the keyword new, we are making an object.
  new Child("Alice") //1 use
  val chid1 = new Child("Alice") // reuse because I can call it with the val
  val chid2 = new Child("Alice") // reuse because I can call it with the val
  println( "Is child1 and 2 the same?" + (chid1 == chid2)) //false they are two different object and each is a new object in memory.





   println(chid1.forename)
   println(chid1.under18)
//   println(child1.idPlease)
  /// cannot access because the method is private in the Child class

val Nick = new Child("Nick")

  ///
   val adult1: Adult = Adult.apply(new Forename("Farnoosh"), new Surname("Mo")) //with apply method
   val adult2: Adult =new Adult(new Forename("Farnoosh"), new Surname("Moayeri")) //without apply method
  println(adult1.forename)// accessing inside the Forename class to get to the string
   println(adult1.forename.name)// accessing the class level of Forename

  val dog1: Dog = Dog.apply(new Name("Ster"), new Breed("Golden"), new Age(7))
  val dog2: Dog = Dog.apply(new Name("Rafi"), new Breed("Golden"), new Age(8))
  println(dog1.name.name)
  println(dog2.age.age)

}
