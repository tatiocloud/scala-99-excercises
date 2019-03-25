object p05_rev{

  val list = List(1,2,3,4,5)

  def rev_recursion(ls:List[Int]): List[Int] = {
    ls match {
      case Nil => List()
      case head :: tail => rev_recursion(tail) ::: List(head)
    }
  }

  rev_recursion(list)

  def revTailRecursive(list:List[Int]): List[Int] ={

    def recursiveR(result:List[Int], currList:List[Int]): List[Int] = currList match {
      case Nil => result
      case h :: tail => {
        println(result)
        recursiveR(h::result,tail)
      }
    }
    recursiveR(Nil,list)
  }

  revTailRecursive(list)

  def revUsingFold(ls:List[Int]):List[Int] = ls.foldLeft(List[Int]()){(r,h) => h::r}
  revUsingFold(list)
}
