
//https://scala-lang.org/
//Create two values that hold integers. Assign any integer you'd like to these values.
val one: Int = 2
val two: Int = 4

/**
 * Create a new value to hold a string and assign it "yes" if the first value is greater than the second,
 * and "no" if the second value is greater.
 * (Don’t overthink this!)
 */
val yes: String = "yes"
val no : String = "no"
if ( one > two){
  s"$yes"
} else {
  s"$no"
}
//if (one > two) "yes" else "no"