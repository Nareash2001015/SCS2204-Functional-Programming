package Tutorial_03

import scala.io.StdIn.{readChar, readInt}

object Q_9 {

  def calculate(op1: Double, op2: Double, opr: Char): Double = opr match{
    case '+' => op1 + op2
    case '-' => op1 - op2
    case '*' => op1 * op2
    case '/' => op1 / op2
    case _ => -1
   }

  def main(args: Array[String]) = {
    print("Enter the operator: ")
    var opr: Char = readChar()

    print("Enter the first operand: ")
    var op1: Double = readInt()

    print("Enter the second operand: ")
    var op2: Double = readInt()

    if(calculate(op1, op2, opr) == -1) print("Invalid operator") else print(calculate(op1, op2, opr))
  }
}
