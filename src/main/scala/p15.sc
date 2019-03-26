object p15{

  val list = List('a','b','c','d')

  def duplicateNTimes[A](n:Int, ls:List[A]):List[A]
   = ls flatMap { List.fill(n)(_) }

  duplicateNTimes(3,list)
}
