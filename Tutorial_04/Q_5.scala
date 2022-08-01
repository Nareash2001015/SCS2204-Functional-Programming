package Tutorial_04

import scala.Byte.MaxValue.toChar

object Q_5 {


    def toUpper(str: String): String = {
        if(str.length > 1){
            if((str.head.toInt <= 'z'.toInt) && (str.head.toInt >= 'a'.toInt))
                s"${(str.head.toInt - 32).toChar}${toUpper(str.tail)}"
            else
                s"${str.head}${toUpper(str.tail)}"
        }
        else{
            if((str.head.toInt <= 'z'.toInt) && (str.head.toInt >= 'a'.toInt))
                s"${(str.head.toInt - 32).toChar}"
            else
                s"${str.head}"
        }
    }

    def toLower(str: String): String = {
        if(str.length > 1){
          if((str.head.toInt <= 'Z'.toInt) && (str.head.toInt >= 'A'.toInt))
            s"${(str.head.toInt + 32).toChar}${toLower(str.tail)}"
          else
            s"${str.head}${toLower(str.tail)}"
        }
        else{
          if((str.head.toInt <= 'Z'.toInt) && (str.head.toInt >= 'A'.toInt))
            s"${(str.head.toInt + 32).toChar}"
          else
            s"${str.head}"
        }
    }

    def formatNames(str: String, fun: String => String): Unit = {
        print(fun(str))
    }

    def main(args: Array[String]) = {
        var names = Array("Benny", "Niroshan", "Saman", "Kumara")

        formatNames(names(0), toUpper)
        println()
        formatNames(names(1).substring(0, 2), toUpper)
        print(s"${names(1).substring(3)}\n")
        formatNames(names(2), toLower)
        println()
        formatNames(names(3).substring(0, 1), toUpper)
        print(s"${names(3).substring(1, names(3).length - 1)}")
        formatNames(names(3).substring(names(3).length - 1), toUpper)
    }
}
