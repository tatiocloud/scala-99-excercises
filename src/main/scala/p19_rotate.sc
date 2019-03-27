object p19_rotate{
  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  val list1 = List('a', 'b', 'c', 'd', 'e')
  val list2 = List('a', 'b')

  //std built
  def rotateBuiltin[A](n:Int, ls:List[A]):List[A] ={
    val nn = n % ls.length
    println("nn: " + nn)
    val nBounded = if(ls.isEmpty) 0 else nn
    println("nbounder: " + nBounded)
    if(nBounded < 0) rotateBuiltin(nBounded + ls.length, ls)
    else (ls drop nBounded) ::: (ls take nBounded)
  }


  rotateBuiltin(3,list)
  rotateBuiltin(3,list1)
  rotateBuiltin(3,list2)
}
