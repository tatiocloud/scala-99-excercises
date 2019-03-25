object p02 {

  val list = List(1, 1, 2, 3, 5, 8)

  println(list.takeRight(2))
  // Again, with builtins this is easy.

  def penultimateBuiltin[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  def penultimateRecursive[A](ls: List[A]): A = ls match {

    case h :: _ :: Nil => h
    case _ :: tail => penultimateRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  penultimateRecursive(list)

  def lastNthBuiltIn[A](n: Int, ls: List[A]): A = {
    if (n <= 0) throw new IllegalArgumentException
    if (ls.length < n) throw new NoSuchElementException
    ls.takeRight(n).head

  }

  lastNthBuiltIn(2, list)

  def lastNthRecursive[A](n:Int,ls:List[A]):A = {
    def lastNthR(count:Int, resultList:List[A], currList:List[A]): A = currList match {
      //case Nil if count > 0 => throw new NoSuchElementException
      case _ :: Nil => {
        resultList.head
      }
      case _:: tail =>
        lastNthR(count - 1,
          if(count > 0) resultList else resultList.tail,
          tail)
    }
    if(n < 0) throw new NoSuchElementException
    else lastNthR(n, ls,ls)
  }
  //val x = lastNthRecursive(2,list)
  val x = lastNthRecursive(2,list)

}
