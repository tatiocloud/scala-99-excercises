object p13{

  val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e, 'e')

  def encodeDirect[A](ls:List[A]):List[(Int,A)] =
    if(ls.isEmpty) Nil
    else{
      val (packed,next) = ls span {_ == ls.head }
      {
        println("Packed: " + packed)
        println("Next: " + next)
        (packed.length,packed.head) :: encodeDirect(next)
      }
    }

  encodeDirect(list)
}
