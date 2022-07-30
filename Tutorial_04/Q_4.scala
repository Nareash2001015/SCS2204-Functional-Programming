package Tutorial_04

object Q_4 {

  def printNegZero(num: Int): Unit = num match {
    case x if(x < 0) => println("Negative")
    case x if(x == 0) => println("Zero")
    case x => println("Positive")
  }

  def printOddEven(num: Int): Unit = num match {
    case x if(x % 2 == 0) => println("Even")
    case x => println("Odd")
  }

  def main(args: Array[String]): Unit ={
        printNegZero(args(0).toInt)
        printOddEven(args(0).toInt)
    }
}
