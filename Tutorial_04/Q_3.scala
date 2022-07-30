package Tutorial_04

import java.util.UUID

object Q_3 {

  case class car(name: String, price: Double)

  class carUUID(x: car){
      def generateUUID(): Unit = {
          println(s"car uuid = ${x.name} -- ${x.name.hashCode}")
      }
  }

  def main(args: Array[String]) = {
    var car1 = car("bmw 3 series", 20000)
    var car2 = car("bmw 5 series", 50000)
    var car3 = car("vw passat", 10000)
    var car4 = car("vw golf", 12000)
    var car5 = car("mazda 3", 15000)

    var carList = Array(car1, car2, car3, car4, car5)

    carList.foreach(i => new carUUID(i).generateUUID())
  }
}
