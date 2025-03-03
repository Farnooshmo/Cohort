//Extension

//1 return Seq(1, 2, 5, 7)
val numbers: Seq[Int] = Seq(1,2,3,4,5,6,7,8,9)
val filterNumberDividedToTree: Seq[Int] = numbers.filterNot(
 number => number%3 == 0
)
val filterNumbersDividedToFour: Seq[Int] = filterNumberDividedToTree.filterNot(
  number => number%4 == 0
)
//In one line:
//numbers.filter(n => n%3 != 0).filter(n => n%4 != 0)

//2
val groceryList: List[String] = List("milk","egg","shampoo","bread")
// retrieve the 3rd element of a list.
//val removeFirstElement:List[String] = groceryList.tail
//val removeSecondElement:List[String] = removeFirstElement.tail
//val retrieveThirdElement:String = removeSecondElement.head
//one line : retrieve the third element :
val third = groceryList.tail.tail.head