package Week2.Wednesday

import org.scalatest.flatspec.AnyFlatSpec

class TwoNumbersSpec extends  AnyFlatSpec {
  "add" should "add x and y" in {
    val numbers = new TwoNumbers(1,2) //making a new instance of my class so I can access the methods.
    assert(numbers.add == 3)// this will return a boolean. Method == expected
}

  "subtract" should "subtract x from y" in { //y-x = 2-1
    val numbers = new  TwoNumbers(1,2)
    assert(numbers.subtract == 1 )
  }

  "multiply" should "multiply x to y" in {
    val numbers = new TwoNumbers(4,4)
    assert(numbers.multiply == 16)
  }

//********We want to test edge cases. we want our test to be able to fail, but they still need to compile. We can make the result to past.
//  "multiply" should "error when the input is a double" in {
//    val numbers = new TwoNumbers(4.5 ,5)
//    assert(numbers.multiply != 22)
//  }




}
