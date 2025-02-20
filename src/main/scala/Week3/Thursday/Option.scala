package Week3.Thursday

object Option  extends App {
trait Pizza {
  val size: Int
  val crust: Option[String]
}


  object  Personal extends Pizza {
    override val size: Int = 7
    override val crust: Option[String] = Some("classic") // Must wrap in a Some if we ate giving it 'Something'
  }
  object  Small extends Pizza {
    override val size: Int = 7
    override val crust: Option[String] = None  // Not giving a default
  }
  object Medium extends Pizza {
    override val size: Int = 11
    override val crust: Option[String] = Some("classic")
  }

  object Large extends Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }


  val newPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("stuffed")
  }


  def whatCrust(pizza: Pizza):String = {
    pizza.crust match {
      case Some("classic") => "Classic crust"
      case Some("italian") => "Italian crust"
      case Some("stuffed") => "Stuffed crust"
      case None => "Just the default classic crust"
    }
    }
  println(whatCrust(newPizzaOrder))


  val emptyCrustPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }

  //get or else
  println(newPizzaOrder.crust.get) // I t get whatever is inside of the some
  //This will not work with the None.

  println(emptyCrustPizzaOrder.crust.getOrElse("classic"))// Either get the contents of the Some or return the default given here



  case class  ChocolateBar(filling: Option[String] )
  def getFilling(chocolateBar: ChocolateBar): String  =
    chocolateBar.filling.getOrElse("just chocolate")
    object  SaltyCaramel extends ChocolateBar(Some ("nuts"))
    object DairyMilk extends  ChocolateBar(None)
    println(getFilling(SaltyCaramel))
    println(getFilling(DairyMilk))

}