package Week2.Extra.Burger

class ChickBurger(doublePatty: String,bunType: Burger.BunType,makeAMealDeal:Boolean,grilledOrFriedChicken: String) extends Burger(doublePatty, bunType, makeAMealDeal){
  def grilledOrFried():String = {
    if(grilledOrFriedChicken.toLowerCase == "grilled") "grilled chicken" else "fried chicken "

  }
}
