object p04{

  val list = List(1, 1, 2, 3, 5, 8)

  //built in methods
  def lengthBuiltIn[A](ls:List[A]): Int = ls.length
  lengthBuiltIn(list)

  //recursive method
  def lengthRecursive[A](ls:List[A]):Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }
  lengthRecursive(list)

  def lengthTailRecursive(ls:List[Int]):Int = {

    def lengthR(result:Int, curList:List[Int]):Int = curList match {
      case Nil => result
      case _ :: tail => lengthR(result + 1, tail)
    }
    lengthR(0,ls)
  }
  lengthTailRecursive(list)

  //pure functional solution
  def lengthFunctionalLeft[A](ls: List[A]): Int = ls.foldLeft(0) {(c,_) => c + 1}
  lengthFunctionalLeft(list)

}
