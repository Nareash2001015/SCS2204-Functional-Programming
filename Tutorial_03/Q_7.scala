package Tutorial_03

import scala.io.StdIn.readInt
import scala.util.control.Breaks.break

object Q_7 {

  def season(month: Int): String = month match{
    case 12 | 1 | 2 => "Winter"
    case 3 | 4 | 5 => "Spring"
    case 6 | 7 | 8 => "Summer"
    case 9 | 10 | 11 => "Autumn"
    case _ => "Bogus month"
  }

  def main(args: Array[String]) = {
    print("Enter the month: ")
    var month: Int = readInt()

    print(season(month))
  }
}
