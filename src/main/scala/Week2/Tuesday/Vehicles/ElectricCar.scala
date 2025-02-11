package Week2.Tuesday.Vehicles

case class ElectricCar (override val brand : String) extends Car(brand, "Electric") with Electric {
  override val timeToCharge: Int = 8
  val noisyToDrive: Boolean = false//  this is specific to ElectricCar
}
//override val -why?
//Class -> Case class.Case class will autogenerate the val field, we also have the val field being passed down with inheritance.
//We need to explicitly redefine the inherited val.

//8 if it is in the current place it is the same everytime. if it goes to (override val brand : String, override val fuelType: String, time to chare: 8)it became changable everytime,