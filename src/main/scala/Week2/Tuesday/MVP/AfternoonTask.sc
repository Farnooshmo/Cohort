//1 What are three main differences between a class and a case class?
/**
 * In case class, you don’t have to use the new keyword to create a new instance, as apply method is built in, but in class you need to create a new instance.
 * In case class, there is no need for adding val to fields, but in class, it needs to declare val to insure immutability.
 * Case class provide methods such ad toString, equal, hashCode and copy by default, but a regular class does not provide these methods unless explicitly overridden.
 */
//2
//a
case class Person(name: String, age: Int, nationality: String, isStudent: Boolean) //case class declaration!
//b
val firstPerson = new Person("Carlos", 23, "Spanish", true)//case class does not need a new, but it runs.
//c
val secondPerson = Person("Carlos", 23, "Spanish", true)//instantiation case class
//d
val thirdPerson = Person("Chloe", 25, "British", false)//instantiation case class
//e
class Animal(name: String, colour: String, pet: Boolean)//class
//f
//val cat = Animal("cat", "black", true) // regular class needs new.
//g
val dog = new Animal("dog", "white", true)//it works

//3
 case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)
//b)
val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
//c)
val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
//d)
val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
//e)
val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
//f)
val oneMoreChocolateMuffin = Muffin("Chocolate", 3.50, "Mercator Bakery")
//g
val finalChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")
println("Testing:")
println("Starting with chocolateMuffin")
println("b ==c (chocolateMuffin == blueberryMuffin): " + (chocolateMuffin == blueberryMuffin))// false
println("b ==d (chocolateMuffin == vanillaMuffin): " + (chocolateMuffin == vanillaMuffin))//false
println("b ==e (chocolateMuffin == anotherChocolateMuffin): " + (chocolateMuffin == anotherChocolateMuffin))//true
println("b ==f (chocolateMuffin == oneMoreChocolateMuffin): " + (chocolateMuffin == oneMoreChocolateMuffin))//false
println("b ==f (chocolateMuffin == finalChocolateMuffin): " + (chocolateMuffin ==  finalChocolateMuffin))//false
println("Testing with blueberryMuffin")
println("c == d (blueberryMuffin == vanillaMuffin): " + (blueberryMuffin == vanillaMuffin))//false
println("c == e (blueberryMuffin == anotherChocolateMuffin): " + (blueberryMuffin == anotherChocolateMuffin))//false
println("c == f (blueberryMuffin == oneMoreChocolateMuffin): " + (blueberryMuffin == oneMoreChocolateMuffin))//false
println("c == g (blueberryMuffin == finalChocolateMuffin): " + (blueberryMuffin == finalChocolateMuffin))//false
println("Testing with vanillaMuffin")
println("d == e (vanillaMuffin == anotherChocolateMuffin): " + (vanillaMuffin == anotherChocolateMuffin))//false
println("d == f (vanillaMuffin == oneMoreChocolateMuffin): " + (vanillaMuffin == oneMoreChocolateMuffin))//false
println("d == g (vanillaMuffin == finalChocolateMuffin): " + (vanillaMuffin ==  finalChocolateMuffin))//false
println("Testing with anotherChocolateMuffin")
println("e == f anotherChocolateMuffin == anotherChocolateMuffin): " + (anotherChocolateMuffin == oneMoreChocolateMuffin))//false
println("e == g anotherChocolateMuffin == finalChocolateMuffin): " + (anotherChocolateMuffin == finalChocolateMuffin))//false
println("Testing with oneMoreChocolateMuffin")
println("f == g oneMoreChocolateMuffin == finalChocolateMuffin): " + (oneMoreChocolateMuffin == finalChocolateMuffin))//false




