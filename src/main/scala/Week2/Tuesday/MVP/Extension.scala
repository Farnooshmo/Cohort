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
  val seventhLanguage  = thirdLanguage.copy(isOOP = true)
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

  //Research
  //1
  //.getClass
  println(firstLanguage.getClass) // prints class Week2.Tuesday.MVP.Extension$Language
  //.canEqual
  println(firstLanguage.canEqual(sixthLanguage))// print true because sixthLanguage is an instance of Language
  //.hashCode
  println(fourthLanguage.hashCode)//print 1748642984 Return the hash code for the object
  //.productArity
  println(fourthLanguage.productArity) // prints 3, it returns the number of parameters. In this case fourthLanguage has 3 parameters
  //.productElement ❤️
  println(fourthLanguage.productElement(2))// prints true! Retrieve the value of the nth field of the case class.
  //.productIterator
  fourthLanguage.productIterator //? what it does?
  //.productPrefix
  println(fourthLanguage.productPrefix) // print Language. Return the name of the case class as a string.
  //.unapply

//2
  //Difference between “.equals” and “.==”
  //I did not find anything related to “.==”, assume it was a typo.but about “==”, You normally use ==, it routes to equals, except that it treats nulls properly. Reference equality (rarely used) is eq.
}
