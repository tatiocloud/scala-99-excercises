object tuple2list{

  val listOfStrings = List("ram:revathi","rama:sita","krishna:rukmini","shiva:uma")
  val tuple = listOfStrings.map(string =>{
    val split = string.split(":")
    (split(0),split(1))
  })


  //now convert tuple to list of string(plain)

  tuple.map(x => x._1).toList
  //list of list
  tuple.map(x => List(x._1,x._2)).transpose

  tuple.foldRight(
    (List[String](),List[String](),List[String]())
  )((a,b)=> {
    println("A"+a)
    println("B"+b)
    (a._1::b._1,a._2::b._2,a._1::b._3)
  })

  //using for-yield
  for{
    split <- listOfStrings.map(x => x.split(":"))
  } yield List(split(0),split(1))
}
