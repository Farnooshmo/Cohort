package Week4.Wednesday.MVP

import scala.concurrent.{Await, ExecutionContext, Future}
import org.scalactic.Pass

import java.util.concurrent.TimeUnit
import scala.concurrent.duration.DurationInt
import scala.util.{Failure, Success}

case class Name(value: String) //Q1

object Name { //Q10

  def nameOrError(maybeName: String): Either[InvalidNameError, Name] =
    if (maybeName.exists(_.isDigit)) //if it contains an int...
      Left(InvalidNameError("Not a valid name"))
    else //if it doesn't...
      Right(Name(maybeName))
}

case class Postcode(value: String) //Q1

object Postcode { //Q9
  def postcodeOrError(maybePostCode: String): Either[InvalidPostcodeError, Postcode] =
    maybePostCode match {
      case postcode if postcode.split(" ").length == 2 => Right(Postcode(maybePostCode))
      case _ => Left(InvalidPostcodeError("Not a valid postcode"))
    }
}

case class Letter(name: Name, postCode: Postcode) //Q2

object Letter { //Q11
  def letterOrError(maybeName: String, maybePostcode: String): Either[GenericPostageError, Letter] =
    for {
      name <- Name.nameOrError(maybeName)
      postCode <- Postcode.postcodeOrError(maybePostcode)
    } yield {
      Letter(name, postCode)
    }
}

trait GenericPostageError { //Q3
  def message: String
}

case class InvalidNameError(message: String) extends GenericPostageError //Q4

case class InvalidPostcodeError(message: String) extends GenericPostageError //Q5


object EitherLogic extends App {
  implicit val ec: ExecutionContext = ExecutionContext.global //1


  //  val letter: Right[GenericPostageError, Letter] = Right(Letter(Name("Simon Singh"), Postcode("AB12 CD3"))) //Q6

  //  val invalidLetter: Left[InvalidNameError, Letter] = Left(InvalidNameError("Not a name!!!")) //Q6
  //
  //  val letter: Right[Nothing, Letter] = Right(Letter(Name("Simon Singh"), Postcode("AB12 CD3"))) //Q7
  //
  //  val invalidLetter: Left[InvalidNameError, Nothing] = Left(InvalidNameError("Not a name!!!")) //Q7
  //
  //  println("Right of a valid letter: " + letter) //Q8
  //  println("Left of an invalid letter: " + invalidLetter) //Q8
  //
  //  val letterWithANumberInName: Either[GenericPostageError, Letter] =
  //    Letter.letterOrError(maybeName = "Simon Singh123", maybePostcode = "AB12 CD3") //Q12
  //
  //  val letterWithAnInvalidPostcode: Either[GenericPostageError, Letter] =
  //    Letter.letterOrError(maybeName = "Simon Singh", maybePostcode = "AB12CD3") //Q12
  //
  //  val letterAllInvalid: Either[GenericPostageError, Letter] =
  //    Letter.letterOrError(maybeName = "Simon Singh123", maybePostcode = "AB12CD3") //Q12
  //
  //  val letterAllValid: Either[GenericPostageError, Letter] =
  //    Letter.letterOrError(maybeName = "Simon Singh", maybePostcode = "AB12 CD3") //Q12
  //
  //  println("\nMade using the .letterOrError method:")
  //  println("Left of a letter due to having numbers in the name: " + letterWithANumberInName) //Q13
  //  println("Left of a letter due to having no space in the postcode: " + letterWithAnInvalidPostcode) //Q13
  //  println("Left of a letter due to having invalid name and postcode: " + letterAllInvalid) //Q13 Name error printed as checks that first, finds it invalid and then leaves the for comp.
  //  println("Right of a valid letter: " + letterAllValid) //Q13
  def fetchLetter: Future[Letter] = Future { //2
    Thread.sleep(3000) // Thread.sleep(1000000), gives error however it shows Future is not completed yet!
    val letter1 = Letter(Name("Simon Singh"), Postcode("AB12 CD3"))
    letter1
  }

  val eventualLetter: Future[Letter] = fetchLetter //3
  eventualLetter.onComplete {
    case Success(letter) => println(s"Successfully fetched letter :$letter")
    case Failure(exception) => println(s"Fail to fetch letter : ${exception.getMessage}")
  }


  eventualLetter.value match { //5
    case Some(Success(foundLetter)) => println(s"Future is completed successfully with letter : $foundLetter")
    case Some(Failure(exception)) => println(s"Future failed with exception: ${exception.getMessage}")
    case None => println(s"Future is not completed yet!")
  }
  Await.ready(eventualLetter, 2.seconds)//4


  def fetchLetterOrError(name: String, postCode: String):Future [Either [GenericPostageError, Letter]] = Future {
    Thread.sleep(2)
    Letter.letterOrError(name, postCode)
  } //extension 1 /Thread.sleep(2) occur timeout error



  Thread.sleep(3000)
}
