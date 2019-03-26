
object TimeTest {

  case class Time(hours:Int, minutes:Int)

  def main(args: Array[String]): Unit = {
    val time = Time(1,30)
    println(time)
  }

  //stable pattern matching
  val highNoon ="12:30"

  def whatTimeIsIt(any: Any):String = any match {
    case `highNoon` => "High Noon"
    case time:Time => s"It is ${time.hours}:${time.minutes}"
    case _ => s"$any is no time"
  }

  whatTimeIsIt(highNoon)
  
  def tupleMatch(any: Any):String = any match {
    case (x,"12:00") => s"From $x to high noon"
    case _ => s"$any is no time"
  }

}
