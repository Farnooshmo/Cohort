// Seq, List, Map( notice the uppercase)
val firstSeq: Seq[Int] = Seq(1,2,3,4,5)
val firstList: List[Int] = List(1,2,3,4,5)
val firstMap: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "four" -> 4,
  "five" -> 5
)
//Map has key valur pairs ( key -> value)
//Must declare hte types of both key and value in the parameters.
/**Accessing data */
  //SEQ
val getSeqData: Int = firstSeq(0)
val getSeqHead: Int = firstSeq.head // get the first element ( index position 0)
val getSeqTail: Seq[Int] = firstSeq.tail //tail is all the rest. get everything except the head (index position 0)
val getSeq2Data: Int = firstSeq(2)
//val getSeqTooMuchData: Int = firstSeq(12) // out of bounds exception thrown as we do not have any data in the 12th index position.
//LIST
val getList1Data: Int = firstList(1)
val getListTail: List[Int] = firstList.tail
val getLastInList: Int = firstList.last //the last one

//MAP
val getMapData = firstMap("three") // enter the key to get the value

/** Manipulating data - using map */
val tripledList:  List[Int] = firstList.map{
  number => number * 3
}


//_ => _ * 3 when you do not care about name x bad practice
//val tripledSeq:  List[Int] = firstSeq.map {
//  _ * 3
//}



val tripleMap: Map[String, Int] = firstMap.map {
  case(key, value) => (key, value * 3)
}
val changeKey: Map[String, Int] = firstMap.map {
  case(key, value) => (key.capitalize, value)
}
val changeKeyAndValues: Map[String, Int] = firstMap.map {
  case(key, value) => (key.capitalize, value * 3)
}

/** Manipulating data - filtering */
// filter
// filterNot (works similar to !=)
  // Boolean being returned
val filteredSeq: Seq[Int] = firstSeq.filter(
  number => number >= 2
)
val filteredList: List[Int] = firstList.filter(
  number => number >= 2
)



filteredSeq == filteredList // true despite the val names not being the same. We are checking for the resulting value.

val filteredMap: Map[String, Int] = firstMap
  .filter(
    number => number._2 >= 2
  )
//_1 --> access key
// _2 --> access value

val filterNotList: List[Int] = firstList
  .filterNot(  number => number >= 2)
//===============================================
 val filteredList:  List[Int] = firstList.filter(
   number => !(number >= 2)
 )

/** Manipulating data - check if an element is present */
//Get boolean result

  //EXISTS
val existsSeq: Boolean = firstSeq.exists( number => number >= 7)
val existsList: Boolean = firstList.exists( number => number >= 2)
val existsMap : Boolean = firstMap. exists(number => number._2 >= 2)

//CONTAINS - give it a specific piece of data to look for.

val containsSeq: Boolean = filteredSeq.contains(2)
val containsList: Boolean = filteredList.contains(1)
val containsMap: Boolean = firstMap.contains("two")
val containsOrSeq: Boolean = filteredSeq.contains(7) || firstSeq.contains(2)

//Pending
/** Making additions - prepend (start) or append (end) */
val x: Seq[Int] = Seq[Int]()
 x :+ 1
 x :+ 2
 x  // won't work = immutable

val y: Seq[Int] = Seq(3,4,5)
// Append (add to end)
val appendY = y:+ 6
// Prepend (add to start)
val prependY = 2 +: appendY
val multipleInts = Seq(0,1,2) +: y
val multipleInts = Seq(0,1,2) ++ y
//Append Map
val appendMap = firstMap + ("six" -> 6)
//To order use ListMap rather than Map.
/** Deleting */
val removeHead = firstSeq.tail //remove head
val removeLast = firstSeq.init //remove last index position
//Removing Map
val removeValueInMap = firstMap - "three" //call to the key
val removeMultipleValuesInMap = firstMap - ("three", "one") //call to the key
