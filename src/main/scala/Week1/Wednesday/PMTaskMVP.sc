//1
val watermelon = 3
//2
 if(watermelon > 5){
   s"John! You can't carry $watermelon watermelons, you risk yourself and watermelons being damaged"
 } else if(watermelon <= 5 && watermelon > 3){
   "Need a bag!"
 } else if(watermelon <= 3 && watermelon >= 1) {
   "Doesn't need a bag!"
 } else {
   " Please enter valid number of watermelon"
 }

// 3 s interpolation is most appropriate here.
if(watermelon > 5){
  s"John! You can't carry $watermelon watermelons, you risk yourself and watermelons being damaged"
} else if(watermelon <= 5 && watermelon > 3){
  s"Need a bag to carry $watermelon watermelons."
} else if(watermelon <= 3 && watermelon >= 1) {
  s"Doesn't need a bag to carry $watermelon watermelons."
} else {
  " Please enter valid number of watermelon"
}
//4
val bag: Boolean = true

//5
if(watermelon <=5 && bag || watermelon <=3 && !bag){
  "You can buy watermelon"
} else{
  "You can not buy watermelon"
}

//6
val watermelonPrice = 1.397
val totalCost = watermelonPrice * watermelon
f"$totalCost%.2f"
//Q it was an int, why it became a string?

