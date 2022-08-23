package Tutorial_05

object Q_6 {

  def fibonacci(n:Int):Int= n match{
    case 0 => 0
    case x if x==1 => 1
    case _ => fibonacci(n-1)+fibonacci(n-2)
  }
  def printFibo(n:Int):Unit= {
    if (n > 0) printFibo(n-1)
    println(fibonacci(n))
  }


def main(args: Array[String]) = {
    printFibo(10)
  }
}
