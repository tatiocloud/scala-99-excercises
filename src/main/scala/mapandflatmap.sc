object mapandflatmap{

  class Phone(val name: String, val models: List[String])

  val iphone = new Phone("Apple",List("IPhone X", "Iphone 8"))
  val google = new Phone("Google",List("Pixel XL 2", "Pixel 2"))
  val samsung = new Phone("Samsung",List("Galaxy S8", "Galaxy S8 Plus"))

  val phoneList = List(iphone,google,samsung)

  phoneList.map( models => models.models)

  phoneList.flatMap(models => models.models)

  //find number divisble by 3.0

  val isThreeMultiples = (input:Int) => if((input/3.0).isWhole()) Some(input) else None

  List.range(1,11).map(list => isThreeMultiples(list))
  List.range(1,11).flatMap(list => isThreeMultiples(list))

}
