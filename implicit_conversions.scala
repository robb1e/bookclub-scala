class Superstring(value: String) {

  def supersize: String = {
    value.toUpperCase
  }
}

implicit def string2Superstring(str: String): Superstring = {
  new Superstring(str)
}

val result = "supersize me".supersize

println(result)
