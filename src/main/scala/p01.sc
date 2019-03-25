object p01{

  val list = List(1, 1, 2, 3, 5, 8)

  //Scala's built in methods
  private val last = list.last
  println(last)

  //Recursive
  def lastRecursive [A](ls:List[A]):A = ls match {

    case h :: Nil => h
    case _ :: tail => {
      println("Tail" + tail)
      lastRecursive(tail)
    }
    case _ => throw new NoSuchFieldException
  }
  lastRecursive(list)

}
