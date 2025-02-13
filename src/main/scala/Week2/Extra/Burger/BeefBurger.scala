package Week2.Extra.Burger

class BeefBurger (doublePatty: String,bunType: Burger.BunType,makeAMealDeal:Boolean,doneness:BeefBurger.Doneness) extends Burger(doublePatty, bunType, makeAMealDeal){
val beefBurger: String = s"$doneness please!"
}




object BeefBurger {
  sealed trait Doneness
  case object Rare extends Doneness
  case object MediumRare extends Doneness
  case object Medium extends Doneness
  case object MediumWell extends Doneness
  case object WellDone extends Doneness
}

