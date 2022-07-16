package Tutorial_03

import scala.io.StdIn.readInt

object Q_3 {
  def main(args: Array[String]): Unit = {
      /* Question a */

        print("Enter the first number: ")
        var a: Int = readInt()

        print("Enter the second number: ")
        var b: Int = readInt()

        print("Enter the third number: ")
        var c: Int = readInt()

        print("The largest number is ")
        if(a > b){
          if(a > c) print(a) else print(c)
        }else{
          if(b > c) print(b) else print(c)
        }

      /* End of Question a */

    /* Question b */

    //        var max: Int = (a > b) ? a : b
    //        The above sytax doesn't support in Scala


    /* End of question b */
  }
}
