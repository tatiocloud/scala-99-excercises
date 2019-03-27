object p16 {

  val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  List('a, 'c, 'e, 'g, 'i, 'k)
  //simple Recursive
  def dropRecursive[A](n: Int, ls: List[A]): List[A] = {
    def dropR(c: Int, currList: List[A]): List[A] = (c, currList) match {
      case (_, Nil) => Nil
      case (1, _ :: tail) => dropR(n, tail)
      case (_, h :: tail) => h :: dropR(c - 1, tail)
    }

    dropR(n, ls)
  }

  dropRecursive(3, list)

  //Tail Recursive

  def dropTailRecursive[A](n: Int, ls: List[A]):List[A] = {
    def dropTR(c: Int, currList: List[A], result: List[A]): List[A] = (c, currList) match {
      case (_, Nil)       => {
        println("resultmmmmmm: " + result)
        result.reverse
      }
      case (1, _ :: tail) => {
        println("tail: " + tail)
        println("result: " + result)
        println("n: " + n)
        dropTR(n, tail, result)
      }
      case (_, h :: tail) => {
        println("1tail: " + tail)
        println("1element: " + _)
        println("1n: " + n)
        dropTR(c - 1, tail, h :: result)
      }
    }

    dropTR(n, ls, Nil)
  }

  dropTailRecursive(2, list)
}
