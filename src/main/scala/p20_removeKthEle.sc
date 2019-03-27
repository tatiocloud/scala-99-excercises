object p20_removeKthEle {

  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def removeAt[A](n: Int, ls: List[A]): (List[A], A) = ls.splitAt(n) match {
    case (Nil, _) => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post, e)
    case (pre, Nil) => throw new NoSuchElementException
  }

  removeAt(2, list)

  //recursive
  def removeAt2[A](n: Int, ls: List[A]): (List[A], A) = {

    if (n < 0) throw new NoSuchElementException
    else (n, ls) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, h :: tail) => (tail, h)
      case (_, h :: tail) =>
        val (t, e) = removeAt2(n - 1, ls.tail)
        (ls.head :: t, e)

    }
  }

  removeAt2(2, list)

}
