//Any method which takes a single parameter can be used as an infix operator

class MyBool(x: Boolean) {
  def and(that: MyBool): MyBool = if (x) that else this
  def or(that: MyBool): MyBool = if (x) this else that
  override def toString = x.toString // using overrides explicitly
}

// implicit conversion between Boolean and MyBool
implicit def boolean2MyBool(b: Boolean): MyBool = {
  new MyBool(b)
}

val bool = new MyBool(true)

var result = true or false

println(result)

result = true and false

println(result)
