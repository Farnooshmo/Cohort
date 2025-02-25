package Week4.Monday

import scala.annotation.tailrec

object MVP extends App {

  //1

  object Euro2024 extends Enumeration {
    val Germany, Spain, France, England, Italy, Netherlands, Belgium, Portugal, Denmark, Sweden, Switzerland, Austria, Poland, CzechRepublic, Croatia, Turkey, Scotland, Wales, Romania, Bulgaria, Serbia, Ukraine, Norway, Iceland = Value
  }

    println(Euro2024.values)



  def printEuroTeams(euro2024: List[Any]): String = {
    @tailrec
    def printEuroTeamsRec(teams: List[Any], acc: String): String = {
      if (teams.isEmpty) acc // Empty list case
      else {
        val head = teams.head
        val tail = teams.tail
        val makeNiceToRead = if (acc.isEmpty) "" else ", " // nice formatting
        printEuroTeamsRec(tail, acc + makeNiceToRead + head.toString)
      }
    }

    printEuroTeamsRec(euro2024, "")
  }

  println(printEuroTeams(Euro2024.values.toList))


  //2)

  sealed class Team(name: String)

  object Team {
    case object Germany
    case object Spain
    case object France
    case object England
    case object Italy
    case object Netherlands
    case object Belgium
    case object Portugal
    case object Denmark
    case object Sweden
    case object Switzerland

  }

  // B: It takes too much to access the value

  val TeamList: List[Object] = List(Team.Germany, Team.France, Team.Italy, Team.Spain, Team.England, Team.Netherlands, Team.Belgium, Team.Portugal, Team.Denmark, Team.Sweden,Team.Switzerland )
  println(printEuroTeams(TeamList))


  /** ****-----Recursion 3-----***** */
  //3)  Create a method that has an input of a positive `Int`. This method will return the sum of all numbers between 0 and the given `Int`.
  def sumOfNum(n: Int): Int = {
    if (n <= 0) {
      0
    } else {
      val finalSum = n + sumOfNum(n - 1)
      finalSum
    }
  }

  println(sumOfNum(5))

  //Using tailrec
  @tailrec
  def tailSumOfNum(n: Int, acc: Int = 0): Int = {
    if (n <= 0) acc
    else tailSumOfNum(n - 1, acc + n)
  }

  println("\n using tailrec: " + tailSumOfNum(5))


  //4) Using recursion and given a list with all integers from 1 to 20 inclusive,

  @tailrec
  def isEven(list: List[Int], indexOfNum: Int): Either[String, Boolean] = {
    if (indexOfNum >= list.length - 1 || indexOfNum < 0) {
      Left(s"Index $indexOfNum is not valid for this list ")
    } else if (indexOfNum == 0) {
      Right(list.head % 2 == 0)
    } else {
      isEven(list.tail, indexOfNum - 1 )
    }

  }
  println(s"\nTest the isEven method with invalid index: " + isEven(List(1,2,3,4,5), 6))
  println(s"\nTest the isEven method with an even integer : " + isEven(List(1,2,3,4,5), 3))
  println(s"\nTest the isEven method with an odd integer: " + isEven(List(1,2,3,4,5), 0))
}
