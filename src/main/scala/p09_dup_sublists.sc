object p09_dup_sublists{

  val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  def pack[A](ls: List[A]):List[List[A]] = {
    if(ls.isEmpty) List(List())
    else {
      val (packed,next) = ls span { _ == ls.head}
      if(next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
  pack(list)
}
