object foryeild {

  class Phone(val companyName: String, val models: List[Model])

  class Model(val name: String, val price: Double, val size: Double)

  val iphonex = new Model("Iphone X", 800, 5.7)
  val iphone8 = new Model("Iphone 8", 700, 5.9)
  val s8 = new Model("S8", 650, 6.2)
  val s8Plus = new Model("S8Plus", 680, 6.1)

  val pixel2XL = new Model("Pixel 2XL", 600, 6.3)
  val pixel2 = new Model("Pixel 2", 500, 6.1)

  val iphone = new Phone("Apple", List(iphone8, iphonex))
  val google = new Phone("Google", List(pixel2, pixel2XL))
  val samsung = new Phone("Samsung", List(s8, s8Plus))

  val phones = List(iphone, google, samsung)


  phones.flatMap { phone =>
    phone.models.filter { model =>
      model.price < 700.00
    }.map {
      budgetPhone => s"${budgetPhone.name} ${budgetPhone.size}"
    }
  }

  //use for - yield

  for {
    phone <- phones
    model <- phone.models if model.price < 700.00
  } yield s"${phone.companyName} ${model.name}"

  for{
    phone1 <- phones
    phone2 <- phones if phone1.companyName == phone2.companyName
    model1 <- phone1.models
    model2 <- phone2.models if model1 != model2 && model1.size < 6.0 && model2.size < 6.0
  } yield s"${phone1.companyName} ${model1.name}"

}
