package Tutorial_05

import Tutorial_05.Q_1.gcd

object Q_2 {

  def gcd(a: Int, b: Int): Int = b match{
    case x if(x == 0) => a
    case x if(x > a) => gcd(x, a)
    case x => gcd(x, a % x)
  }

  def printPrime(p: Int, n: Int = 2): Unit =n match{
    case x if(p == x) => println(p)
    case x if(gcd(p, x) > 1) => print("")
    case x => printPrime(p, x + 1)
  }

  def primeSeq(n: Int): Unit = {
    if(n > 1) {
      printPrime(n)
      primeSeq(n - 1)
    }
  }

  def main(args: Array[String]) = {
      primeSeq(15)
  }
}
