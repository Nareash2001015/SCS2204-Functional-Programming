package Tutorial_07

object Q_1 {
  def main(args: Array[String]) = {
    case class Rational(x: Int, y: Int){
      var numerator: Int = x
      var denominator: Int = y

      def neg = numerator = -numerator
      override def toString = numerator + " / " + denominator
    }

    var r1 = Rational(5, 6)
    r1.neg
    println(r1)
  }
}
