// Great for roll playing games such as D&D
//This app rolls 6 dice, and returns the number of die sides and the roll value

fun main(){
  val myFirstDice = Dice(4)
  val mySecondDice = Dice(6)
  val myThirdDice = Dice(8)
  val myFourthDice = Dice(10)
  val myFifthDice = Dice(12)
  val mySizthDice = Dice(20)
  
  println("Your ${myFirstDice.numSides} sided die roll is ${myFirstDice.roll()}!")
  println("Your ${mySecondDice.numSides} sided die roll is ${mySecondDice.roll()}!")
  println("Your ${myThirdDice.numSides} sided die roll is ${myThirdDice.roll()}!")
  println("Your ${myFourthDice.numSides} sided die roll is ${myFourthDice.roll()}!")
  println("Your ${myFifthDice.numSides} sided die roll is ${myFifthDice.roll()}!")
  println("Your ${mySizthDice.numSides} sided die roll is ${mySizthDice.roll()}!")
}
//This rolls the dice and returns a random number between 1 and 6
class Dice(val numSides: Int){
  fun roll(): Int{
    val randomNumber = (1..numSides).random()
    return randomNumber
  
  }

}
