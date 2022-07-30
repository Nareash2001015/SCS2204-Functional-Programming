package Tutorial_04

object Q_2 {
  case class shoppingCart(name: String, price: Double, quantity: Int)

  def printItemList(itemList: Array[shoppingCart]) = {
    itemList.foreach(x => println(x.quantity + " " + x.name + " " + x.price + " each"))
  }

  def createItem(name: String, price: Double, quantity: Int): shoppingCart  = {
      var item = shoppingCart(name, price, quantity)
      item
  }

  def checkVanilla(itemList: Array[shoppingCart]): Unit = {
      itemList.foreach(i => if(i.name.toLowerCase().contains("vanilla"))
                                  println(i.name)
                            else
                                  println("Found another"))
  }

  def main(args: Array[String]) = {

    var item1 = createItem("Vanilla ice cream", 3.99, 13)
    var item2 = createItem("Chocolate biscuits", 4, 6)
    var item3 = createItem("Cupcakes", 7.77, 7)

    var itemList = Array(item1, item2, item3)

    printItemList(itemList)
    println()
    checkVanilla(itemList)
  }
}
