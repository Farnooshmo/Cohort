package Week3.Friday

import java.time.LocalDate

object Eithers extends App {
  // this use  for 2 different type and takes 2   params - left (error) and right ( success)
  // Right biased
  // Main use -error handling
  //  def isOdd(x: Int): Either[Boolean, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(false)
  //  println(isOdd(4)) //left
  //  println(isOdd(3)) //right
  // make it better
  //1. Error handle using extends Exception --> custom errors but have  to make sure we use val to make params reachable
  class NewError(val errorCode: Int, val errorMessage: String) extends Exception

  //Custom  error
  case object IsOddError extends NewError(400, "Input is not odd, it is even.")

  def isOdd(x: Int): Either[NewError, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(IsOddError)

  println(isOdd(4)) //left
  println(isOdd(3)) //right

  //2. Error handle using try/catch - it gives ore inbuilt information
  //  def plusOne (x: Int): Either[String, Int] = {
  //    try{
  //      Right(x +1)
  //    } catch {
  //      case  e: Exception => Left(s"failed due to : $e") // wildcard// e can be replace with exeption
  //    }
  //  }
  //  println(plusOne(7)) // Right
  def plusOne(x: String): Either[String, Int] = {
    try {
      Right(x.toInt + 1)
    } catch {
      case exception: Exception => Left(s"failed due to : $exception") // wildcard// keeps code running
    }
  }

  println(plusOne("1")) // right
  println(plusOne("one")) // left


  //  def rainingWeather (x: String) : Either[String, Boolean]= {
  //    try {
  //      Right(true)
  //    } catch {
  //      case e: Exception => Left(s"failed due to : $e")
  //    }
  //  }
  //
  //  println(rainingWeather(take an umbrella))


  //Eithers with for comps
  //Fail fast -- this means as soon as one condition hits  a Left, we exit to fot comp.
  //Validate a User.


  case class User(username: String, password: String, dateOfBirth: LocalDate)

  // conditions :
  //1. Username must be at least 12 char long
  //2. Password must be a mixture of upper and lower case
  //3. Date of birth - must be 18


  case class ValidatedUser(username: String, password: String, dateOfBirth: LocalDate) //Return type of final method

  case object UsernameError extends NewError(400, "Username is less than 12 characters long")
  case object PasswordError extends NewError(400, "Password is not a mixture of upper and lower case")
  case object DateOfBirthError extends NewError(400," Not yet 18")

  val usernameBad = User("user", "Password", LocalDate.of(1960, 6, 5))
  val passwordBad = User("validusername", "password", LocalDate.of(1960, 6, 5))
  val validUser = User("validusername", "Password", LocalDate.of(1960, 6, 5)) //everything fine
  val dateOfBirthBad = User("validusername", "Password", LocalDate.of(2022, 6, 5))

  //1. Username
  def validateUsername(username: String): Either[NewError, String] = {
    if (username.length < 12) Left(UsernameError)
    else Right(username)
  }

  println("\nValidate username (bad - left): " + validateUsername(usernameBad.username))
  println("\nValidate username (success - right): " + validateUsername(validUser.username))

  //2. Password
  def validatePassword(password: String): Either[NewError, String] = {
    if (password.toUpperCase == password || password.toLowerCase == password) Left(PasswordError)
    else Right(password)
  }

  println("\nValidate password (bad - left): " + validatePassword(passwordBad.password))
  println("\nValidate password (success - right): " + validatePassword(validUser.password))

  //3. Dater birth

  def validateAge(dateOfBirth: LocalDate):Either[NewError, LocalDate] ={
    if(dateOfBirth.plusYears(18).isAfter(LocalDate.now)) Left(DateOfBirthError)
    else Right(dateOfBirth)
  }

  println("\nvalidate Age (bad -Left): " + validateAge(dateOfBirthBad.dateOfBirth))
  print("\nValidate age (success - right): " + validateAge(validUser.dateOfBirth))




  //4. put all the method togethee and retun the validatedUser if thety are all happy

  def ValidateUser(user: User): Either[ NewError, ValidatedUser] = {
    for {
      username <- validateUsername(user.username)// calling method, if happy (right), store in the val called username. if unhappy(left) - exit for comp.
      password <- validatePassword(user.password)
      dateOfBirth <- validateAge(user.dateOfBirth)
      validatedUser = ValidatedUser(username,password,dateOfBirth) // making case class using data from the for comp
    } yield  validatedUser // my final return type
  }
  println("\nvalidateUser - bad username: " + ValidateUser(usernameBad) )
  println("\nvalidateUser - bad password: " + ValidateUser(passwordBad) )
  println("\nvalidateUser - bad date of birth: " + ValidateUser(dateOfBirthBad) )
  println("\nvalidateUser - everything ok: " + ValidateUser(validUser) )



//buying a flat
  // buyer(salaryPerAnnum: Int, hasDeposit: Boolean, hasEnoughCreditScore: Boolean)
  //for comprehension
  //Has salary?  yes => Mortgage = salaryPerAnnum * 4
  //Has a deposit => Deposit >= 10% of purchase price



}