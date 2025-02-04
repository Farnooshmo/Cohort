/**
 * Int - whole numbers --> 4 bytes
 * Long - whole number --> 8 bytes
 * Short - whole number --> 2 bytes
 * Double - simple decimal ( same in java)
 * Float - 2.0f (rarely seen)
 * String - " Text"
 */
//val one:  Int = 1.0
val inferredOne = 1 // Haven't told Scala it is an Int - it has inferred the type. not safe.
val int: Int = 474836
val myString: String = "hello"
val Boolean: Boolean = true