package Week3.Thursday.mvp

import java.util.Date

object MVP extends App {

  //1) Pattern Matching countries without white space around and made it capitalized.
  val country: String = "FRancE "
  val formattingCountryName = country.trim.toLowerCase.capitalize
  formattingCountryName match {
    case "France" => println(s"The capital city of $formattingCountryName is Paris.")
    case "England" => println(s"The capital city of $formattingCountryName is London.")
    case "Belgium" => println(s"The capital city of $formattingCountryName is Brussels.")
    case "Germany" => println(s"The capital city of $formattingCountryName is Berlin")
    case "Netherlands" => println(s"The capital city of $formattingCountryName is Amsterdam")
    case _ => println("Invalid, please chose between France, England, Belgium, Germany and Netherlands!")
  }

  //2)

  sealed trait Animal {
    val name: String

  }

  case class Fish(name: String, fact: String, food:String) extends Animal

  case class Camel(name: String, fact: String) extends Animal

  case class Pigeon(name: String, canFly: Boolean) extends Animal

  val animal: Animal = Fish("shark", "have good eyesight.", "eat fish and small sharks")
//  val anim: Anim = Camel("Camel", " can survive for long period of time without food or water.")
//  val anim: Anim = Pigeon("pigeon", true)
  animal match {
    case Fish(name, fact, food) => println(name + " have good eyesight.")
    case Camel(name, fact) => println(name + " can survive for long period of time without food or water.")
    case Pigeon(name, canFly) => println("Did you know that: "+ name +" can travel up to 500 miles in one day.")
  }

  //3)
//  case class Person(fullName: String, dateOfBirth: Date, occupation: String, lastCountryLivedIn:String, dateOfDeath: Date, age: Int, starSign: String, ageAtDeath: String)

//  case class Person (inputPerson: Option[String])
//  case class InputPerson(fullName: String, dateOfBirth: Date, occupation: String, lastCountryLivedIn:String, dateOfDeath: Date)
//  val inputPerson : Person = Person("Alec",(1900, 1, 21, 1, 0, 0, 0),"Scientist","Angola",(2000, 1, 21, 1, 0, 0, 0))
//  def createPerson(person: Person): String = {
//    person.inputPerson.getOrElse()
//
  }








  //   fullName: String //required
//   dateOfBirth: Date //required
//   occupation: String //optional
//   lastCountryLivedIn:String //required
//   dateOfDeath: Date //optional
//   age: Int //required //False
//   starSign: String //required //False
//   ageAtDeath: String //optional (if dateOfDeath is present -> //required) //False




}

