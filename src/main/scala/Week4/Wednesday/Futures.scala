package Week4.Wednesday

import Week3.Friday.Eithers.{NewError, isOdd}

import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.util.{Failure, Random, Success}

object Futures extends App {
  //What are Futures?
  // these represent values that are not yet ready - but they will ve in the future.
  //I f we didn't use them, sometimes our programme would pause amd wait for ling operation to complete (for example, fetching data from a database or an API)/
  // The Future allows us to run tasks in the background (like fetching data) , without stopping the whole programme.
  //How deo we create them?
  val futureHelloWorld: Future[String] = Future {
    Thread.sleep(2000) // Pausing the thread for 2 seconds
    "Hello Future World!"
  }

  //How can we print these Futures? Not like this!******
  println("standard print line: " + futureHelloWorld) // This is printing the futures itself, rather that the value.
  //1st way -use .foreach as a callback
  futureHelloWorld.foreach(result => println(s"\n Using .foreach: $result"))

  //2nd way - use onComplete (use this when we want to handle success anf failure)
  futureHelloWorld.onComplete {
    case Success(result) => println(s"Using onComplete :$result")
    case Failure(exception) => println(s"Failure with onComplete : ${exception.getMessage}")
  }


  //3th way - using Await.result
  val waitTime: FiniteDuration = Duration(5, TimeUnit.SECONDS) //  wait 5 seconds, if you do not receive the value in 5 seconds, time out
  println("Using await :  " + Await.result(futureHelloWorld, waitTime)) //Collect it,  print it after you have waited for the time stated.
  // This will block the thread( and therefore future can not be used in parallel)
  //Use when essential.
  print(" I am printed after the futures are called.") // Proving that with .foreach and .onComplete this is printed before, so its happening while we are waiting fo the future to be return.


//task
  def additionInTheFuture(a: Int, b: Int): Future[Int] = Future {
    Thread.sleep(1000)
    a + b
  }

  val add = additionInTheFuture(2, 4)
  add.foreach(re => println(s"\n Using .foreach: $re"))

  add.onComplete {
    case Success(re) => println(s"Future completed successfully with onComplete :$re")
    case Failure(exception) => println(s"Future failed with onComplete : ${exception.getMessage}")
  }
  println("Using Await : " + Await.result(add, waitTime)) // it is always result
////
  def fetchIsOddOrErrorInTheFuture(num: Int): Future[Either[NewError, String]] = Future {
    Thread.sleep(1000)
    isOdd(num) // fetching from a different package
  }
  ///!!!!!
//why val? Because the method it is calling is already a future, and i DON'T NEED TO MAKE A NEW ONE.
  val eventualIsOddOrError: Future[Either[NewError, String]] = fetchIsOddOrErrorInTheFuture(4)
  Thread.sleep(1100)//This will force the thread to sleep before it gets to the .value in the pattern match which forces it to get the future immediately.


  //This function only cares about deciding if the future completed or not. it will not get us out of the Either. If it completes and receive either Left or the Right, it will ve a Success. If the future did not complete due to a time out, it will hit the None. This is better than our code crashing.
  // What is  .value?? This .value is immediately checking the value before the future has had time tko complete
val result = eventualIsOddOrError.value match {
  case Some(Success(complete)) => s" Future completed: $complete"
  case None => " Future did not complete in the given time."
//  case _ => " Future did not complete in the given time." // it is also valid

}

println( "isOddOrError "+ result)



  // How to combine the futures?
  // We do this when we want multiple tasks dime at once
  //Not force them to sleep, this means they will run asynchronously, in parallel on separate threads.
   val futureInt1: Future[Int]= Future{
     100
   }
  val futureInt2 : Future[Int] = Future{
    8
  }
val combinedFutureInt = for { //for comp will wait for all results to be back before it yields the final result
  number1 <- futureInt1
  number2 <- futureInt2
} yield number1 + number2

  println(Await.result(combinedFutureInt, waitTime)) // if it is less than or equal to waitTime it will show the result

  // task 1
  val futureString1: Future[String]= Future{
    "Hello"
  }
  val futureString2 : Future[String] = Future{
    "World"
  }
val concatFutureString = for {
  word1 <- futureString1
  word2 <- futureString2
} yield word1 + " " + word2
  println(Await.result(concatFutureString, waitTime))

// task 2
    val futureUser: Future[String]= Future{
      val randomDelay = Random.nextInt(2000) + 1000 // Random delay between 1-3 seconds// it can also be Random.nextInt(2000). In that case it would be between 1-2 seconds
Thread.sleep(randomDelay)
      "Alice"
    }
    val futureFood : Future[String] = Future{
      val randomDelay = Random.nextInt(2000) + 1000 // Random delay between 1-3 seconds// it can also be Random.nextInt(2000). In that case it would be between 1-2 seconds
      val littleRandomDelay = randomDelay < 2000
      Thread.sleep(randomDelay)
//     randomDelay match {
//       case  littleRandomDelay => "Salad"
//       case _ => "Pizza"
//     }
      if (randomDelay < 2000) "Salad" else "Pizza"
    }

  val concatOrder = for {
    user <- futureUser
    order <- futureFood

  } yield "User: " + user +" " + "Order: " + order

concatOrder.foreach(println)

  Thread.sleep(3000) // This ensures the object thread doesn't finish before the future has completed. ***********

}