//If Else
//Depending on the weather. tell me what to wear.
val weather: String = "hot"
if (weather == "hot"){
  s"It is $weather, no coat needed."
}else {
  s"You need a coat, it is $weather "
}
// if true --> hits the first string inside the 'if'
// if false --> hits the second string inside the 'else'

if(weather.toLowerCase == "hot"){
  s"It is $weather, no coat needed."
} else if (weather == "raining"){
  s"It is $weather, take a coat with a hood."
}else {
  s"$weather is not valid, please enter raining or hot"
}

//Multiple options
val season: String = "winter"
  if (weather.toLowerCase == "cold" || season.toLowerCase == "winter"){
    s"It is$weather, take a coat"
  }else{
    "A light jacket is fine"
  }


// task 1

val score: Int= 30
if (score <= 100 && score >= 90){
  " Your grade is A"
}else if( score <= 89 && score >= 80){
  " Your grade is B"
} else if(score <= 79 && score >= 70){
  " Your grade is C"
} else if (score <= 69 && score >= 60){
  " Your grade is D"
}else if (score <= 59 && score >= 50){
  " Your grade is E"
}else if (score <= 49 && score >= -49){
  " Your grade is F"
}


val age: Int = 1
if(age >= 18) {
  " you can watch 18, 15, 12A, PG ans U films"
} else if (age >=15 ){
  " you can watch 15, 12A, PG ans U films"
} else if (age >=12 ){
  " you can watch 12A, PG ans U films"
} else if (age >=8 ){
  " you can watch  PG ans U films"
}else if (age >=4 ){
  " you can watch   U films"
}else{
  " you are too young to watch films"
}