package Week2.Extra.Burger

object BurgerLogic extends  App {
  val veggieBurger = new VeggieBurger("one", Burger.GlutenFree, false) with Salad with Cheese with Mayo {
    override val salad: String = "Please add more salad! If it is possible!"
    override val spicy: Boolean = true
    override val garlic: Boolean = true
    override val burger: String = s"I have a yummy $doublePatty burger with $bunType bun!"
  }
  val beefBurger = new BeefBurger("double", Burger.WholeGrain, false,BeefBurger.WellDone)
  val chickenBurger = new ChickBurger("one", Burger.GlutenFree, true,"grilled")


  println(veggieBurger.salad)
  println(veggieBurger.burger)
  println(veggieBurger.addTopping)
  println(veggieBurger.spicy)
  println(veggieBurger.bunType)
  println(beefBurger.beefBurger)
  println(chickenBurger.grilledOrFried())

}