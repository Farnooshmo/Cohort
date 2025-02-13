package Week2.Extra.Burger

import Week2.Extra.Burger.BeefBurger.MediumWell

class VeggieBurger (doublePatty:String,bunType:Burger.BunType,makeAMealDeal:Boolean) extends Burger(doublePatty, bunType, makeAMealDeal) with Topping//we don't need val because it extends the burger







