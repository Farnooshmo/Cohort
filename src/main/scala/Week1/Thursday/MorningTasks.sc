//1 seq of names
val nameSeq: Seq[String] = Seq("Ana","Rose","Rob","Tom")

//2 Filter blue
val colorMap: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)
val filteredColorMap: Map[Int, String] = colorMap.filter(
  color => color._2 == "blue"
)

//3
val firstMap: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "four" -> 4,
  "five" -> 5
)

val addOne: Map[String, Int] = firstMap.map {
  case(key, value) => (key, value + 1)
}
//
val firstList: List[Int] = List(1,2,3,4,5)
val addOneSeq = firstList.map { number => number + 1 }



//4
val firstSeq: Seq[Int] = Seq(1,2,3,4,5)

val filteredSeq: Seq[Int] = firstSeq.filter(
  number => !(number% 2 == 0)
)
//5

val getContainsY: Boolean = nameSeq.exists(
  name => name.contains("n")
)

/** Task 2
 */