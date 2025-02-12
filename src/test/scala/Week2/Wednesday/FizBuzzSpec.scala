package Week2.Wednesday

import org.scalatest.flatspec.AnyFlatSpec

class FizBuzzSpec extends AnyFlatSpec{
val fizzBuzz = new FizzBuzz
  "fizBuzz" should "return 'Fizz' if dividable by 3 only" in {

    assert(fizzBuzz.fizzBuzz(12) == "Fizz")
  }
  "fizBuzz" should "return 'Buzz' if dividable by 5 only" in {

    assert(fizzBuzz.fizzBuzz(5) == "Buzz")
  }
  "fizBuzz" should "return 'FizzBuzz if dividable by 3 and 5" in {

    assert(fizzBuzz.fizzBuzz(15) == "FizzBuzz")
  }
  "fizBuzz" should "return number in string if not dividable by 3 and 5" in {

    assert(fizzBuzz.fizzBuzz(4) == "4")
  }

  }

