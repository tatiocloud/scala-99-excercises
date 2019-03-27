object p17_splitlist{

  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  //Builtin
  def splitBuiltin[A](n:Int, ls: List[A]):(List[A], List[A]) = ls.splitAt(n)
  splitBuiltin(3,list)

  //using simple Recursion
  def splitRecursive[A](n:Int, ls:List[A]):(List[A],List[A]) = (n,ls) match {

    case (_,Nil) => (Nil,Nil)
    case (0, list1) => {
      println("(0,list1 :" + list1)
      (Nil,list1)
    }
    case (n, h::tail) => {

      println("h : " + h)
      println("tail : " + tail)
      val (pre,post) = splitRecursive(n - 1, tail)
      println("Pre: " + pre)
      println("Post: " + post)
      println("HHHH : " + h)
      (h::pre, post)
    }
  }
  splitRecursive(3,list)

  def splitTailRecursive[A](n:Int, ls: List[A]):(List[A],List[A]) = {
    def splitR(curN:Int, curL:List[A], pre:List[A]):(List[A],List[A]) =
      (curN, curL) match {
        case (_, Nil) => (pre.reverse,Nil)
        case (0, list) => (pre.reverse, list)
        case (n, h::tail) => splitR(n-1,tail,h::pre)
      }
    splitR(n,ls,Nil)
  }
  splitTailRecursive(3,list)

  //functional way
  def splitFunctional[A](n:Int, ls:List[A]):(List[A],List[A]) =
    (ls.take(n),ls.drop(n))

  splitTailRecursive(3,list)
}
