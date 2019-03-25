object p08_duplicates {

  val list = List('a', 'a', 'a', 'a', 'b', 'a', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  //Standard Recursive
  def compressRecursive(ls: List[Any]): List[Any] = ls match {

    case Nil => Nil
    case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
  }

  compressRecursive(list)

  //Tail Recursive

  def compressTailRecursive(ls: List[Any]): List[Any] = {

    def compressR(result: List[Any], currList: List[Any]): List[Any] = currList match {
      case h :: tail => compressR(h :: result, tail.dropWhile(_ == h))
      case Nil => result.reverse
    }

    compressR(Nil, ls)
  }

  compressTailRecursive(list)

  //Functional way

  def compressFunctional(ls: List[Any]): List[Any] =
    ls.foldRight(List[Any]()) { (h, r) =>
      if (r.isEmpty || r.head != h) {
        println("H: " + h)
        println("R: " + r)
        h :: r
      }
      else {
        println(r)
        r
      }
    }

  compressFunctional(list)

}
