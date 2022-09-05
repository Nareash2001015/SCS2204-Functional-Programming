package Tutorial_06

object Q_1 {

  def encrypt(s: String, i: Int): String = {
    var y: String = s.map(x => if((x.toInt - i) < 'A'.toInt && x != ' '){
      (x.toInt - i + 26).toChar
    }  else if(x == ' '){
      ' '
    }  else {
      (x.toInt - i).toChar
    })
    y
  }

  def decrypt(s: String, i: Int): String = {
    var y: String = s.map(x => if((x.toInt + i).toInt > 'Z'.toInt && x != ' '){
      ((x.toInt - 26) + i).toChar
    } else if(x == ' '){
      ' '
    } else{
      (x.toInt + i).toChar
    })
    y
  }

  def main(args: Array[String]) = {
    var str: String = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
    println(encrypt(str.toUpperCase(), 3))
    println(encrypt(decrypt(str.toUpperCase(), 3), 3))
  }
}
