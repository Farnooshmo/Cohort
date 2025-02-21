package Week3.Friday.AfternoonTask

import scala.util.Left


//1
case class Name(value: String)

//2
case class Postcode(value: String)

//3
case class Letter(name: Name, postcode: Postcode)

//4 trait called GenericPostageError with a parameter method `message` with a type `String`
trait GenericPostageError {
  def message: String
}

//5 a case class called `InvalidNameError`
case class InvalidNameError(message: String) extends GenericPostageError

//6 Create an object called EitherLogic and extend App to make it runnable.
object EitherLogic extends App {
    val letter: Either [GenericPostageError, Letter] = Right(Letter(Name("Fa"), Postcode("CR33NB")))
    val invalidLetter: Either [GenericPostageError, Letter] = Left(InvalidNameError("Invalid name!"))
  //7
//  val letter: Right[Nothing, Letter] = Right(Letter(Name("Fa"), Postcode("CR33NB")))
//  val invalidLetter: Left[InvalidNameError, Nothing] = Left(InvalidNameError("Invalid name!"))

  println(letter)
  println(invalidLetter)


}


//object Postcode {
//  def postcodeOrError(maybePostCode: String): Either[InvalidPostcodeError, Postcode] = {
//    if (maybePostCode.contains(" ")) Right(Postcode(maybePostCode))
//    else Left(InvalidPostcodeError("This is an invalid postcode"))  }}

//

