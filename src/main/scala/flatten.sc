object flatten{

  val donuts1: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  val donuts2: Seq[String] = Seq("Vanilla", "Glazed")

  val listOfDonuts = List(donuts1,donuts2)

  listOfDonuts.flatten

}
