object p10{

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

  encode(list)

  def encodeModified[A](ls: List[A]):List[Any] =
    encode(ls) map { t => if(t._1 == 1)t._2 else  t}

  encodeModified(list)

  def encodeModified2[A](ls:List[A]):List[Either[A,(Int,A)]] =
    encode(ls) map { t => if(t._1 == 1) Left(t._2) else Right(t)}
  encodeModified2(list)

}
