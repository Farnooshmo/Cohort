//S
val name: String = "Farnoosh"
println(s"My name is $name.") //$ tells Scala what val to print

println(s"3*3 = ${3*3}")


val a: Int = 1976
val b: Int = 6
println(s"a* b = ${a*b}")

/// Helpful when debugging code. Print the result at certain points in a method.


//f
// Common format specifiers ( type safety)
// %f - float, Double
// %d - Int, Long
// %s - String

val height : Double = 1.6
println(f"$name%s is $height%.2f meters tall") //2 d.p.
println(s"$name%s is $height%.2f meters tall") // s interpolation won't recognise formating.

math.Pi // build in library
println(f"Pi to 2 d.p is ${math.Pi}%.2f")
println(f"Pi to 5 d.p is ${math.Pi}%.5f")
println(f"Pi to 1 d.p is ${math.Pi}%.1f")
println(f"Pi to 1 d.p is ${math.Pi}%20.1f") //Add padding
println(f"Pi to 1 d.p is ${math.Pi}%20.1f" + "         '") //Add padding after xbad
println(f"Pi to 1 d.p is ${math.Pi}%20.1f     '") // Add padding after xbad

//printf -String
printf("'%s", "Hello")
printf("'%20s'", "Hello")// padding before
printf("'%-20s'", "Hello")// padding after
printf("'%25s%-20s'", "Hello", "") //padding before and after


//raw
println(s"I'm going onto a \nnew line")// will drop  onto a new line with 's'
println(raw"I'm going onto a \nnew line")

//Common use --> Regex


//1
val nameTwo: String = "Maya"
println(s"$nameTwo is older than $name")
//2
val ageA: Double = 22.5
val ageB: Double = 18.1

println(f"$nameTwo is ${ageA - ageB} years older than $name  ")

//3
println(f"$nameTwo is ${ageA - ageB}%.1f years older than $name  ")

//4
println(raw"\n\n\n\n\n\n\nsameline\n\n")



