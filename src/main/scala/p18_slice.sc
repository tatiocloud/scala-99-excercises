object p18_slice{

  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def sliceStd[A](n:Int, k:Int, ls: List[A]):List[A] =
    ls.slice(n,k)
  sliceStd(3,5,list)


  //Simple Recursive Way
  def sliceRecursive[A](start:Int, end:Int,ls:List[A]):List[A] =
    (start,end, ls) match {
      case (_,_,Nil)                  => Nil
      case (_,e,_)          if e <= 0 => Nil
      case (s,e,h :: tail)  if s <= 0 => {
        println("s1: "+ s + " e1: "+ e+" hh1:"+h)
        h:: sliceRecursive(0,e-1,tail)
      }
      case (s,e,h :: tail)            => {

        println("s: "+ s + " e: "+ e+" hh:"+h)
        sliceRecursive(s - 1, e - 1, tail)
      }
    }
  sliceRecursive(3,5,list)

  //Tail Recursive
  def sliceTailRecursive[A](start:Int, end:Int,ls:List[A]):List[A] = {
    def sliceR(count:Int, currList:List[A], result: List[A]):List[A] =
      (count,currList) match {
        case (_,Nil)                    => Nil
        case (c, h::tail) if end <= c   => result.reverse
        case (c, h::tail) if start <= c => sliceR(c + 1, tail,h::result)
        case (c, _::tail)               => sliceR(c+1, tail, result)
      }
    sliceR(0,ls,Nil)
  }
  sliceTailRecursive(3,5,list)

  //more concise way as many steps can be merged
  def sliceTailRecursive1[A](start:Int, end:Int, ls:List[A]):List[A] = {
    def sliceR(count:Int, currList:List[A], result:List[A]):List[A] = {
      if(currList.isEmpty || count >= end) result.reverse
      else sliceR(count + 1,currList.tail,
        {
          println("count: " + count +", start: " + start + ", end: " + end + ", "+ result)
          if(count >= start) currList.head :: result else result
        }
      )
    }
    sliceR(0,ls,Nil)
  }
  sliceTailRecursive1(3,5,list)

  val start = 3
  start max 0

  //functional way
  def sliceFunctional[A](start:Int, end:Int, ls:List[A]):List[A] =
    ls drop(start) take( end - start)

  sliceFunctional(3,5,list)
}
