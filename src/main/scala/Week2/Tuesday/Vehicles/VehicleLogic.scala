package Week2.Tuesday.Vehicles

object VehicleLogic extends App{
println("\nCar\n")
  //Car is a Class
  val ford = new Car("Ford", "Petrol")
  println(ford.fuelType)//coming from  car
  println(ford.drive)//Come from Vehicle, override in Car
  println(ford.brand)//Come Vehicle
  println(ford.description)//Come from Vehicle
println("\n -----ElectricCar-----\n")
  val electricFord = ElectricCar("Ford")// new ElectricCar object
  println(electricFord.fuelType)// a new ElectricCar object
  println(electricFord.drive)//
  println(electricFord.brand)//
  println(electricFord.description)//
  println(electricFord.noisyToDrive)// coming from ElectricCar
  println(electricFord.timeToCharge)//
  println(electricFord.charge)//

}
