/**
 * Examples
 */
(number: Int) => number +1 // Anonymous function -can not reuse anywhere else
val  addition = (number: Int) => number +1 // Named function - only name when we want to reuse . We can not override. Immutable.
def addition ( number:Int): Int = number +1 //Method (also a type of function). Named so can reuse. Must be names!!
def addition (number:Int): Int = number +10 //Override

/**
 * We never see the last expression being a println(), because it give us no value!
 ** **********
 * What does the below return?
 * def aDifferentValue: Int = {
 * if (aValue) 564 else 865
 * 42
 * }
 * The above method returns 42
 */

val aValue = 20<3
def aDifferentValue: Int = {
  if (aValue) 564 else 865
  42
   }
//calling
aDifferentValue //Only 42 will be returned because it is the last expression in the method.
def makeACoffee:String ={
  "Add coffee to boiling water"
"Add sugar ot/and milk if required"
  "Stir"
  "Enjoy!"
}
makeACoffee


//With parameters
def makeATea(sugar:Int, splashesOfMilk: Int):String = {
  s"Add boiling water to your cup with a teabag, add $sugar spoons of sugar and $splashesOfMilk splashes of milk, stir and enjoy!"
}
makeATea(2,1)
// valid as well :
makeATea(sugar = 7, splashesOfMilk = 6)
// we can name the parameter when calling the methods.
//this is helpful for  readability when the types are the (same)
def vat: Double = 1.2
//def priceIncVat(priceOfItem: Double): Double = {
//  priceOfItem * vat
//} do not need {}  if it is one line
def priceIncVat(priceOfItem: Double): Double =
  priceOfItem * vat

priceIncVat(3.99)


//1
def getBigVal(input1: Int,input2: Int): String = {
  if(input1 > input2){
    "first"
  }else if(input1 < input2){
    "second"
  }else {
    "same"
  }
}
getBigVal(1,2)
getBigVal(2,2)
getBigVal(12,2)

//2
def nameLength(firstName: String, surname:String): Int={
  if(firstName.length == surname.length){
    0
  }else if(firstName.length > surname.length){
    firstName.length
  }else{
    surname.length
  }
}
nameLength("tom", "rose")
nameLength("tom", "anarose")
nameLength("tom", "ana")


/**
 * Referential transparency
 */
//we say something has referential transparency when a function return value is based solely on the inputs.
//Example: addition(1,2) always = 3
def addTwoInts(x:Int, y:Int): Int = x + y
3 + 3
3+ addTwoInts(1,2)
addTwoInts(1,2) + addTwoInts(1,2)
6

//Just something to think about when writing more complex code. What is simpler four our brains?