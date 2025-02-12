package Week2.Tuesday.MVP

import Week2.Tuesday.MVP.Extension.Language

object Extension extends App {

//1
case class Language (language: String, questionNumber: Int, isOOP: Boolean)
  case object BasicLanguage //special type of extension
  //2
  val firstLanguage: Language = Language("Scala",3, true)
  val secondLanguage =  Language("Java",3, true)
  val thirdLanguage =  Language("JavaScript",7, false)
  //3
val fourthLanguage = firstLanguage.copy(language = "Ruby")
  val fifthLanguage = secondLanguage.copy(questionNumber = 10)
  val sixthLanguage  = thirdLanguage.copy(isOOP = true)
  println(fourthLanguage)
  println(fifthLanguage)
  println(sixthLanguage)
  //4
  println(fourthLanguage.toString)
  println(fifthLanguage.toString)
  println(sixthLanguage.toString)
//5
  println("(firstLanguage equals secondLanguage): " + (firstLanguage.equals(secondLanguage)))
  println("(firstLanguage equals thirdLanguage): " + (firstLanguage.equals(thirdLanguage)))
  println("(firstLanguage equals fourthLanguage): " + (firstLanguage.equals(fourthLanguage)))
  println("(firstLanguage equals fifthLanguage): " + (firstLanguage.equals(fifthLanguage)))
  println("(firstLanguage equals sixthLanguage): " + (firstLanguage.equals(sixthLanguage)))
  println("(secondLanguage equals thirdLanguage): " + (secondLanguage.equals(thirdLanguage)))
  println("(secondLanguage equals fourthLanguage): " + (secondLanguage.equals(fourthLanguage)))
  println("(secondLanguage equals thirdLanguage): " + (secondLanguage.equals(fifthLanguage)))
  println("(secondLanguage equals sixthLanguage): " + (secondLanguage.equals(sixthLanguage)))
  println("(thirdLanguage equals fourthLanguage): " + (secondLanguage.equals(fourthLanguage)))
  println("(thirdLanguage equals fifthLanguage): " + (secondLanguage.equals(fifthLanguage)))
  println("(thirdLanguage equals sixthLanguage): " + (secondLanguage.equals(sixthLanguage)))
  println("(fourthLanguage equals fifthLanguage): " + (fourthLanguage.equals(fifthLanguage)))
  println("(fourthLanguage equals sixthLanguage): " + (fourthLanguage.equals(sixthLanguage)))
  println("(fifthLanguage equals sixthLanguage): " + (fifthLanguage.equals(sixthLanguage)))

}
