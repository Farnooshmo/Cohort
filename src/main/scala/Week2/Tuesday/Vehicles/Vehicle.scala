package Week2.Tuesday.Vehicles

 abstract class Vehicle ( val brand: String) {
   def drive : String //abstract method
   val description: String = s"This vehicle is a $brand."
 }
//Abstract - why?
//1. prevent me making (instantiating) a vehicle - have to extend it.
//2. Then why not a trait if it always is going to be extended? I want constructor parameters (brand), traits do not allow for this.
