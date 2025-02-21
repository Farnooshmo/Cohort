package Week3.Thursday.mvp

object Extension extends App{

  def checkListType [T](list: List[T]): String = {
    list match {
    case _: List[Double] => "List of Doubles"
    case _: List[String] => "List of Strings"
    case _: List[Int] => "List of Ints"
    case _ => "Unknown"
  }
  }

  val numList: List[Int] = List(1,2,3)
  val doubleList: List[Double] = List(1.0, 2.0, 3.0)
  val stringList: List[String] = List("1","2","3")
  checkListType(numList)
}
