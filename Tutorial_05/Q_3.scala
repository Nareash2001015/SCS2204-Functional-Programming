package Tutorial_05

object Q_3 {

  def sum(i: Int): Int = i match{
    case 1 => 1
    case x if(x > 1) => sum(x - 1) + x
  }

  def main(args: Array[String]) = {
    println(sum(5))
  }
}
