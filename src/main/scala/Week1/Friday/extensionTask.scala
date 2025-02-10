
//1 extension
import scala.io.StdIn.readLine

object GreetingInTerminal {
  def main(args: Array[String]): Unit = {
    println("Please inter your name:")
    val inputName = readLine()
    println("Enter some greeting in the terminal!")
    val greeting = readLine()
    if(greeting.toLowerCase == "hello"){
      println(s"Hello $inputName")
    }else {
      println(s"have a nice day!")
    }

  }
}


//2
object ConversationInterminal {
  def main(args: Array[String]): Unit = {
    println("Hi there! What's your name?")
    val name = scala.io.StdIn.readLine()

    println(s"Nice to meet you $name, What do you choose? 'weather','joke', or 'bye'?")
    val inputTopic = readLine().toLowerCase()

      if (inputTopic =="weather"){
        println(s"Dear $name, Rain or shine, the day is yours to make!🌟")
      } else if (inputTopic == "joke") {
        println("Why was the Scala developer always calm? Because they know how to stay 'immutable'!")
      } else if  (inputTopic == "bye") {
        println(s"Bye$name, Have a great day!")
      }
      else{ println("Type from this list please: 'weather','joke', or 'bye'?")
    }

  }
}