package Week3.Thursday

object PatternMatching extends  App {
  val weather: String = "Cold"

  if (weather.toLowerCase == "cold") {
    println(s"It is $weather! Take a coat.")
  } else if (weather == "raining") {
    println(s"It is $weather! Take an umbrella.")
  } else {
    println(s"$weather is not valid")
  }
  weather.toLowerCase match {
    case "cold" => println(s"It is $weather! Take a coat.")
    case "raining" => println(s"It is $weather! Take an umbrella.")
    case _ => println(s"$weather is not valid") //Wildcard - this will catch anything else
  }


  //********
  val numOfWatermelons: Int = 7
  numOfWatermelons match {
    case 1 | 2 | 3 => println("He can carry them without a bag")
    case 4 | 5 => println("He needs a bag")
    case x => println(s"$x is invalid") // if you want ti use interpolation with an int, need to assign it to x rather than  _
  }

  abstract class Notification // have to extend this because it is abstract

  case class Email(sender: String, title: String, body: String) extends Notification

  case class Text(sender: String, body: String) extends Notification

  case class VoiceNote(sender: String, lengthOfBody: Int) extends Notification

  val notification: Notification = Text("Mum", "Where are you?")
  //  val notification: Notification = VoiceNote ("Mum", 5)
  notification match {
    case Email(sender, title, body) => println("Email from" + sender)

    case Text(sender, body) if sender == "Mum" => println("Text from" + sender + ". Message: " + body)
    case Text(sender, body) => println("Text from" + sender)
    case VoiceNote(sender, lengthOfBody) => println("Voice note from" + sender + "  Length" + lengthOfBody)
  }

//Task 1 morning
  // here because we are in the object we need to put s"American Hot is $pizza" in print line
  val pizza: String = "Sweet"
  pizza.toLowerCase match {
    case "spicy" => println(s"American Hot is $pizza")
    case "sweet" => println(s"Hawaiian is $pizza")
    case "vegetarian" => println(s"Super Veg is $pizza")
    case _ => println("select between sweet and spicy and vegetarian toppings")
  }

//Task 2 Morning
  val pizzaSize: Int = 7
  pizzaSize match {
    case 7 => println("personal")
    case 9 => println("small")
    case 11 => println("medium")
    case 14 => println("large")
    case _ => println("Enter a valid size")
  }
//Task 3 Morning
  case class Pizza(size: Int, crust :String)
  val pizzaOrder: Pizza = Pizza(14, "stuffed")
  val getPrice  = pizzaOrder match {
    case Pizza(7, "classic") => 5.99
    case Pizza(9, "classic") => 10.99
    case Pizza(9, "italian") => 10.99
    case Pizza(11, "classic") => 12.99
    case Pizza(11, "italian") => 12.99
    case Pizza(11, "stuffed") => 15.98
    case Pizza(14, "classic") => 14.99
    case Pizza(14, "italian") => 14.99
    case Pizza(14, "stuffed") => 17.98
    case _ => "Enter a valid pizza"
  }
  println(getPrice)





}
