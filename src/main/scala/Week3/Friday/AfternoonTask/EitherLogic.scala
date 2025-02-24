package Week3.Friday.AfternoonTask


//6 Create an object called EitherLogic and extend App to make it runnable.
object EitherLogic extends App {
    val letter: Either [GenericPostageError, Letter] = Right(Letter(Name("Fa"), Postcode("AB3CB")))
    val invalidLetter: Either [GenericPostageError, Letter] = Left(InvalidNameError("Invalid name!"))
  //7
//  val letter: Right[Nothing, Letter] = Right(Letter(Name("Fa"), Postcode("CR33NB")))
//  val invalidLetter: Left[InvalidNameError, Nothing] = Left(InvalidNameError("Invalid name!"))

  println(letter)
  println(invalidLetter)
  println(Postcode.postcodeOrError("ccc4"))


}






