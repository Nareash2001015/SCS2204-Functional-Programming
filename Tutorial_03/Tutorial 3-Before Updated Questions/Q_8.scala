package Tutorial_03

import scala.io.StdIn.{readChar, readDouble}


object Q_8 {
  def main(args: Array[String]) = {
    print("Do you want to covert celcius to Farenheit(y / n): ")
    var opt: Double = readChar()

    if(opt == 'y'){
      print("Enter the temperature in celcius: ")
      var cel: Double = readDouble()
      var far: Double = 32 + (9.0 * cel) / 5
      print(cel + " celcius = " + far + " farenheit")
    }else{
      print("Enter the temperature in farenheit: ")
      var far: Double =  readDouble()
      var cel: Double = (5.0 / 9) * (far - 32)
      print(far + " farenheit = " + cel + " celcius")
    }

  }
}
