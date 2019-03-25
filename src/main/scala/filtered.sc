object filtered {

  def findPerfectRoots(ls: List[Int]): List[Int] = {
    ls match {
      case Nil => Nil
      case head :: tail => if (Math.sqrt(head).isWhole()) head :: findPerfectRoots(tail)
      else findPerfectRoots(tail)
    }

  }

  findPerfectRoots(List.range(1, 101))

  val findPerfectRootsFunction = (number: Int) => Math.sqrt(number).isWhole()

  List.range(1, 101).filter(findPerfectRootsFunction)
  List.range(1, 101).filterNot(findPerfectRootsFunction)

  case class Book(name: String,
             publisher: String,
             cost: Double)

  val books = List(
    new Book("Scala programming", "Artima", 32.0),
    new Book("Functional Programming in Scala", "manning", 23.79),
    new Book("Scala for Impatient", "Addision-Wesley", 28.79),
    new Book("Scala  Cookbook", "Addision-Wesley", 18.79),
    new Book("Scala Puzzlers", "Artima", 128.79)
  )

  books.filter(book => book.cost < 30.0).map(book => book.name)

  books.find(book => book.cost < 30).map(book => book.name)

  //Partitions to return 2 sets, one with filter and filternot
  private val tuple = books.partition(book => book.cost < 30.00)

  tuple._1.map(book => book.name)

  for{
    book <- books if book.cost < 30.00
  } yield book.name


}

