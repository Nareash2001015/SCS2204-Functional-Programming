package Tutorial_03

import scala.io.StdIn.readInt

object Q_4 {
  def main(args: Array[String]) = {

      print("Enter a number: ")
      var a: Int = readInt()

      if(a % 2 == 0) print("Even") else print("Odd")

  }
}
