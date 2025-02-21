package Week3.Thursday.mvp

import java.time.{LocalDate, LocalDateTime, MonthDay}
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
  //Person:
  //   fullName: String //required
  //   dateOfBirth: Date //required
  //   occupation: String //optional
  //   lastCountryLivedIn:String //required
  //   dateOfDeath: Date //optional
  //   age: Int //required //False
  //   starSign: String //required //False
  //   ageAtDeath: String //optional (if dateOfDeath is present -> //required) //False

  // Star sign
//  val starSign: MonthDay =
  // case March 21 - April 19 => println("Aries")
  // case April 2 - May 20 => println("Taurus")
  // case May 21 - Jun 21 => println("Gemini")
  // case June 22 - July 22 => println("Cancer")
  // case July 23 - August 22 => println("Leo")
  // case August 23 - September 22 => println("Virgo")
  // case September 23 - October 23 => println("Libra")
  // case October 24 - November 21 => println("Scorpio")
  // case November 22 - December 21 => println("Sagittarius")
  // case December 22 - January 19 => println("Capricorn")
  // case January 20 - February 18 => println("Aquarius")
  // case February 19 - March 20 => println("Pisces")

  //LocalDateTime. now() // current date to calculate the age
      val currentDateTime: LocalDateTime = LocalDateTime.now()
      println("Local Time: " + currentDateTime)
//  val age: Int = currentDateTime



  case class Person(fullName: String, dateOfBirth: Date, occupation: String, lastCountryLivedIn:String, dateOfDeath: Date, age: Int, starSign: String, ageAtDeath: String)

//  case class Person (inputPerson: Option[String])
//  case class InputPerson(fullName: String, dateOfBirth: Date, occupation: String, lastCountryLivedIn:String, dateOfDeath: Date)
//  val inputPerson : Person = Person("Alec",(1900-03-02),"Scientist","Angola",(2000-02-05))
//  def createPerson(person: Person): String = {
//    person.inputPerson.getOrElse()
//
  }

















