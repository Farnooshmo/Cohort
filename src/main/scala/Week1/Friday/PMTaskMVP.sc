//1)
def squareOfInt (num: Int): Int = num * num
//2
def evenOrOdd (num: Int): Boolean = num%2 != 0
//3
val numberList: List[Int] = List(1,2,4,5,7,8)
def sumOfOddNumbers (numbers:List[Int]): Int = {
   val sumOfOdds:List[Int]= for (
    number <- numbers
     if evenOrOdd(number)
   )yield  squareOfInt(number)
  sumOfOdds.sum
}
sumOfOddNumbers(numberList)

//4
val score : List[Int]= List(45, 89, 60)
def averageScore(scores: List[Int]): Double = {
  val averageS = scores.sum.toDouble / scores.length
  BigDecimal(averageS).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}
averageScore(score)

def getGrade(average: Double): String = {
average match{
  case score if score >= 90 => "A"
  case score if score >= 80 => "B"
  case score if score >= 70 => "C"
  case score if score >= 60 => "D"
  case _ => "E"
}
}

getGrade(averageScore(score))

