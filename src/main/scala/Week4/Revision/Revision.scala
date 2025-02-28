package Week4.Revision
object Revision extends App {
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
  val `new`: String = "Wrap the keywords in backticks to calling a val keyword"

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
  //

}