package Week4.Tuesday.MVP

import scala.collection.IterableOnce.iterableOnceExtensionMethods

object MVP extends App {
  //1)
  def applyTwice(input: Int, f: Int => Int): Int = f(intDoubler(input))

  def intDoubler(num: Int): Int = num * 2


  println(applyTwice(4, intDoubler))
  println(applyTwice(10, intDoubler))
  println(applyTwice(1, intDoubler))


  //2)
  def IntManipulator(a: Double, b: Double, function: (Double, Double) => Double): Double = function(a, b)

  def addition(x: Double, y: Double): Double = x + y

  def multiplication(x: Double, y: Double): Double = x * y

  def division(x: Double, y: Double): Double = y / x

  def subtraction(x: Double, y: Double): Double = y - x

  println("InterManipulator using addition: " + IntManipulator(2, 4, addition))
  println("InterManipulator using multiplication: " + IntManipulator(2, 4, multiplication))
  println("InterManipulator using division: " + IntManipulator(2, 4, division))
  println("InterManipulator using subtraction: " + IntManipulator(2, 4, subtraction))

  //3) Why:(?
  def convertToUpperCase(i: String): String = i.toUpperCase

  def convertToLowerCase(i: String): String = i.toLowerCase

  def stringConverter(makeStringUpperCase: Boolean): String => String =
    makeStringUpperCase match {
      case true => convertToUpperCase
      case _ => convertToLowerCase
    }

  val testString = "cOnVeRtMe"
  val caseTrue = stringConverter(true)(testString)
  println(caseTrue)
  val caseFalse = stringConverter(false)(testString)
  println(caseFalse)

  //4)
  //def calculate(operation: String) : Double => Double = {
  //  operation match {
  //    case add => addition
  //    case multiply => multiplication
  //    case divide => division
  //    case subtract => subtraction
  //  }
  //
  //
  //}

  /** Extension & Research */
  //1)
  def max(a: Double, b: Double): Double = a.max(b)

  println(2.max(4))

  def maxListNum(list: List[Double], max: (Double, Double) => Double): Double = list.tail.foldLeft(list.head)((acc, n) => max(acc, n))

  println(maxListNum(List(1, 2, 4), max))

  //2
  def applyFunc(f: Int => Int, givenInt: Int):Int = f(givenInt)
  def triple(givenInt: Int): Int = givenInt * 3
  def square(givenInt: Int): Int = givenInt * givenInt
println(applyFunc(triple, 5))
println(applyFunc(square, 5))

  //3
//  def power(exponent: Int): Int = function(base: Int): Int => Int
//Mas.pow(base, exponent)
}
