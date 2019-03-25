import javax.naming.spi.DirStateFactory.Result

object foldleftFunction{

  case class SalaryComponent(componentType: String, amountPercentage: Double)

  val hra = SalaryComponent("benefit",40)
  val medical = SalaryComponent("benefit",5)
  val pension = SalaryComponent("deduction",3)
  val incometax = SalaryComponent("deduction",20)

  val components: List[SalaryComponent] = List(hra,medical,pension,incometax)

  components.foldLeft(15000.0){ (salary:Double, component: SalaryComponent) =>
    component.componentType match {
      case "benefit" => salary * (1 + component.amountPercentage/100)
      case "deduction" => salary * ( 1 - component.amountPercentage/100)
    }
  }

  def operation(list: List[Int], f: (Int,Int) => Int, result: Int): Int = {
    list match {
      case Nil => result
      case head::tail => operation(tail, f,f(result,head))
    }
  }
  val sum = (a:Int, b:Int) => a + b
  val product = (a:Int, b:Int) => a*b

  val list = List.range(1,6)
  operation(list,sum,0)
  operation(list,product,1)

}
