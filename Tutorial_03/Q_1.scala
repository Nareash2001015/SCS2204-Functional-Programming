package Tutorial_03

object Q_1 {
  def main(args: Array[String]) = {
    var absVal = (a: Int) => {if (a < 0) -a else a}
    print(absVal(-5))
  }
}
