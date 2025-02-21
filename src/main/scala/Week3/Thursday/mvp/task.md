Afternoon Task: Pattern matching, options and enumeration
MVP:
1) When given an input of a string, name of a country, you need to return a string of that
   country’s capital city, for example “France” should return “Paris”, “England” should return
   “London” etc.
   You must:
- Use pattern matching.
- Think about how you will deal with countries you have not included.
- Think about what happens when someone has entered a country in all lowercase/
  uppercase or mixed?
- Think about how you account for unneeded white spaces entered (e.g. " England ")?
2)
a) Create a sealed trait called ‘Animal’.
b) Create different Animals that extend the Animal trait from 2a. We are going to pattern
match in 2c so consider how are going to allow for an exhaustive match.
c) Using pattern matching, return a string, which is a fact about the animals from 2b.
e.g. case Pig => "Can fly."
3) A Person case class requires the fields given in the table below. Only some of them are given
   at the input. The others, you’ll need to calculate.

![Screenshot 2025-02-20 at 16.12.16.png](Screenshot%202025-02-20%20at%2016.12.16.png)

   a) Write a method called createPerson, with the return type Person. This method will accept
   an InputPerson case class (this will contain all Given at input = true). This method will
   calculate the missing fields and return a Person.
   Consider:
- Readability.
- Single source of responsibility (HINT: this doesn’t all need to be in one big method, the
  createPerson method could call another.)
  b) Create a method called horoscope. This method should accept a LocalDate and return a
  tuple of the star sign and their horoscope. Use pattern matching in your method.

  Extension:
1)
a) Add speciesName: String as a parameter to your previously created animals from MVP
Q2. e.g. A Whale could have the speciesName Blue whale, Fin Whale, Sei Whale...
b) We are going to expand on our animal fact pattern match from MVP Q2c.
Given the below list of endangered animals:
val criticallyEndangered: List[String] = List("Black Rhino", "African forest Elephant",
"Orangutan", "Hawksbill Turtle", "Sunda Tiger", "Javan Rhino")
Add if guards to your animal facts pattern match so that if the speciesName matches one
in the above endangered species list, it should include the fact that the species is
endangered.
e.g. Rhino with the speciesName Black Rhino would include the fact and return "The
Black Rhino is a critically endangered species".
2) The answer to EXT Q1b using pattern matching is not exhaustive when using if guards. Can
   you make this method exhaustive for pattern matching?
   Research:
   Run the method below and look at the output.
   What is happening here?
   Is there any way to get around this and make the below method work as expected?

![Screenshot 2025-02-20 at 16.24.41.png](Screenshot%202025-02-20%20at%2016.24.41.png)