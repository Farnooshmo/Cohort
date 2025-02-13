package Week2.Extra.Burger

  trait Topping  {
    def whereAmI: String = "I am in Topping!"
  }
    trait Salad extends Topping
    trait Cheese extends Topping {
      val spicy :Boolean
    }
    trait Ketchup extends Topping
    trait Mayo extends Topping {
      val garlic: Boolean = false
    }





