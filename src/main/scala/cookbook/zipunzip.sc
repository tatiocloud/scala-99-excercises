object zipunzip{

  val women = List("Kim", "Julia")
  val men = List("Al", "Terry")

  val couples = women zip men
  couples.unzip
}
