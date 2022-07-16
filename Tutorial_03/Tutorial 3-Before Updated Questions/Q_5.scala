package Tutorial_03

object Q_5 {

  def fun(a: Int, b:Int) = {
    if(a == 1){
      if(b == 1){
        println("***")
      }else{
        println("###")
      }
      println("===")
    }
  }

  def main(args: Array[String]) = {
      fun(1, 2)
      fun(1, 3)
      fun(2, 3)
      fun(2, 2)
  }
}
