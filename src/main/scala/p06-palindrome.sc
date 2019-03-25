object p06_palindrome{

  val list = List(2,1,3,1,2)

  def reverse(ls:List[Int]):List[Int] = ls match {
    case Nil => List()
    case head :: tail => reverse(tail) :+ head
  }

  reverse(list)

  val rev = reverse(list)

  val len = list.length

  val last2 = list == rev
}
