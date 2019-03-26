object splitseqAndSliding{
  val x = List(15, 10, 5, 8, 20, 12)

  val lessThan10Function : Int=>Boolean = _ > 10
  //groupby
  //This will return a Map with
  // Key as boolean
  //Value as List(sublist)
  val grpBy = x.groupBy(lessThan10Function)
  //get elements less than 10
  grpBy(false)

  //use partition with same predicate
  //This will Return you a tupple of List

  val partitioned = x.partition(lessThan10Function)

  //now use span
  //this will return tuple of 2, first elements
  // which satisfies the predicate
  // next the opposite.

  val spaned = x.span(_< 20)

  // now use splitAt.
  //this will return 2 sublists with indexed split at index.
  val splited = x.splitAt(1)


  //Now use sliding or windowing
  //this will create list based on size(size od array)
  // and window size(step) or how many elements it should jump
  val sliced = x.sliding(2).toList
  println(x)

  val slicedWithStep1 = x.sliding(2,1).toList
  val slicedWithStep2 = x.sliding(2,2).toList
  val slicedWithStep3 = x.sliding(2,3).toList
  val slicedWithStep4 = x.sliding(2,4).toList
}
