object takeMethods{

  val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut")

  val takeWhilePredicate: String => Boolean = donut => donut.charAt(0) == 'P'
  
  //take elements which satisfies the condition
  donuts.takeWhile(takeWhilePredicate)

  //take 2 elements from right
  donuts.takeRight(2)

  //take 2 elements from left
  donuts.take(2)

}
