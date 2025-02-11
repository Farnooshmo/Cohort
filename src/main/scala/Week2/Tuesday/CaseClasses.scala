//package Week2.Tuesday
//
//object CaseClasses extends App {
//  //Standard Class
//  //  class SuperHero(val realName : String, val heroName:String, val weakness: String)
//  //new SuperHero("Clark Kent", "Superman", "Kryptonite")// made a new SuperHero object from the SuperHero class.
//  // Case class
//  case class SuperHero(realName: String, heroName: String, weakness: String)
//
//  //each parameter is val by default
//  val superMan = SuperHero.apply("Clark Kent", "Superman", "Kryptonite") // the .apply method is built in. this is an Object made using the SuperHero case class..
//  val superMan2 = SuperHero("Clark Kent", "Superman", "Kryptonite")// scala is clever enough to know ti use  .app;y without us telling it to.
//  println(superMan == superMan2) // true - compares the field values not the object reference/memory location(like classes)
//
//  //.copy methods
//  val copiedSuperman = superMan.copy(weakness = "gravity") // make a new val, it is not the original
//  println(copiedSuperman.weakness)
//  println(superMan.weakness) //original is not being reassigned.
//  val updatedName = superMan.copy(realName = "Andy Probert", weakness = "pints")
//  println(updatedName.realName + updatedName.weakness)
//
//  //task
//  println("\n Task \n")
//  //1
//  //Create a dof case class with parameters of name and age.
//  case class Dog(name: String, breed: String, age:Int)
//  //2
//  //Create 4 dog objects
//  val dog1 = Dog.apply("Ster", "Golden retriever", 7)
//  val dog2 = Dog.apply("Rafi", "Golden retriever", 7)
//  val dog3 = Dog.apply("Louna", "Chow Chow", 6)
//  val dog4 = Dog.apply("Sib", "Border Collie", 2)
//
//  //3
//  // then create a kennel case class with parameters of name and then a list of the dog case class.
//  case class Kennel(name:String, dogs: List[Dog])
//  //4 make a new object and add your dogs(q2)
//  val dogs : List[Dog] = List(dog1, dog2, dog3, dog4)
//  val sydneyKennel = Kennel("Sydney Kennel", dogs)
//println(sydneyKennel)
//
////5 The kennet that you have set up want to change its name but keep the dogs . use the case class copy method.
//  val renameKennel= sydneyKennel.copy(name = "sydneyKennel & friends")
//  println(renameKennel)
//// Extension
//  //A The kennel wants to expand to accept cats and birds as well.Update the kennel case class. Create a bird and cat case class using some creative parameters.
//
//  case class Cat(name: String, breed: String, age:Int)
//  val cats: List[Cat] = List()
//  case class Bird(name: String, species: String, wingSpan: Int)
//  val birds : List[Bird]= List()
//
//  //B The kennel often gets a new dog/cat/bird joining.Add one of each to the kennel.(Go back to the collections lesson where we were adding to the list!)
//
//  case class UpdatedKennel(name:String, dogs:List[Dog], cats:List[Cat], birds:List[Bird]) {
//    def addDog(dog:Dog): UpdatedKennel = {
//      UpdatedKennel( name, dogs:+ dogs, cats, birds)
//    }
//    def addCat(cat: Cat):UpdatedKennel = {
//      UpdatedKennel(name, dogs, cats :+ cats, birds)
//    }
//    def addBird(bird: Bird):UpdatedKennel = {
//      UpdatedKennel(name, dogs, cats, birds :+ birds)
//    }
//  }
//
//  val sydneyKennel1 = UpdatedKennel("Sydney Kennel", dogs, cats, birds)
//  println(sydneyKennel1)
//  val renamedYedneyKennel1 = sydneyKennel1.copy(name = "L& Friends")
//  println(renamedYedneyKennel1)
//  val addDogCatBird = renamedYedneyKennel1.addDog(Dog ("toto", "Caty", 10)).addCat(Cat("Garfield", "Persian", 5)).addBird(Bird("Hedwig", "Snowy", 6))
//  println(addDogCatBird)
//
//
//} //it needs another look why it does not work!
object CaseClasses extends App {

  // Standard Class
  //  class SuperHero(val realName: String, val heroName:String, val weakness: String)
  //  new SuperHero("Clark Kent", "Superman", "Kryptonite") //made a new SuperHero object from the SuperHero class.

  //Case class
  case class SuperHero(realName: String, heroName: String, weakness: String) //each parameter is a val by default.

  val superMan = SuperHero.apply("Clark Kent", "Superman", "Kryptonite") //.apply method is built in. Object made using the SuperHero case class.
  val superMan3 = SuperHero("Clark Kent", "Superman", "Kryptonite") // Scala is clever enough to know to use .apply without us telling it to.
  val superMan2 = SuperHero.apply("Clark Kent", "Superman", "Kryptonite")
  println(superMan == superMan2) //true - compares the field values not the object reference/memory location (like classes).

  // .copy method
  val copiedSuperman = superMan.copy(weakness = "gravity") //Make a new val! Not mutating the original.
  println(copiedSuperman.weakness)
  println(superMan.weakness) //Original is not being reassigned.
  val updatedName = superMan.copy(realName = "Andy Probert", weakness = "pints")
  println(updatedName.realName + updatedName.weakness)

  //TASK
  println("\nTask\n")
  //1.
  case class Dog(name: String, breed: String, age:Int)
  //2.
  val loki = Dog("Loki", "collie X", 5)
  val marley = Dog("Marley", "lab", 4)
  val scoobyDoo = Dog("Scooby Doo", "Great Dane", 2)
  val lassie = Dog("Lassie", "Rough Collie", 7)
  //3.
  case class Kennel(name: String, dogs: List[Dog])
  //4.
  val dogs: List[Dog] = List(loki, marley, scoobyDoo, lassie)
  val sydneyKennel = Kennel("Sydney Kennel", dogs)
  println(sydneyKennel)
  //5.
  val renamedSydneyKennel = sydneyKennel.copy(name = "Loki & friends")
  println(renamedSydneyKennel)
  //Extension A and B.
  case class Cat(name: String, breed: String, age: Int)
  val cats: List[Cat] = List()
  case class Bird(name: String, species: String, wingSpan: Int)
  val birds: List[Bird] = List()
  case class updatedKennel(name: String, dogs: List[Dog], cats: List[Cat], birds: List[Bird]) {
    def addDog (dog: Dog) : updatedKennel = {
      updatedKennel(name, dogs:+ dog, cats, birds)
    }
    def addCat(cat: Cat): updatedKennel = {
      updatedKennel(name, dogs, cats :+ cat, birds)
    }
    def addBird(bird: Bird): updatedKennel = {
      updatedKennel(name, dogs, cats, birds :+ bird)
    }
  }
  val sydneyKennel1 = updatedKennel("Sydney Kennel", dogs, cats, birds)
  println(sydneyKennel)
  val renamedSydneyKennel1 = sydneyKennel1.copy(name = "Loki & friends")
  println(renamedSydneyKennel)
  val addDogCatBird = renamedSydneyKennel1.addDog(Dog ("Toto", "Cairn Terrier", 10)).addCat(Cat("Garfield", "Persian", 5)).addBird(Bird("Hedwig","Snowy", 60))
  println(addDogCatBird)



}
