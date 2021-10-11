// This app rolls a dice, and returns the roll value
//updates soon, to a variable sided dice, and multiple dice roll
fun main(){
  val myFirstDice = Dice(6)
  println("${myFirstDice.roll()}")

}
//This rolls the dice and returns a random number between 1 and 6
class Dice(val numSides: Int){
  fun roll(): Int{
    val randomNumber = (1..numsides).random()
    return randomNumber
  
  }

}
