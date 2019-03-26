object p12decode{

  val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e, 'e')

  def pack[A](ls: List[A]):List[List[A]] = {
    if(ls.isEmpty) List(List())
    else {
      val (packed,next) = ls span {
        x => {
          val head = ls.head
          x ==  head
          //or you can refactor this to (_ == ls.head)
        }
      }
      if(next == Nil) List(packed)
      else {
        packed :: pack(next)
      }
    }
  }

  def encode[A](ls:List[A]):List[(Int,A)] =
    pack(ls) map { e => (e.length,e.head)}

  val encoded = encode(list)

  def decode[A](ls: List[(Int,A)]):List[A] =
    ls flatMap  { e => List.fill(e._1)(e._2) }


  decode(encoded)
}
