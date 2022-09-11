package Tutorial_07

object Q_2 {
  def main(args: Array[String]) = {
    case class Rational(x: Int, y: Int){
      var numerator: Int = x
      var denominator: Int = y

      def -(that: Rational) = new Rational(this.numerator * that.denominator - this.denominator * that.numerator, this.denominator * that.denominator)
      override def toString = numerator + " / " + denominator
    }

    var x = Rational(3, 4)
    var y = Rational(5, 8)
    var z = Rational(2, 7)

    var k = x - y - z
    println(k)
  }
}
