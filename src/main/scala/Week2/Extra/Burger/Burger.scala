package Week2.Extra.Burger

abstract class Burger (val doublePatty: Boolean,val bunType:Burger.BunType,val makeAMealDeal:Boolean) {

}

object Burger {
  sealed trait BunType // When trait is sealed, it stays in this level
  case object GlutenFree extends BunType
  case object WholeGrain extends BunType
}
