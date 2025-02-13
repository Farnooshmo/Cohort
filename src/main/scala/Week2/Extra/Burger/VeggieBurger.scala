package Week2.Extra.Burger

class VeggieBurger (doublePatty: Boolean,bunType: Burger.BunType,makeAMealDeal:Boolean) extends Burger(doublePatty, bunType, makeAMealDeal) with Topping
//we don't need val because it extends the burger

object BurgerLogic extends  App {
  val veggieBurger = new VeggieBurger(true, Burger.GlutenFree, false) with Salad with Cheese with Mayo {
    override val spicy: Boolean = false
    override val garlic: Boolean = true
  }

  println(veggieBurger)
  println(veggieBurger.whereAmI)
  println(veggieBurger.spicy)
  println(veggieBurger.bunType)

}


