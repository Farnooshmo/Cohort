
//These work on monadic types -- Swq, List, Option, Either, Future
//Will not work Int, String, Boolean
// <- (backwards arrow), simply way of writing a function ( flatmap, filter, map, foreach)
//yield -- call the map
// classic
def retrieveNumbers: Seq[Int]= for (number <-  1  to 10) yield number
retrieveNumbers

//use operators
def squaredNumber: Seq[Int]= for (number <- 1 to 5)yield number * number
squaredNumber

//if guards
def useIfGuard: Seq[Int] = for ( number <- 1 to 10 if number % 2 ==0) yield number
useIfGuard

////////////
val animals: List[String]= List("Hippo", "Bear", "seal", "Pig")
def addS(animalList :List[String]): List[String] = animalList.map(
  animal => animal + "s"
)
addS(animals)
def lowerCaseAnimals(animalList: List[String]): List[String]= animalList.map(
  animal => animal.toLowerCase
)
lowerCaseAnimals(animals)


def lowerCaseAndAddS( animalList: List[String]): List[String] = for {
  addAnS <- addS(animalList)
  lowerCase <- lowerCaseAnimals(List(addAnS))// here it should put it back as a List
}yield lowerCase
lowerCaseAndAddS(animals)// give a list
lowerCaseAndAddS(animals).mkString(" ")// change a  List it to a string
lowerCaseAndAddS(animals).mkString("! ")
lowerCaseAndAddS(animals).mkString(", ")


////1
//b
val names: List[String]= List("aRIa", "BaRT", "ChUCk")
def lowercaseNames(namesList: List[String]):List[String] = namesList.map( name => name.toLowerCase)
def capitaliseNames( nameList: List[String]):List[String] = nameList.map(
  name => name.capitalize)

lowercaseNames(names)
capitaliseNames(names)
//2
def lowerCaseAndCapitaliseNames ( namesList: List[String]): List[String]=for{
  lowerCaseNames <- lowercaseNames(namesList)
  capitalisedName <- capitaliseNames(List(lowerCaseNames))
}yield capitalisedName
lowerCaseAndCapitaliseNames(names)

