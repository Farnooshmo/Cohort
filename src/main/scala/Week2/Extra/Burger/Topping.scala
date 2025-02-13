package Week2.Extra.Burger

  trait Topping {
    def addTopping: String = "Add Topping!"
  }
    trait Salad extends Topping {
      val salad: String = "More salad?"
    }

    trait Cheese extends Topping {
      val spicy: Boolean
    }

    trait Ketchup extends Topping

    trait Mayo extends Topping {
      val garlic: Boolean = false
    }





