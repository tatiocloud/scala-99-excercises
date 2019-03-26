object lightbend{

  class Time(val hours:Int = 0, val minutes:Int){
    require(hours >= 0 || hours <= 24)
    val asMinutes = hours * 60 - minutes
  }
  val time = new Time(0,20)
  time.asMinutes
}
