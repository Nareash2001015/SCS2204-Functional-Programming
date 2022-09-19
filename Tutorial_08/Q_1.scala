package Tutorial_08
import scala.math.sqrt
import scala.math.pow

object Q_1 {
  case class Point(x: Int, y: Int) {
    var x_axis: Int = x
    var y_axis: Int = y

    def +(that: Point): Point = return Point(this.x_axis + that.x_axis, this.y_axis + that.y_axis)

    def move(dx: Int, dy: Int) = {
      this.x_axis = this.x_axis + dx
      this.y_axis = this.y_axis + dy
    }

    def distance(p1: Point): Double = {
      sqrt(pow(p1.x_axis - this.x_axis, 2) + pow(p1.y_axis - this.y_axis, 2))
    }

    def invert() = {
      var temp = this.x_axis
      this.x_axis = this.y_axis
      this.y_axis = temp
    }
  }

  def main(args: Array[String]): Unit = {
    var p1 = Point(2, 3)
    var p2 = Point(4, 6)

    var p3 = p1 + p2
    println("p1 = " + p1)
    println("p2 = " + p2)
    println("Addition of points p1 and p2 = " + p3)
    println("Distance between points p1 and p2 = " + p2.distance(p1))
    p2.invert()
    println("p2.x_axis = " + p2.x_axis)
    println("p2.y_axis = " + p2.y_axis)
    p1.move(5, 7)
    println("p2.x_axis = " + p1.x_axis)
    println("p2.y_axis = " + p1.y_axis)
  }
}
