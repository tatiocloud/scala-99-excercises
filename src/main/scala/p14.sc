object p14 {

  val list = List('a', 'b', 'c', 'a', 'd', 'e')

  def duplicate[A](ls: List[A]): List[A] = ls flatMap { e => List(e, e) }

  duplicate(list)
}
