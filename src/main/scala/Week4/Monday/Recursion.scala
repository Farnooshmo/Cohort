package Week4.Monday

import scala.annotation.tailrec

object Recursion extends App {
  //Standard recursion
  //recursive calls which call the original method inside the method
  // each new call adds to the call stack
  // method will remember all of these calls before completing
  // it will continue to recursively call until the base case id reached
  // once base case is reached, it will resolve in reverse order


  //Factorial method - multiply all positive Ints in a list(input= 4 --> 4X3X2X1)
  def factorial(n: Int): Int = {
    if (n <= 1) { // how I escape to recursion
      1 // base case - this says: when you get to 1, return 1 and then the stored cal stack can start unwinding
    } else {
      println(s"\n Incoming  n is : $n")
      println((s"New n:  ${n - 1}"))
      val finalResult = n * factorial(n - 1) // will not reach this until the base case has been reached and it starts unwinding through the call stack
      println(s"Final n call : $n")
      finalResult
    }
  }

  print(factorial(4))
  // Pseudocode unwinding stack - factorial(4)
  //recursive loop - call stack -- not yet evaluated (waiting until the loop ends to evaluate)
  // factorial(4) --> 4 X factorial (4-1) --> factorial(3)
  // factorial(3) --> 3 X factorial (3-1) --> factorial(2)
  //factorial(2) --> 2 X factorial(2-1) --> factorial(1)
  //factorial(1) --> hitting the base case ( exit the recursive loop--> return 1
  // unwind --> top to bottom
  //factorial(2) --> 2 x factorial (2-1) --> 2 x factorial (1) --> 2 x 1 = 2
  // factorial (3) --> 3 x factorial( 3-1) --> 3 x factorial (2) --> 3 x 2 = 6
  //factorial(4) --> 4 x factorial (4-1) --> 4 x factorial (3) --> 4 x6 = 24
  // final result = 24


  // stack overflow error - there is only so much memory in the call stack. if this is exceeded we get this error.
  //  print(factorial((10000))) It makes a memory issue!!

  //Tail recursion
  // smarter way to write recursion because it stops stack overflow errors.
  //key differences:
  // 1. recursive call must be the lase operation a function performs.(@tailrec - will check this)
  //2. Prevents stack overflow error:
  //a. doesn't need to remember all previous values, all needed information id passed through as an accumulator (acc)
  //b. Scala rep;aces recursive calls with a simple loop under the hood, called Tail call optimization(TCO)
  // It replaces and updates the acc with every recursive call.

  //1st - with a helper method
  def smarterFactorial(n: Int): Int = {
    @tailrec
    def factorialHelper(x: Int, acc:Int): Int = {
      //write our method
      if (x <= 1) acc
      else {
        println(s"\nCurrent x inside else: $x")
        println(s" Value or current acc inside else: $acc")
factorialHelper(x-1, acc * x)
      }
    }
    factorialHelper(n, 1)
  }
  println("Tail rec with helper:" + smarterFactorial(4))


  //Tail rec without helper method

  @tailrec
  def smartFactorialWithoutHelper(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else  smartFactorialWithoutHelper(n-1, acc * n)
  }
 println("\nTail rec without helper: " + smartFactorialWithoutHelper(4))

  // example with string
  @tailrec
  def concatenateWords(aWord: String, n:Int, acc:String): String ={ // type of return is the type of acc
    if (n <= 0) {
      println(s"current aWord inside if $aWord")
      println(s"current acc inside if $aWord")
      acc
    }
    else {
      println(s"current aWord inside else $aWord")
      println(s"current acc inside else $aWord")
      concatenateWords(aWord, n-1, aWord + acc)
    }
  }

println(concatenateWords("\n hello world!", 3, ""))

// how many elements are in a  list


val myList: List[String] = List("a", "b", "c")

  def  numOfElements(list: List[String]): Int = {
    if(list.isEmpty)
      0
    else
      1 + numOfElements((list.tail))
  }
println("\n Task1: ")
println("\n numOfElements: " + numOfElements(myList))

  @tailrec
  def numberOfElementsIntsTail(list : List[String], acc: Int): Int = {
    if (list.isEmpty) acc
    else numberOfElementsIntsTail(list.tail, acc + 1)
  }
  println("\n numOfElementsIntsTail: " + numberOfElementsIntsTail(myList, 0))
}
//def smarterFactorial(n: Int): Int = {
//  def factorialHelper(x: Int, acc:Int): Int = {// helper- do not have to change the original method signature
//    //write our method
//    if (x <= 1) acc // acc = superstar - stores the intermediate value, don't need to have a large memory as call stack is being update
//    else {
//      factorialHelper(x-1, acc * x)// last expression = tail rec. override old values and pass in a new updated acc each time.
// x-1 --> moving down our numbers list
// acc * x --> running total
//    }
//  }
//  factorialHelper(n, 1)// call the helper, pass in the original n so we start the recursion at the top level, acc will start at the if case.
//}