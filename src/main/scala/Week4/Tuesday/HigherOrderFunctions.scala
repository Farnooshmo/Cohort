package Week4.Tuesday

object HigherOrderFunctions extends App {
  //higher order functions- HOF
  //definition: they are a function that Either takes in a function as a parameter or return a function as a result.
  // Why do we use them?
  //1. Modular, reusable code (often easier to read).
  //2. Reduce repeated code( make code mire concise).
  //What do they do? Manipulate collections(e.g. map, filter, fold, reduce...)

  /** HOF -functions as parameters */
  //this method will take a function ( that is also Int => Int), and it will apply whatever that is, to the given 'x'.
  def firstHigherOrderFunction(x: Int, function: Int => Int): Int = function(x)

  // now need to write functions that can be passed into my HOF - must be Int => Int
  def addTwo(number: Int): Int = number + 2

  def square(number: Int): Int = number * number

  def double(number: Int): Int = number * 2

  println(firstHigherOrderFunction(3, addTwo))
  println(firstHigherOrderFunction(3, square))
  println(firstHigherOrderFunction(3, double))


  // this method will process a List[String]
  def processTheList(listOfString: List[String], function: String => String): List[String] = listOfString.map(function) // must map through the list to access the single element.

  def toUpper(word: String): String = word.toUpperCase

  def addS(word: String): String = word + "s"

  def toLower(word: String): String = word.toLowerCase

  val newList: List[String] = List("aPple", "oRange", "mangO", "grApe")
  processTheList(newList, toUpper) // You would see this in production code
  println(processTheList(newList, addS)) // Won't see print line. Test to make sure the above is working.
  println(processTheList(newList, toLower))

  //Fold Left
  // What does it do?
  // combines/reduces a collection into a single value.
  // Process the collection from left to right.
  //I t will store the intermediate value as an 'acc' just like recursion. At the end, once the full collection , is checked and reduced it will return the 'acc'


  // acc comes first, then element (acc, element) => acc + element
  val numberList: List[Int] = List(1, 2, 3, 4, 5)
  //add all number in my list
  println(numberList.foldLeft(0)((acc, nextInt) => acc + nextInt)) //if you start 2=> it it the first value
  // numberList.foldLeft(0)(_+_) - shorthand for the above
  //Pseudocode
  //Start with 0 -> 0 + 1 = 1( acc = 1)
  //(1, 2) => 1 + 2 = 3( acc = 3)
  //(3, 3) => 3 + 3 = 6 (acc =6)
  //(6, 4) => 6 + 4 = 10 (acc = 10)
  // (10, 5) => 10 + 5 = 15 (final element in the list - we return the acc = 15)

  // write a methos that takes a list of String and returns them as a standard String( list of words into a sentence)
  val stringList = List("we", "love", "scala")
  println(stringList.foldLeft("")((acc, nextWordInTheList) => acc + " " + nextWordInTheList).trim)



  //task 1-
  println(numberList.foldLeft(1)((acc, nextInt) => acc * nextInt))

  //task 2-
  println(numberList.filter(x => x % 2 == 0))
  //val evenNumber = numberList.filter(_ % 2 == 0)
  //  println(evenNumber)

  //3,4 ****** should write


  /** Fold Right */
  //Same as above except you move Right to Left.// Element comes first, then acc.// foldRight(acc)(function: (element, acc) => element, acc)


  /**
   * HOF - function is the return type
   */
  // commonly seen in pattern matching/ if else , where we want to choose the function based on given criteria.
  // Write a function where, given the length of employment , hte percentage pay rise is different.
  //Return the final amount paid per year to a particular employee
  case class Employee(name: String, lengthOfEmployee: Int, salary: Double)

  val Amanda = Employee("Amanda", 8, 300000.0)

  // for each of these methods, we are not doing the calculation. We will use these to identify which pay rise they wil get, given the criteria of employment length.
  def bigPayRise: Double => Double = salary => salary * 2

  def mediumRise: Double => Double = salary => salary * 1.3

  def smallRise: Double => Double = salary => salary * 1.1

  // This method will look at the employment length , and decide which of the above methods to use.
  def getPayRiseCalc(employee: Employee): Double => Double = {
    employee.lengthOfEmployee match {
      case year if year <= 3 => smallRise
      case year if year <= 5 => mediumRise
      case _ => bigPayRise //wildcard - catch everything else
    }
  }

  // This method will return the new salary for a given employee
  def getFinalSalary(employee: Employee): Double = {
    val applyThePayRise: Double => Double = getPayRiseCalc(employee) // store the pay rise function
    applyThePayRise(employee.salary) // do the final calc (big/medium/small pay rise)

  }

  println(getFinalSalary(Amanda))


  case class Item(price: Double)

  val pictoreFrame = Item(56.00)

  def bigDiscount: Double => Double = price => price * 0.5

  def mediumDiscount: Double => Double = price => price * 0.4

  def smallDiscount: Double => Double = price => price * 0.2


  def getDicsountCal(item: Item): Double => Double = {
    item.price match {
      case price if price <= 20 && price > 0 => smallDiscount
      case price if 20 < price && price < 50 => mediumDiscount
      case _ => bigDiscount
    }
  }
    def getFinalDiscount(item: Item): Double = {
      val applyDiscount: Double => Double = getDicsountCal(item)
      applyDiscount(item.price)
    }

  println(getFinalDiscount(pictoreFrame))
  }


