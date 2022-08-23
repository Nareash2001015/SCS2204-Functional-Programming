package Tutorial_05

object Q_5 {

  def isEven(x: Int): Boolean = x match{
    case x if(x % 2 == 0) => true
    case _ => false
  }

//  def isEven(n:Int):Boolean= n match{
//    case 0 => true
//    case _ => isOdd(n-1)
//  }
//  def isOdd(n:Int):Boolean = !(isEven(n))

  def evenSum(n: Int): Int = n match{
    case x if(x < 2) => 0
    case x if(isEven(x)) => evenSum(x - 1) + x
    case x => evenSum(x - 1)
  }

  def main(args: Array[String]) = {
    println(evenSum(15))
  }
}
