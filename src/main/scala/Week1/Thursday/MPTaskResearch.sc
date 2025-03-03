//Research
//In a set there isn't any duplicate element.
Set(1,2) == Set(2,1,1,1) //Returns true! Because Set(1,2) goes to Set(2,1,1,1) and check if 1 and 2 exists and ignore the repeated 1.
List(3,4) == Seq(3,4) //Returns true, because both of them return the same result which is List(3, 4).Will return true, since scala checks the elements against each other, and they are comparable data types.
List(5,6) == Set(5,6) //Will return false, since these data types store data in different ways (ordered vs unordered).
