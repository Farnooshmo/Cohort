package Week4.Revision

object Revision extends App {
  //Week1/Wednesday/ Strings intrpolation and if/else
  //How to calculate the 2 decimal of Pi
  val pi: Double = 3.141592
  println(f"Pi to 2 decimal places is $pi%.2f")
  println(f"Pi to 3 decimal places is $pi%.3f")
  //
  val name1: String = "Misha"
  val name2: String = "Mino"
  val int1: Int = 1
  val int2: Int = 3

  print(f"$name2 is ${int2 - int1} years older than $name1")

  //
  // val new: String = "New is one of the reserved word and can not use as a val/var"
  //************ if use them inside two backtick, it will be happy. example at line 21!
  //  val `new`: String = "Wrap the keywords in backticks to calling a val keyword"

  // 1. Order of precedence can be found here: https://docs.scala-lang.org/tour/operators.html#:~:text=%5E%20has%20the%20highest%20precedence%20because,%3F%20%2C%20%7C%20%2C%20and%20less%20.
  /**
   * parnthesis ()
   *
   * * / %
   *
   * + -
   *
   * :
   *
   * < >
   *
   * = !
   *
   * &
   *
   * ^
   *
   * |
   *
   * (all letters, $, _)
   */
  //Week1/Thursday/ Collections
  //!!!!!!
  //Type of collections which are the most common: Sequences, Lists and Maps
  val dye: Map[Int, String] = Map(
    1 -> "green",
    2 -> "red",
    3 -> "blue"
  )
  println(dye)
  val filteredDye: Map[Int, String] = dye.filter(d => d._2 == "blue")//!!!!!!!!!!!(d => d._2 == "blue")!!!!
  println(filteredDye)
  //!!!!!!!!
  // uppercase values:
  val upperCaseDye: Map[Int, String] = dye.map {
    case (key, value) => (key * 3, value.toLowerCase.capitalize)
  }
  println(upperCaseDye)


  //
  val listOfFlowers: List[String] = List("Orchid", "Lily", "Carnation", "Marigold", "Tulip")
  println(listOfFlowers)
  val addingSToFlower = listOfFlowers.map(f => f + "s")
  println(addingSToFlower)

  val flipMapFlowers = listOfFlowers.flatMap(f => f.toUpperCase)
  println(flipMapFlowers)

  val containRose = listOfFlowers.contains("Rose")
  println(containRose)

  val agesOfFamily:Seq[Int]= Seq(15, 20, 30, 40, 50, 60)
  val doubleTheAges = agesOfFamily.map(a => a * 5)
  println(doubleTheAges)
val addOneAtTheEndOfListOfAges = agesOfFamily :+ 1 //List(15, 20, 30, 40, 50, 60, 1)
  println(addOneAtTheEndOfListOfAges)

/////!!!!!!
val y: Seq[Int] = Seq(3,4,5)
  // Append (add to end)
  val appendY = y:+ 6//  val y: Seq[Int] = List(3, 4, 5)
  // Prepend (add to start)
  val prependY = 2 +: appendY //  val prependY: Seq[Int] = List(2, 3, 4, 5, 6)
  val multipleInts = Seq(0,1,2) +: y//  val multipleInts: Seq[Any] = List(List(0, 1, 2), 3, 4, 5)

  val multipleIntsY = Seq(0,1,2) ++ y//  val multipleIntsY: Seq[Int] = List(0, 1, 2, 3, 4, 5)
  //Append Map
//  val appendMap = firstMap + ("six" -> 6)
//  //To order use ListMap rather than Map.
//  /** Deleting */
//  val removeHead = firstSeq.tail //remove head
//  val removeLast = firstSeq.init //remove last index position
//  //Removing Map
//  val removeValueInMap = firstMap - "three" //call to the key
//  val removeMultipleValuesInMap = firstMap - ("three", "one") //call to the key

  //
  val groceryList: List[String] = List("milk","egg","shampoo","bread")
  val third = groceryList.tail.tail.head
}