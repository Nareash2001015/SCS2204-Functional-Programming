package Tutorial_04


import scala.io.StdIn.readDouble

object Q_1 {

  def calculateInterest(amount: Double): Double = amount match {
    case x if(x < 20000) => x * 0.02
    case x if(x < 200000) => x * 0.04
    case x if(x < 2000000) => x * 0.035
    case x => x * 0.065
  }

  def main(args: Array[String]) = {
      print("Enter the deposit amount: ")
      var amount: Double = readDouble()
      println("The amount of interest for " + amount + " is " + calculateInterest(amount) + ".")
  }
}
