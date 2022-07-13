package Tutorial_03

import scala.io.StdIn.readInt

object Q_2 {
    def main(args: Array[String]) = {
      /* Question a */

        print("Enter the first number: ")
        var a: Int = readInt()
        print("Enter the first number: ")
        var b: Int = readInt()

        print("The largest number is ")
        if(a > b) print(a) else print(b)

      /* End of Question a */

      /* Question b */

//        var max: Int = (a > b) ? a : b
//        The above sytax doesn't support in Scala


      /* End of question b */

    }

}
