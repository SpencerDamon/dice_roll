// This app rolls a dice, and returns the roll value
//updates soon, to a variable sided dice, and multiple dice roll
fun main(){
  val dice = Dice()
  println("${dice.roll()}")

}
//This rolls the dice and returns a random number between 1 and 6
class Dice(){
  fun roll(): Int{
    val randomNumber = (1..6).random()
    return randomNumber
  
  }

}
