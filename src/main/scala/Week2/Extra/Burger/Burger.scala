package Week2.Extra.Burger

abstract class Burger (val doublePatty: String,val bunType:Burger.BunType,val makeAMealDeal:Boolean) {
val onePatty: Int = 1
  val twoPatties: Int = 2
  def numberOfPatty(onePatty:Int, twoPatties: Int):String ={
    if(onePatty == 1) "one" else "double"
  }

val burger: String = s"I have $doublePatty patty burger with $bunType bun!"
}

object Burger {
  sealed trait BunType // When trait is sealed, it stays in this level
  case object GlutenFree extends BunType
  case object WholeGrain extends BunType
}
