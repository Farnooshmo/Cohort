//1
//a
val numbers: List[Int] = List(1,2,3,4,5)
val colours: Seq[String] = Seq("green","blue","red")
//b
val numbersTripled: List[Int] = numbers.map { number => number * 3}
//c
val removeBlue: Seq[String] = colours.filterNot( colour => colour == "blue")
//d
val containOrange: Boolean = colours.exists(
  colour => colour.contains("orange")
)
//2 if odd -> true
val mapTrueOrFalseBasedOnBeingOdd: List[Boolean] = numbers.map{ number => number%2 == 1 }
//3
//a
val petOfDavid: Map[String, String] = Map(
  "Ster" -> "dog",
  "Rafi" -> "dog",
  "Shark" -> "fish",
  "Garfield" -> "cat"
 )
//b
val dogsNames: Map[String, String] = petOfDavid.filter(
 animal => animal._2 == "dog"
) // It is not a List