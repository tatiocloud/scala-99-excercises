object patternmatch {

  val list = List.range(1, 11)

  def reverse(ls: List[Int]): List[Int] = {
    ls match {
      case Nil => List[Int]()
      case head :: tail => reverse(tail) :+ head
    }
  }

  reverse(list)

  def pickEvenPosition(ls: List[Int]): List[Int] = {
    ls match {
      case Nil => List[Int]()
      case List(_) => List[Int]()
      case head1 :: head2 :: tail => head2 :: pickEvenPosition(tail)
    }
  }
  val list1 = List.range(1, 11)
  pickEvenPosition(list1)
}
