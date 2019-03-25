object zips{

  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  val donutPrices: Seq[Double] = Seq(1.5, 2.0, 2.5,4.0)

  donuts zip donutPrices
  
}
