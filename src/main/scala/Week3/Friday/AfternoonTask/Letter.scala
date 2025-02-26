//package Week3.Friday.AfternoonTask
//
//import Week3.Friday.AfternoonTask.Postcode.postcodeOrError
//
//import scala.util.Left
//
//
////1
//case class Name(value: String)
//object Name {
//  def nameOrError(maybeName: String): Either[InvalidNameError, Name] = {
//    maybeName match {
//      case maybeName if maybeName.exists(_.isDigit) => Left(InvalidNameError("Name contains numbers"))
//      case maybeName => Right(Name(maybeName))
//    }
//  }
//}
//
////2
//case class Postcode(value: String)
//object Postcode {
//  def postcodeOrError(maybePostCode: String): Either[InvalidPostcodeError, Postcode] = {
//
//    if (maybePostCode.startsWith(" ") || maybePostCode.endsWith(" ") || maybePostCode.count(_ == ' ') != 1) Left(InvalidPostcodeError("This is an invalid postcode"))
//    else Right(Postcode(maybePostCode))
//  }
//}
//
////3
//case class Letter(name: Name, postcode: Postcode)
//object Letter {
//  def letterOrError(maybeName: String, maybePostCode: String): Either[GenericPostageError, Letter] = {
//    val postcodeValidation: Either[InvalidPostcodeError, Postcode] = Postcode.postcodeOrError(maybePostCode)
//    val nameValidation: Either[InvalidNameError, Name] = Name.nameOrError(maybeName)
//
//    for {
//      postcode <- postcodeValidation
//      name <- nameValidation
//    } yield Letter(name, postcode)
//  }
//}
//
//
//
////4 trait called GenericPostageError with a parameter method `message` with a type `String`
//trait GenericPostageError {
//  def message: String
//}
//
////5 a case class called `InvalidNameError`
//case class InvalidNameError(message: String) extends GenericPostageError
//case class InvalidPostcodeError (message: String) extends GenericPostageError
